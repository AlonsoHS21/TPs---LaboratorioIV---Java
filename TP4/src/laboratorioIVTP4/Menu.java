package laboratorioIVTP4;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Codigo para centrar la ventana en cualquier computadora
		Toolkit miVentana = Toolkit.getDefaultToolkit();
		Dimension tamanoVentana = miVentana.getScreenSize();//obtiene la resolucion de tu pantalla
		setSize(tamanoVentana.width/2, tamanoVentana.height/2); //Marco de la mitad de alto y ancho de mi pantalla
		setLocation(tamanoVentana.width/4,tamanoVentana.height/4); //Centra la ventana dentro del marco
		
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombreGrupo = new JLabel("GRUPO: N4");
		lblNombreGrupo.setFont(new Font("Verdana", Font.BOLD, 24));
		lblNombreGrupo.setBounds(355, 34, 225, 78);
		contentPane.add(lblNombreGrupo);
		
		//Button 1
		JButton btnEjercicio_1 = new JButton("Ejercicio 1");
		btnEjercicio_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnEjercicio_1.setBounds(432, 158, 144, 57);
		contentPane.add(btnEjercicio_1);
		
		//Button 2
		JButton btnEjercicio_2 = new JButton("Ejercicio 2");
		btnEjercicio_2.setBounds(432, 242, 144, 57);
		contentPane.add(btnEjercicio_2);
		btnEjercicio_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		//Button 3
		JButton btnEjercicio_3 = new JButton("Ejercicio 3");
		btnEjercicio_3.setBounds(432, 328, 144, 57);
		contentPane.add(btnEjercicio_3);
		btnEjercicio_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	
	}
}
