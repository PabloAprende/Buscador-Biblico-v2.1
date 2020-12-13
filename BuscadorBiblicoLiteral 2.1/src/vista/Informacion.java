package vista;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Informacion implements ActionListener {

	private JFrame marco;
	
	{
		marco = new JFrame("Información");
		marco.setSize(750, 400);
		marco.setLocation(300, 170);
		marco.setResizable(false);
		marco.setIconImage(new ImageIcon(getClass().getResource("/info.png")).getImage());
		
		Container contenedor = marco.getContentPane();
		contenedor.setLayout(new BorderLayout(10,0));

		//------------------------------------------------------------------------------
		// Border NORTE
		//------------------------------------------------------------------------------
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(2,1));
		contenedor.add(panel1, BorderLayout.NORTH);

		//--------------------------------------------------
		JPanel panel1_1 = new JPanel();
		panel1_1.setLayout(new FlowLayout());
		panel1.add(panel1_1);
		
		JLabel nombre = new JLabel("Buscador Biblico Literal");
		nombre.setFont(new Font("Arial", Font.BOLD, 20));
		panel1_1.add(nombre);
		
		//--------------------------------------------------
		
		JPanel panel1_2 = new JPanel();
		panel1_2.setLayout(new FlowLayout());
		panel1.add(panel1_2);
		
		JLabel version = new JLabel("versión 2.1  2020");
		version.setFont(new Font("Consolas", Font.PLAIN, 11));
		panel1_2.add(version);
		//--------------------------------------------------
		
		//------------------------------------------------------------------------------
		// Border CENTER
		//------------------------------------------------------------------------------
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(10,1));
		contenedor.add(panel2, BorderLayout.CENTER);

		//--------------------------------------------------
		JPanel panel2_1 = new JPanel();
		panel2_1.setLayout(new FlowLayout());
		panel2.add(panel2_1);
		
		Font flineas = new Font("Arial", Font.PLAIN, 14);
		
		JLabel linea1 = new JLabel("Es un software de uso y distribución libre y gratuita, mediante el cual no se lucrara de ninguna manera.");		
		linea1.setFont(flineas);
		panel2_1.add(linea1);		
		//--------------------------------------------------
		JPanel panel2_2 = new JPanel();
		panel2_2.setLayout(new FlowLayout());
		panel2.add(panel2_2);
		
		JLabel linea2 = new JLabel("Tiene por finalidad ser una herramienta complementaria a la hora de la presentación o estudio de un tema puntual,");		
		linea2.setFont(flineas);
		panel2_2.add(linea2);		
		//--------------------------------------------------
		JPanel panel2_3 = new JPanel();
		panel2_3.setLayout(new FlowLayout());
		panel2.add(panel2_3);
		
		JLabel linea3_1 = new JLabel("mediante la búsqueda biblica de todas las referencias ");		
		linea3_1.setFont(flineas);
		panel2_3.add(linea3_1);
		
		Font flineasBold = new Font("Arial", Font.BOLD, 14);
		
		JLabel linea3_2 = new JLabel("literales");		
		linea3_2.setFont(flineasBold);
		panel2_3.add(linea3_2);
		
		JLabel linea3_3 = new JLabel(" de una palabra o expresión dada.");		
		linea3_3.setFont(flineas);
		panel2_3.add(linea3_3);
		//--------------------------------------------------
		JPanel panelEsapcio1 = new JPanel();
		panelEsapcio1.setLayout(new FlowLayout());
		panel2.add(panelEsapcio1);
		
		JLabel lineaEspacio1 = new JLabel("");		
		panelEsapcio1.add(lineaEspacio1);		
		//--------------------------------------------------     	
		JPanel panel2_4 = new JPanel();
		panel2_4.setLayout(new FlowLayout());
		panel2.add(panel2_4);
		
		JLabel linea4 = new JLabel("Se agradecen todas las sugerencias que ayuden a mejorar el software.");		
		linea4.setFont(flineas);
		panel2_4.add(linea4);		
		//--------------------------------------------------         
		JPanel panel2_5 = new JPanel();
		panel2_5.setLayout(new FlowLayout());
		panel2.add(panel2_5);
		
		JLabel linea5_1 = new JLabel("No dude en enviar sus comentarios a: ");		
		linea5_1.setFont(flineas);
		panel2_5.add(linea5_1);	
		
		JLabel linea5_2 = new JLabel("padafra2018@gmail.com");		
		linea5_2.setFont(flineasBold);
		panel2_5.add(linea5_2);	
		//--------------------------------------------------  			
		JPanel panelEsapcio2 = new JPanel();
		panelEsapcio2.setLayout(new FlowLayout());
		panel2.add(panelEsapcio2);
				
		JLabel lineaEspacio2 = new JLabel("");		
		panelEsapcio2.add(lineaEspacio2);		
		//--------------------------------------------------   
		JPanel panel2_6 = new JPanel();
		panel2_6.setLayout(new FlowLayout());
		panel2.add(panel2_6);
		
		JLabel linea6 = new JLabel("Nota: Buscador Bíblico Literal tambien es openSource. Si usted es desarrollador y quiere reutilizar o estudiar");		
		linea6.setFont(flineas);
		panel2_6.add(linea6);		
		//--------------------------------------------------  
		JPanel panel2_7 = new JPanel();
		panel2_7.setLayout(new FlowLayout());
		panel2.add(panel2_7);
		
		JLabel linea7 = new JLabel("el código fuente, no dude en solicitar el enlace de github al correo anterior.");		
		linea7.setFont(flineas);
		panel2_7.add(linea7);		
		//-------------------------------------------------- 
		
		//------------------------------------------------------------------------------
		// Border SUR
		//------------------------------------------------------------------------------
		JPanel panel3 = new JPanel();
		panel3.setLayout(new FlowLayout());
		contenedor.add(panel3, BorderLayout.SOUTH);
		
		JButton aceptar = new JButton("Entendido");
		aceptar.setSize(80, 30);
		aceptar.addActionListener(this);
		panel3.add(aceptar);
		//------------------------------------------------------------------------------
		
		marco.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		marco.setVisible(false);
		marco.dispose();
	}
}
