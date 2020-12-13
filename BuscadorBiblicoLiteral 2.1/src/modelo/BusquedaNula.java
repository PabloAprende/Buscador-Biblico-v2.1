package modelo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BusquedaNula {
	
	public static String leerArchivo() {
		String texto = "";
		try {
			BufferedReader leer = new BufferedReader(new InputStreamReader(Thread.currentThread().getContextClassLoader().getResourceAsStream("busqueda vacia.txt")));
			String linea;

			while ((linea = leer.readLine()) != null) {
				texto += "\n" + linea;
			}
			leer.close();
		} catch (Exception e) {
			System.out.println("linea 23");
		}
		return texto;
	}
	
	public void alerta(JPanel areaBusqueda, JLabel im) {
		im.setIcon(new ImageIcon(getClass().getResource("/warning.png")));	
		areaBusqueda.updateUI();
	}
}
