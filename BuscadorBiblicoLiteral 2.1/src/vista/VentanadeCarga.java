package vista;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanadeCarga extends Thread {
	
	private JPanel panel1;
	private JLabel imCarga;	
	private JFrame msnDemora;
	
	{
		msnDemora = new JFrame("");
		msnDemora.setSize(380, 150);
		msnDemora.setLocation(480, 270);
		msnDemora.setIconImage(new ImageIcon(getClass().getResource("/manoLupa.png")).getImage());
		msnDemora.setResizable(false);		
		msnDemora.setDefaultCloseOperation(0);		
		
		Container contenedor = msnDemora.getContentPane();
		contenedor.setLayout(new GridLayout(2,1));
		
		panel1 = new JPanel();
		panel1.setLayout(new BorderLayout());
		contenedor.add(panel1, BorderLayout.CENTER);		
		
		imCarga = new JLabel(new ImageIcon(getClass().getResource("/load1-.png")));	
		panel1.add(imCarga);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new FlowLayout());
		contenedor.add(panel2);		
		panel2.add(new JLabel("Esto puede tardar unos segundos..."));
		
		msnDemora.setVisible(true);
		
		run();
	}
	
	public static void main(String[] args) {
		new VentanadeCarga().start();
	}
	
	@Override
	public void run() {
		
		boolean validacion = true;
		while(validacion) {
			panel1.remove(imCarga);
			imCarga.setIcon(new ImageIcon(getClass().getResource("/load2-.png")));
			agregar_y_remover();
			imCarga.setIcon(new ImageIcon(getClass().getResource("/load3-.png")));
			agregar_y_remover();
			imCarga.setIcon(new ImageIcon(getClass().getResource("/load4-.png")));
			agregar_y_remover();
			imCarga.setIcon(new ImageIcon(getClass().getResource("/load5-.png")));
			agregar_y_remover();
			imCarga.setIcon(new ImageIcon(getClass().getResource("/load6-.png")));
			agregar_y_remover();
			imCarga.setIcon(new ImageIcon(getClass().getResource("/load7-.png")));
			agregar_y_remover();
			imCarga.setIcon(new ImageIcon(getClass().getResource("/load8-.png")));
			agregar_y_remover();
			imCarga.setIcon(new ImageIcon(getClass().getResource("/load9-.png")));
			agregar_y_remover();
			imCarga.setIcon(new ImageIcon(getClass().getResource("/load10-.png")));
			agregar_y_remover();
			imCarga.setIcon(new ImageIcon(getClass().getResource("/load11-.png")));
			agregar_y_remover();
			imCarga.setIcon(new ImageIcon(getClass().getResource("/load12-.png")));
			agregar_y_remover();	
			imCarga.setIcon(new ImageIcon(getClass().getResource("/load1-.png")));
		}			
	}
	
	private void agregar_y_remover() {		
		panel1.add(imCarga);
		panel1.updateUI();
		esperar();
		panel1.remove(imCarga);
		panel1.updateUI();		
	}
	
	private void esperar() {
		synchronized (this) {
			try {
				this.wait(350L);
				this.notify();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}
	
	public void ocultarVentadadeEspera() {	
		msnDemora.setVisible(false);
		msnDemora.dispose();
	} 
}

