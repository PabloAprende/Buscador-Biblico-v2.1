package modelo;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import conjugadorDeVerbos.*;
import vista.ConjugadordeVerbos;

public class Abrir_Leer_Buscar {

	private int coinsidencias;
	private String texto = "";
	private static final String NUEVALINEA = System.getProperty("line.separator");
	private boolean validacionLibros = false;
	private String textoVerbos="";
	
	public String leerArchivo(String expresionBuscada, String path) {
	
		expresionBuscada = expresionBuscada.toLowerCase();
		expresionBuscada = expresionBuscada.trim();	
		
		//-------------------------------------------------------------
		String[] listadoConjugado = null;
		boolean valor2 = manejarPreferencias(2);
		if((!expresionBuscada.contains(" ")) && valor2 && 
				(expresionBuscada.endsWith("ar") || expresionBuscada.endsWith("er") || expresionBuscada.endsWith("ir"))) { 			
		
			listadoConjugado = new Conjugar().obtenerListadoConjugado(expresionBuscada);			
		} else if(valor2) {
			ConjugadordeVerbos.establecerTexto("");
		}
		
		String cadenaConjugada = null; 
		if(listadoConjugado != null) {
			cadenaConjugada = "";
			for (String verbo : listadoConjugado) {
				cadenaConjugada += verbo;				
			}
		}
		
		int numVerbos = 0;
		int numLineas = 0;
		int[] variablesContadoras;
		if(cadenaConjugada != null) {		
			String lineaTemp;
			String resto = "\n";
			resto = cadenaConjugada;
			while(resto.contains("\n")) {
				lineaTemp = resto.substring(0,resto.indexOf("\n"));
				try {
					resto = resto.substring(resto.indexOf("\n"),resto.length()).trim();
				} catch(Exception e) {}
					
				if((!lineaTemp.contains(":")) && lineaTemp.length() != 0) { 
					numVerbos++;				
				}
				numLineas++;
			}					
		}
		variablesContadoras = new int[numVerbos]; 
		//-----------------------------------------------------------------
		
		if(!manejarPreferencias(3)) { 
			validacionLibros = true; 
		}
		
		Formatear m = new Formatear();		
		String expresionBuscadaFormat = m.formatear(expresionBuscada);
		expresionBuscadaFormat = expresionBuscadaFormat.trim();
		
		Pattern patron = Pattern.compile(expresionBuscadaFormat, Pattern.CASE_INSENSITIVE); 
		
		boolean continuar = true;
		while (continuar) {
			try {
				BufferedReader leer = new BufferedReader(new InputStreamReader(Thread.currentThread().getContextClassLoader().getResourceAsStream(path + ".txt")));				
				
				String linea;				
				while ((linea = leer.readLine()) != null) {
					linea = linea.trim();
			
					//---------------------------------------------------					
					if(cadenaConjugada != null) {	
						int numVerbos2=0;
									
							String lineaTemp;
							String resto = "\n";
							resto = cadenaConjugada;
							for(int i=0 ; i<=numLineas && resto.contains("\n") ; i++) {
								lineaTemp = resto.substring(0,resto.indexOf("\n"));
								try {
									resto = resto.substring(resto.indexOf("\n"),resto.length()).trim();
								} catch(Exception e) {System.out.println("linea 91");}
									
								if((!lineaTemp.contains(":")) && lineaTemp.length() != 0) { 
									
									if (new Formatear().validar(linea, lineaTemp)) { 													
										variablesContadoras[numVerbos2] += 1; 											
									}	
									numVerbos2++;
								}
											
						}
					}		
					//-----------------------------------------------------
					
					String lineaSinRefeerencias = "";
					String lineaFormat;
					if(validacionLibros) {
						int num;
						int primerChar = Character.toString(linea.charAt(0)).codePointAt(0);
						if(primerChar > 48 && primerChar < 57) {
							num = 3;
						} else { num = 2; }
						for(int i=0 ; i<num ; i++) {							
							lineaSinRefeerencias = linea.substring(linea.indexOf(" ")+1,linea.length());
						}	
						
						lineaFormat = m.formatear(lineaSinRefeerencias);
					} else {
						lineaFormat = m.formatear(linea);
					}
										
					Matcher revisar = patron.matcher(lineaFormat);					
					
					if (revisar.find()) { 																
						if(m.validar(lineaFormat, expresionBuscadaFormat)) {
							coinsidencias++;							
							texto += linea + NUEVALINEA;
						}						
					}
				}
				leer.close();
				continuar = false;
				
				//-------------------------------------------------------------------------------				
				if (cadenaConjugada != null) {
					
					int numVerbos2 = 0;
					String lineaTemp;
					String resto = "\n";
					resto = cadenaConjugada;
					String nomConjugacion = "";
					for (int i = 0; i <= numLineas && resto.contains("\n"); i++) {
						lineaTemp = resto.substring(0, resto.indexOf("\n"));
						try {
							resto = resto.substring(resto.indexOf("\n")+1, resto.length()).trim();
						} catch (Exception e) {}
						
						if ((!lineaTemp.contains(":")) && lineaTemp.length() != 0) {

							if(variablesContadoras[numVerbos2] != 0) {
								if(!nomConjugacion.equals("")) {
									textoVerbos += "\n\n" + nomConjugacion;
									nomConjugacion = "";
								}								
								
								textoVerbos += "\n(" + variablesContadoras[numVerbos2] + ")! " + lineaTemp;	
							}	
							numVerbos2++;
						} else {
							nomConjugacion = lineaTemp;
						}
					}
					textoVerbos = textoVerbos.trim();
					ConjugadordeVerbos.establecerTexto(textoVerbos);
				}					
				//------------------------------------------------------------------------------------
				
			} catch (Exception e) {
				System.out.println("linea 170");
				continuar = false; 
			}
		}
		if (cadenaConjugada != null) {
			if (texto.equals("")) {
				texto = "Sin coinsidencias";
				ConjugadordeVerbos.establecerTexto("Sin coinsidencias");
			} else if (!texto.equals("") && textoVerbos.equals("")) {
				ConjugadordeVerbos.establecerTexto("\n\n\n\n\n\n\n\n\n*********************************\n"
						+ "*********************************\n"
						+ " Este no es un verbo infinitivo.\n Cuando busque un verbo en \n   infinitivo se conjugara aqui."
						+ "\n*********************************\n" + "*********************************\n");
			}
		}
		
		return texto;
	}
	
	public int obtenConsidencias() {
		return coinsidencias;
	}
	
	private boolean manejarPreferencias (int numLinea) {
		boolean estado = false;
		try {
			BufferedReader leer = new BufferedReader(new FileReader(System.getProperty("user.home") + "\\Preferencias Búscador Bíblico Literal 2.1\\preferencias.txt"));

			int contador = 1;
			String linea;
			while ((linea = leer.readLine()) != null) {
				linea = linea.trim();
				if(contador == numLinea) {
					String estadoString = linea;
					if(estadoString.equals("true")) {
						estado = true;
						break;
					}
				}
				contador++;
			}			
			leer.close();
		} catch (Exception e) {
			System.out.println("linea 213");
		}
		return estado;
	}
}