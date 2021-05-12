package laboratorioIVTP4;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Ejercicio3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfCantidad_Horas;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio3 frame = new Ejercicio3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Ejercicio3() {
		setTitle("Seleccion multiple");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		Toolkit miVentana = Toolkit.getDefaultToolkit();
		Dimension tamanoVentana = miVentana.getScreenSize();
		setSize(tamanoVentana.width/2, tamanoVentana.height/2); 
		setLocation(tamanoVentana.width/4,tamanoVentana.height/4);
		
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Elije un sistema operativo");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(208, 122, 188, 17);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnWindows = new JRadioButton("Windows");
		rdbtnWindows.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnWindows.setBounds(427, 119, 109, 23);
		contentPane.add(rdbtnWindows);
		
		JRadioButton rdbtnMac = new JRadioButton("Mac");
		rdbtnMac.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnMac.setBounds(560, 119, 98, 23);
		contentPane.add(rdbtnMac);
		
		JRadioButton rdbtnLinux = new JRadioButton("Linux");
		rdbtnLinux.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnLinux.setBounds(672, 119, 127, 23);
		contentPane.add(rdbtnLinux);
		
		JLabel lblNewLabel_1 = new JLabel("Elije una especialidad");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(218, 243, 154, 23);
		contentPane.add(lblNewLabel_1);
		
		JCheckBox chckbxProgramacion = new JCheckBox("Programacion");
		chckbxProgramacion.setFont(new Font("Tahoma", Font.BOLD, 14));
		chckbxProgramacion.setBounds(453, 209, 127, 23);
		contentPane.add(chckbxProgramacion);
		
		JCheckBox chckbxAdministracion = new JCheckBox("Administracion");
		chckbxAdministracion.setFont(new Font("Tahoma", Font.BOLD, 14));
		chckbxAdministracion.setBounds(453, 243, 127, 23);
		contentPane.add(chckbxAdministracion);
		
		JCheckBox chckbxDisenoGrafico = new JCheckBox("Dise\u00F1o Gr\u00E1fico");
		chckbxDisenoGrafico.setFont(new Font("Tahoma", Font.BOLD, 14));
		chckbxDisenoGrafico.setBounds(453, 275, 127, 23);
		contentPane.add(chckbxDisenoGrafico);
		
		JLabel lblNewLabel_2 = new JLabel(" Cantidad de horas en el computador:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(208, 355, 283, 17);
		contentPane.add(lblNewLabel_2);
		
		tfCantidad_Horas = new JTextField();
		tfCantidad_Horas.setBounds(508, 350, 150, 31);
		contentPane.add(tfCantidad_Horas);
		tfCantidad_Horas.setColumns(10);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(606, 416, 127, 47);
		contentPane.add(btnNewButton);
	}
}
