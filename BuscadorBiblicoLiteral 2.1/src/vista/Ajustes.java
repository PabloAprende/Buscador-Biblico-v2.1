package vista;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Ajustes implements MouseListener, ActionListener {

	JFrame marcoConfig;
	private JLabel a;
	private JLabel e;
	private JLabel i;
	String imagen1, imagen2, imagen3;
	
	private JFrame marco; 
	private JScrollPane scroll;
	private JPanel areaResultados;
	private JLabel impresora;
	
	{
		manejarPreferencias();
		
		marcoConfig = new JFrame("Configuraciones");
		marcoConfig.setSize(400,180);
		marcoConfig.setLocation(480, 300);
		marcoConfig.setResizable(false);
		marcoConfig.setIconImage(new ImageIcon(getClass().getResource("/config.png")).getImage());

		Container contenedor = marcoConfig.getContentPane();
		contenedor.setLayout(new GridLayout(4, 1));
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(1,2));
		contenedor.add(panel1);
		
		JPanel subPanel1_1 = new JPanel();
		subPanel1_1.setLayout(new BorderLayout());
		panel1.add(subPanel1_1);
		
		JLabel descripcion1 = new JLabel("Incluir interlineales originales  ");
		subPanel1_1.add(descripcion1,BorderLayout.EAST);
		
		JPanel subPanel1_2 = new JPanel();
		subPanel1_2.setLayout(new GridLayout(1,2));
		panel1.add(subPanel1_2);
		
		JLabel esp = new JLabel("");
		subPanel1_2.add(esp);
		
		JPanel subPanel1_2_1 = new JPanel();
		subPanel1_2_1.setLayout(new BorderLayout());
		subPanel1_2.add(subPanel1_2_1);
		
		a = new JLabel(new ImageIcon(getClass().getResource(imagen1)));
		a.addMouseListener(this);
		subPanel1_2_1.add(a,BorderLayout.WEST);
		

		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(1,2));
		contenedor.add(panel2);
		
		JPanel subPanel2_1 = new JPanel();
		subPanel2_1.setLayout(new BorderLayout());
		panel2.add(subPanel2_1);
		
		JLabel descripcion2 = new JLabel("Incluir conjugador de verbos    ");
		subPanel2_1.add(descripcion2,BorderLayout.EAST);
		
		JPanel subPanel2_2 = new JPanel();
		subPanel2_2.setLayout(new GridLayout(1,2));
		panel2.add(subPanel2_2);
		
		JLabel esp2 = new JLabel("");
		subPanel2_2.add(esp2);
		
		JPanel subPanel2_2_1 = new JPanel();
		subPanel2_2_1.setLayout(new BorderLayout());
		subPanel2_2.add(subPanel2_2_1);
		
		e = new JLabel(new ImageIcon(getClass().getResource(imagen2)));
		e.addMouseListener(this);
		subPanel2_2_1.add(e,BorderLayout.WEST);
		
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new GridLayout(1,2));
		contenedor.add(panel3);
	
		JPanel subPanel3_1 = new JPanel();
		subPanel3_1.setLayout(new BorderLayout());
		panel3.add(subPanel3_1);
		
		JLabel descripcion3 = new JLabel("Incluir libros en los resultados");
		subPanel3_1.add(descripcion3,BorderLayout.EAST);
		
		JPanel subPanel3_2 = new JPanel();
		subPanel3_2.setLayout(new GridLayout(1,2));
		panel3.add(subPanel3_2);
		
		JLabel esp3 = new JLabel("");
		subPanel3_2.add(esp3);
		
		JPanel subPanel3_2_1 = new JPanel();
		subPanel3_2_1.setLayout(new BorderLayout());
		subPanel3_2.add(subPanel3_2_1);
		
		i = new JLabel(new ImageIcon(getClass().getResource(imagen3)));
		i.addMouseListener(this);
		subPanel3_2_1.add(i,BorderLayout.WEST);		
		
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(new FlowLayout());
		contenedor.add(panel4);
		
		JPanel panel4_1 = new JPanel();
		panel4_1.setLayout(new BorderLayout());
		panel4.add(panel4_1);
		
		JButton aplicar = new JButton("Aplicar cambios");
		aplicar.addActionListener(this);
		panel4.add(aplicar,BorderLayout.SOUTH);
		
		marcoConfig.setVisible(true);
	}
	
	public Ajustes(JFrame marco, JScrollPane scroll, JPanel areaResultados, JLabel impresora) {
		this.marco = marco;
		this.scroll = scroll;
		this.areaResultados = areaResultados;
		this.impresora = impresora;
	}
	
	private void manejarPreferencias () {
		try {

			BufferedReader leer = new BufferedReader(new FileReader(System.getProperty("user.home") + "\\Preferencias Búscador Bíblico Literal 2.1\\preferencias.txt"));

			int contador = 1;
			String linea;
			while ((linea = leer.readLine()) != null) {
				linea = linea.trim();
				if(contador == 1) {
					if(linea.equals("true")) { 
						imagen1 = "/1on.png";
					} else {
						imagen1 = "/1off.png";
					}
				} else if(contador == 2) {
					if(linea.equals("true")) { 
						imagen2 = "/2on.png";
					} else {
						imagen2 = "/2off.png";
					}
				} else if(contador == 3) {
					if(linea.equals("true")) { 
						imagen3 = "/3on.png";
					} else {
						imagen3 = "/3off.png";
					}
				}
				contador++;
			}			
			leer.close();
		} catch (Exception e) {
			System.out.println("linea 185");
		}
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		if (arg0.toString().contains("1on") || arg0.toString().contains("1off")) {
			estadoBoton(a,arg0,1);
		} else if (arg0.toString().contains("2on") || arg0.toString().contains("2off")) {
			estadoBoton(e,arg0,2);
		} else if (arg0.toString().contains("3on") || arg0.toString().contains("3off")) {
			estadoBoton(i,arg0,3);
		}
	}
	
	private void estadoBoton(JLabel eleccion,MouseEvent arg0,int numBot) {
		if (arg0.toString().contains(numBot+"off")) {
			eleccion.setIcon(new ImageIcon(getClass().getResource("/"+numBot+"on.png")));
		} else if (arg0.toString().contains(numBot+"on")) {
			eleccion.setIcon(new ImageIcon(getClass().getResource("/"+numBot+"off.png")));
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(a.getIcon().toString().contains("1on") && imagen1 != "/1on.png") {					
			imagen1 = "/1on.png";		
		} else if(a.getIcon().toString().contains("1off") && imagen1 != "/1off.png") {
			imagen1 = "/1off.png";
		} 
		
		ConjugadordeVerbos cuadro = new ConjugadordeVerbos(marco,scroll,areaResultados,impresora);
		if(e.getIcon().toString().contains("2on") && imagen2 != "/2on.png") {					
			imagen2 = "/2on.png";
			cuadro.mostrarCuadroConjugacion();				
		} else if(e.getIcon().toString().contains("2off") && imagen2 != "/2off.png") {
			imagen2 = "/2off.png";
			cuadro.ocultarCuadroConjugacion();			
		}
		
		if(i.getIcon().toString().contains("3on") && imagen3 != "/3on.png") {					
			imagen3 = "/3on.png";		
		} else if(i.getIcon().toString().contains("3off") && imagen3 != "/3off.png") {
			imagen3 = "/3off.png";
		} 
	
		establecerNuevasPreferenciasdeUsuario();
		marcoConfig.setVisible(false);
	}
	
	private void establecerNuevasPreferenciasdeUsuario() {
		try {
			String path = System.getProperty("user.home") + "\\Preferencias Búscador Bíblico Literal 2.1\\preferencias";
			File newFile = new File(path + "-.txt");
			PrintWriter escribir = new PrintWriter(new FileWriter(newFile, true)); 	
			
			if(imagen1.equals("/1on.png")) {
				escribir.println("true");
			} else {
				escribir.println("false");
			}
						
			if(imagen2.equals("/2on.png")) {
				escribir.println("true");
			} else {
				escribir.println("false");
			} 
			
			if(imagen3.equals("/3on.png")) {
				escribir.println("true");
			} else {
				escribir.println("false");
			}
			
			escribir.close();
			new File(path + ".txt").delete();
			
			newFile.renameTo(new File(path + ".txt"));			
		} catch (IOException e) {
			System.out.println("linea 264");
		} 
	}
	
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
