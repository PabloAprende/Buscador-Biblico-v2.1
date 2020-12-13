package vista;

import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import modelo.CopiarYPegar;

public class ConjugadordeVerbos implements MouseMotionListener, ActionListener {

	private JFrame marco;
	private JScrollPane scroll;
	private JScrollPane scroll2;
	private static JTextArea areaVerbos;
	private JPanel areaResultados;
	private JLabel impresora;
	private JMenuItem item;
	private final String MENSAJE =    "*********************************\n" 
						            + " Cuando busque un verbo en\n   su forma infinitiva, esto es,\n"
						            + " cualquier verbo terminado en\n                 AR - ER - IR\n          (andar, correr, vivir)\n"
						            + "     en esta área apareceran\n todas las formas conjugadas\n "
						            + " con el número de veces que\n   aparezca en las escrituras\n "
						            + "            entre paréntesis.\n"
						            + "*********************************\n\n"
						            + "*********************************\n"
						            + "       Este módulo, gestiona\n  eficazcamete la conjugación\n         de verbos regulares.\n"
						            + "   Sin embargo, de momento,\n la conjugación de los verbos\nirregulares, con excepcion de\n"
						            + "    unos pocos, pudieran no\n       arrojar los resultados\n                  deseados.\n"
						            + "         *Sepa disculparme*\n"
						            + "*********************************";
	
	public ConjugadordeVerbos() {}

	public ConjugadordeVerbos (JFrame marco, JScrollPane scroll, JPanel areaResultados, JLabel impresora) {
		this.marco = marco;
		this.scroll = scroll;
		this.areaResultados = areaResultados;
		this.impresora = impresora;
	}
	
	public void mostrarCuadroConjugacion() {	
		marco.setSize(1250, 600);
		marco.setLocation(56, 70);
		
		areaResultados.remove(impresora);
		
		areaVerbos = new JTextArea();
		areaVerbos.setColumns(15);
		areaVerbos.setRows(25);
		areaVerbos.addMouseMotionListener(this);
		areaVerbos.setEditable(false);
		
		scroll2 = new JScrollPane(areaVerbos);
		scroll2.setBorder(BorderFactory.createTitledBorder("Area de conjugaciones:"));
		areaResultados.add(scroll2);
		
		areaVerbos.setText(MENSAJE);
	}
	
	public void ocultarCuadroConjugacion() {		
		areaResultados.removeAll();
		areaResultados.revalidate();
        areaResultados.repaint();
        
        areaResultados.add(scroll);
		areaResultados.add(impresora);
		
		marco.setSize(1100, 600);
		marco.setLocation(130, 70);
	}
	
	public static void establecerTexto(String texto) {
		areaVerbos.setText(texto);
	}

	@Override
	public void mouseDragged(MouseEvent e) {		
		if (areaVerbos.getSelectedText() != null) {
			areaVerbos.setComponentPopupMenu(copiarItem());
		}	
	}
	
	private JPopupMenu copiarItem() {
		JPopupMenu menu = new JPopupMenu();
		item = new JMenuItem("Copiar");
		item.addActionListener(this);
		menu.add(item);

		return menu;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (areaVerbos.getSelectedText() != null) {
			CopiarYPegar.copiar(new StringSelection(areaVerbos.getSelectedText()));
		}
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
