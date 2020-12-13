package vista;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import modelo.Abrir_Leer_Buscar;
import modelo.BusquedaNula;
import modelo.CopiarYPegar;
import modelo.Imprimir;

class Interfaz implements ActionListener, MouseMotionListener, MouseListener {

	private JFrame marco;
	private Container contenedor;
	private JTextField expresion;
	private JPanel areaBusqueda;
	private JLabel im;
	private JPanel areaResultados;
	private JTextArea resultados;
	private JScrollPane scroll;
	private JComboBox<String> cajaVersiones;
	private JMenuItem item;
	private JMenuItem item2;
	private JLabel impresora;
	private JLabel info;
	private Abrir_Leer_Buscar x;
	private String mensaje;
	
	{
		marco = new JFrame("Buscador Bíblico Literal 2.1");
		marco.setSize(1100, 600);
		marco.setLocation(130, 70);
		marco.setResizable(false);
		marco.setIconImage(new ImageIcon(getClass().getResource("/manoLupa.png")).getImage());

		contenedor = marco.getContentPane();
		contenedor.setLayout(new BorderLayout(10, 0));
		// ----------------------------------------------------------------

		JMenuBar barraMenu = new JMenuBar();				
		JMenu menuArchivo = new JMenu("Archivo");
		
		JMenuItem itemImprimir = new JMenuItem("Imprimir");
		itemImprimir.addActionListener(this);
		menuArchivo.add(itemImprimir);
		
		JMenuItem itemConfiguraciones = new JMenuItem("Ajustes");
		itemConfiguraciones.addActionListener(this);
		menuArchivo.add(itemConfiguraciones);
		
		JMenuItem itemInformacion = new JMenuItem("Información");
		itemInformacion.addActionListener(this);
		menuArchivo.add(itemInformacion);
		
		marco.setJMenuBar(barraMenu);
		barraMenu.add(menuArchivo);	
		
		// ----------------------------------------------------------------
		areaBusqueda = new JPanel();
		areaBusqueda.setLayout(new FlowLayout());
		contenedor.add(areaBusqueda, BorderLayout.NORTH);

		areaBusqueda.add(new JLabel("Ingrese la palabra o expresión búscada:"));

		expresion = new JTextField();
		expresion.setColumns(22);
		expresion.setComponentPopupMenu(pegarItem());
		expresion.addActionListener(this);
		expresion.addMouseMotionListener(this);
		expresion.addMouseListener(this);
		areaBusqueda.add(expresion);

		JButton buscar = new JButton("Buscar");
		buscar.setSize(80, 30);
		buscar.addActionListener(this);
		areaBusqueda.add(buscar);
		
		im = new JLabel(new ImageIcon(getClass().getResource("")));	
		areaBusqueda.add(im);
		// ----------------------------------------------------------------

		// ----------------------------------------------------------------
		areaResultados = new JPanel();
		areaResultados.setLayout(new FlowLayout());
		contenedor.add(areaResultados, BorderLayout.CENTER);

		resultados = new JTextArea();
		resultados.setColumns(88);
		resultados.setRows(25);
		resultados.addMouseMotionListener(this);
		resultados.setEditable(false);

		scroll = new JScrollPane(resultados);
		scroll.setBorder(BorderFactory.createTitledBorder("Esperando su búsqueda..."));
		areaResultados.add(scroll);

		impresora = new JLabel(new ImageIcon(getClass().getResource("/impByN.png")));
		areaResultados.add(impresora);
		// ----------------------------------------------------------------

		// ----------------------------------------------------------------
		JPanel areaVersiones = new JPanel();
		areaVersiones.setLayout(new GridLayout(1, 3));
		contenedor.add(areaVersiones, BorderLayout.SOUTH);

		JPanel areaInfo = new JPanel();
		areaInfo.setLayout(new GridLayout(1, 4));
		areaVersiones.add(areaInfo);

		info = new JLabel(new ImageIcon(getClass().getResource("/info.png")));
		info.addMouseListener(this);
		areaInfo.add(info);

		JLabel espacioinfo1 = new JLabel("");
		areaInfo.add(espacioinfo1);
		JLabel espacioinfo2 = new JLabel("");
		areaInfo.add(espacioinfo2);
		JLabel espacioinfo3 = new JLabel("");
		areaInfo.add(espacioinfo3);

		JLabel espacio = new JLabel("");
		areaVersiones.add(espacio);

		String[] versiones = {"Casiodoro de Reina 1569","Reina-Valera 1960","Nueva Reina-Valera 2000","Traduccion del Nuevo Mundo 1989","Traduccion del Nuevo Mundo 2019" };
		cajaVersiones = new JComboBox<String>(versiones);
		cajaVersiones.setBorder(BorderFactory.createTitledBorder("Buscando en:"));
		areaVersiones.add(cajaVersiones);
		//-----------------------------------------------------------------
		
		manejarPreferencias();
	
		// ----------------------------------------------------------------		

		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
	}
	
	private JPopupMenu copiarItem() {
		JPopupMenu menu = new JPopupMenu();
		item = new JMenuItem("Copiar");
		item.addActionListener(this);
		menu.add(item);

		return menu;
	}

	private JPopupMenu pegarItem() {
		JPopupMenu menu2 = new JPopupMenu();
		item2 = new JMenuItem("Pegar");
		item2.addActionListener(this);
		menu2.add(item2);

		return menu2;
	}

	private JPopupMenu copiaryPegarItem() {
		JPopupMenu menu3 = new JPopupMenu();
		item = new JMenuItem("Copiar");
		item.addActionListener(this);
		menu3.add(item);
		item2 = new JMenuItem("Pegar");
		item2.addActionListener(this);
		menu3.add(item2);

		return menu3;
	}

	private void manejarPreferencias () {
		try {
			 
			File carpeta = new File(System.getProperty("user.home") + "\\Preferencias Búscador Bíblico Literal 2.1");       
			carpeta.mkdir();
	        	
			File archivo = new File(carpeta + "\\preferencias.txt"); 
				    
			if (!archivo.exists()) {
				PrintWriter escribir = new PrintWriter(new FileWriter(archivo, true)); 	
				escribir.println("false\ntrue\ntrue");
				new ConjugadordeVerbos(this.marco,scroll,areaResultados,impresora).mostrarCuadroConjugacion();	
				resultados.setText(mensaje());
				escribir.close();
			} else {
				BufferedReader leer = new BufferedReader(new FileReader(archivo));
				
				int contador = 1;
				String linea;
				while ((linea = leer.readLine()) != null) {
					linea = linea.trim();
		
					if(contador == 2 && linea.equals("true")) {
						new ConjugadordeVerbos(this.marco,scroll,areaResultados,impresora).mostrarCuadroConjugacion();		
					}
					contador++;
				}	
				leer.close();
			}	
		} catch (Exception e) {
			System.out.println("linea 227");
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() instanceof JTextField || e.getSource() instanceof JButton) {			
			if (expresion.getText().trim().length() != 0) {
				
				//-------------------------------------------
				
				//VentanadeCarga vc = new VentanadeCarga();				
				// sincronizar vc con this.
				
				//--------------------------------------------
				
				x = new Abrir_Leer_Buscar();
				resultados.setText(x.leerArchivo(expresion.getText(), (String) cajaVersiones.getSelectedItem()));	
				
				impresora.setIcon(new ImageIcon(getClass().getResource("/imp.png")));		
				impresora.addMouseListener(this);
				
				if (x.obtenConsidencias() != 0) {
					String mensaje;
					if(x.obtenConsidencias() == 1) {
						mensaje = " versículo encontrado:";
					} else {mensaje = " versículos encontrados:";}
					scroll.setBorder(BorderFactory.createTitledBorder(x.obtenConsidencias() + mensaje));
					im.setIcon(new ImageIcon(getClass().getResource("/listo.png")));	
					areaBusqueda.updateUI();
				} else {
					scroll.setBorder(
							BorderFactory.createTitledBorder(x.obtenConsidencias() + " versículos encontrados:"));
					if (x.obtenConsidencias() == 0) {
						impresora.setIcon(new ImageIcon(getClass().getResource("/impByN.png")));
						impresora.removeMouseListener(this);
						im.setIcon(new ImageIcon(getClass().getResource("/equis.png")));							
						areaBusqueda.updateUI();
						resultados.setText("Sin resultados.");
						ConjugadordeVerbos.establecerTexto("Sin resultados.");
					}
				}

				//vc.ocultarVentadadeEspera();
			} else {
				resultados.setText(BusquedaNula.leerArchivo()); new BusquedaNula().alerta(areaBusqueda, im);
				scroll.setBorder(BorderFactory.createTitledBorder("Esperando su búsqueda..."));
				impresora.setIcon(new ImageIcon(getClass().getResource("/impByN.png")));
				impresora.removeMouseListener(this);
			}
		} else {
			String nomItem = e.getActionCommand();
			if (nomItem.equals("Imprimir")) { 				
				if(resultados.getText().toString().length() == 0) {
					JOptionPane.showMessageDialog(null, "Primero realice una búsqueda...");
				} else {
					new Imprimir().imprimir(x,expresion,(String) cajaVersiones.getSelectedItem(),resultados);
				}
			} else if (nomItem.equals("Ajustes")) {
				new Ajustes(marco,scroll,areaResultados,impresora);
			} else if (nomItem.equals("Información")) {
				new Informacion();
			} else if (nomItem.equals("Copiar")) {
				if (resultados.getSelectedText() != null) {
					CopiarYPegar.copiar(new StringSelection(resultados.getSelectedText()));
				}

				if (expresion.getSelectedText() != null) {
					CopiarYPegar.copiar(new StringSelection(expresion.getSelectedText()));
				}
			} else if (nomItem.equals("Pegar")) {
				if(expresion.getSelectedText() != null) {
					expresion.setText(CopiarYPegar.pegar());
				} else {
					expresion.setText(expresion.getText() + CopiarYPegar.pegar());
				}			
			}
		}
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		if (arg0.getSource() instanceof JTextArea) {
			if (resultados.getSelectedText() != null) {
				resultados.setComponentPopupMenu(copiarItem());
			}
		} else if (arg0.getSource() instanceof JTextField) {
			if (expresion.getSelectedText() != null) {
				expresion.setComponentPopupMenu(copiaryPegarItem());
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		if (arg0.getSource() instanceof JLabel) {
			if (arg0.toString().contains("info")) {
				new Informacion();
			} else if (arg0.toString().contains("imp")) {
				new Imprimir().imprimir(x,expresion,(String) cajaVersiones.getSelectedItem(),resultados);
			}
		} else if (arg0.getSource() instanceof JTextField) {
			expresion.setComponentPopupMenu(pegarItem());
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		if(impresora.getIcon().toString().contains(("/imp.png"))) {
			impresora.setToolTipText("Imprimir");
		}	
		info.setToolTipText("Información");
	}
	
	@Override
	public void mouseMoved(MouseEvent arg0) {
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
	
	private String mensaje() {
		mensaje = "\n\n\n\n\n"
				+ "                                                      ************************************************************************************************************************************\n"
				+ "                                                                                              Buscador Biblico Literal , Versión 2.1 - Actualización 28-10-2020\n"
				+ "                                                      ************************************************************************************************************************************\n"
				+ "                                                            Novedades en comparación con la versión anterior:\n"
				+ "                                                            - Fue incorporado el módulo de conjugación verbal, el cual por el momento sólo funciona con verbos en infinitivo.\n"
				+ "                                                            - Se incorporó una barra de menú, con la opción principal \"ajustes\" el cual permite gestionar el encendido o\n"
				+ "                                                              apagado de las funciones: conjugador verbal y el incluir o expluir libros de los resultados de las búsquedas.\n"
				+ "                                                            - Se incluyeron las versiones bíblicas:           Casidoro de Reina 1569          y          Nueva Reina-Valera 2000\n"
				+ "                                                            - Se incluyó una dinámica de imágenes de estado: tilde verde en búsqueda exitosa, cruz roja en búsquda\n"
				+ "                                                              infructuosa, ícono de warning en búsqueda vacía.\n"
				+ "                                                      ************************************************************************************************************************************\n"
				+ "                                                            Adelanto:\n"
				+ "                                                            - Se está trabajando en la inclusión del texto hebreo y griego de modo interlinal al texto español.\n"
				+ "                                                            - Se está trabajando sobre la inclusión de las versiones bíblicas: Nueva versión internacional 1999 y otras.\n"
				+ "                                                      ************************************************************************************************************************************";
		
		return mensaje;
	}
	
	class ImLoad extends Thread {
		
		@Override
		public void run()  {	
			im.setIcon(new ImageIcon(getClass().getResource("/load1-.png")));	
			areaBusqueda.updateUI();
		}
	}
}