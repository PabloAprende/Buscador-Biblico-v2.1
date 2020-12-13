package modelo;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.StringTokenizer;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Imprimir implements Printable { 
	
	private StringTokenizer lineasdetexto; // Se obtienen las lineas de texto del JTextArea, la linea de texto finaliza cuando se encuentra el caracter de nueva linea \n	
	private int totallineas; // Se obtiene el total de lineas de texto
	private int[] paginas; // Arreglo de número de paginas que se necesitaran para imprimir todo el texto
	private String[] textoLineas; // Lineas de texto que se imprimiran en cada hoja
	
	public void imprimir(Abrir_Leer_Buscar x, JTextField expresion, String version, JTextArea resultados) {
		
		lineasdetexto = new StringTokenizer(resultados.getText(), "\n", true);
		totallineas = lineasdetexto.countTokens();
		
		String cadena = "\n\n\n                                               BuscadorBiblicoLiteral          --- version 1.0  2020 ---";		
		String espySalt = "\n                               ";
		if (x.obtenConsidencias() == 1) {
			cadena += espySalt + "<" + x.obtenConsidencias() + "> versiculo encontrado para <" + expresion.getText() + "> en <" + version + ">\n\\n\\n\\n" + modificadordeCadena(resultados);
		} else {
			cadena += espySalt + "<" + x.obtenConsidencias() + "> versiculos encontrados para <" + expresion.getText() + "> en <" + version + ">\n\n\n\n" + modificadordeCadena(resultados);			
		}
		
		lineasdetexto = new StringTokenizer(cadena, "\n", true);
		totallineas = lineasdetexto.countTokens();
		imprimirNomina();			
	}	
	
	public String modificadordeCadena(JTextArea resultados) {

		int limiteCaracteres = 100; // establecemos el limite de caracteres para no salirnos de la hoja
		String cadenaJTA = resultados.getText(); //obtengo la cadena	
		String versiculoNew = "";
		
		//itera la cantidad de veces como lineas haya
		for(int i=0 ; i<totallineas/2 ; i++ ) {	
			if(cadenaJTA.length() >= limiteCaracteres) { 
	
				String segundaParte;
				//resolver que si aparece un salto de linea antes que los 110 caracteres permitidos, se corte la linea.
				if(cadenaJTA.substring(0,limiteCaracteres).contains("\n")) {
					String parteUnica = cadenaJTA.substring(0,cadenaJTA.indexOf("\n"));
					versiculoNew += "\n\n " + parteUnica; 
				}else {
					String primeraParte = cadenaJTA.substring(0,limiteCaracteres);
					try {
						segundaParte = cadenaJTA.substring(limiteCaracteres,cadenaJTA.indexOf("\n"));
						
					} catch(Exception e) {
						segundaParte = cadenaJTA.substring(limiteCaracteres,cadenaJTA.length());	
						versiculoNew += "\n\n " + primeraParte + "\n       " + segundaParte; 
							
						break;
					}					
					versiculoNew += "\n\n " + primeraParte + "\n      " + segundaParte; 
				}			

				cadenaJTA = cadenaJTA.substring(cadenaJTA.indexOf("\n"),cadenaJTA.length()).trim();
			} else {
				versiculoNew += "\n\n " + cadenaJTA; 
			}		
		}
		
		return " " + versiculoNew.trim();
	}
		
	public void imprimirNomina() { 	// Este metodo crea un objeto Printerjob el cual es inicializado y asociado con la impresora por default
		PrinterJob job = PrinterJob.getPrinterJob();
		job.setPrintable(this);
		
		boolean ok = job.printDialog();
		if (ok) { // Si el usuario presiona imprimir en el dialogo de impresión, entonces intenta imprimir todas las lineas de texto 
			try {
				job.print();
			} catch (PrinterException ex) {
				
			}
		}
	}
	
	public int print(Graphics g, PageFormat pf, int pageIndex) throws PrinterException { // Metodo que se crea por default cuando una clase implementa a Printable

		Font font = new Font("Arial", Font.PLAIN, 5); // Se establece la fuente, el tipo, el tamaño, 
		FontMetrics metrics = g.getFontMetrics(font); // Se establece la metrica según la fuente asignada,
		int altodelinea = metrics.getHeight(); //// obtiene la altura de cada linea de texto para que todas queden iguales
		
		if (paginas == null) { // Se calculara el número de lineas por pagina y el total de paginas
			initTextoLineas();
					
			int lineasPorPagina = (int) (pf.getImageableHeight() / altodelinea); // Calcula las lineas que le caben a cada página dividiendo la altura imprimible entre la altura de la linea de texto
			int numeroPaginas = (textoLineas.length - 1) / lineasPorPagina; // Calcula el numero de páginas dividiendo el total de lineas entre el numero de lineas por página
			paginas = new int[numeroPaginas];
			for (int b = 0; b < numeroPaginas; b++) {
				paginas[b] = (b + 1) * lineasPorPagina;
			}
		}
		
		if (pageIndex > paginas.length) { // Si se recibe un indice de página mayor que el total de páginas calculadas
			return NO_SUCH_PAGE; // entonces retorna NO_SUCH_PAGE para indicar que tal pagina no existe
		}
		
		/*
		 * Por lo regular cuando dibujamos algun objeto lo coloca en la coordenada
		 * (0,0), esta coordenada se encuentra fuera del área imprimible, por tal
		 * motivo se debe trasladar la posicion de las lineas de texto según el área
		 * imprimible del eje X y el eje Y
		 */
		Graphics2D g2d = (Graphics2D) g;
		g2d.translate(pf.getImageableX(), pf.getImageableY());
		
		/*
		 * Dibujamos cada línea de texto en cada página, se aumenta a la posición 'y'
		 * la altura de la línea a cada línea de texto para evitar la saturación de
		 * texto
		 */
		int y = 0;
		int start = (pageIndex == 0) ? 0 : paginas[pageIndex - 1];
		int end = (pageIndex == paginas.length) ? textoLineas.length : paginas[pageIndex];
		for (int line = start; line < end; line++) {
			y += altodelinea;
			g.drawString(textoLineas[line], 0, y);
		}

		return PAGE_EXISTS; // Retorna PAGE_EXISTS para indicar al invocador que esta página es parte del documento impreso
	}

	private void initTextoLineas() { //Agrega las lineas de texto al arreglo
		if (textoLineas == null) {
			int numLineas = totallineas;
			textoLineas = new String[numLineas];
			
			while (lineasdetexto.hasMoreTokens()) { //Se llena el arreglo que contiene todas las lineas de texto
				for (int i = 0; i < numLineas; i++) {
					textoLineas[i] = lineasdetexto.nextToken();
				}
			}
		}
	}
}
