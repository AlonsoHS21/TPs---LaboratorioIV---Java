package laboratorioIVTP4;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Ejercicio1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNombre;
	private JTextField tfApellido;
	private JTextField tfTelefono;
	private JTextField tfFecha_Nacimiento;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio1 frame = new Ejercicio1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Ejercicio1() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		Toolkit miVentana = Toolkit.getDefaultToolkit();
		Dimension tamanoVentana = miVentana.getScreenSize();
		setSize(tamanoVentana.width/2, tamanoVentana.height/2); 
		setLocation(tamanoVentana.width/4,tamanoVentana.height/4);
		
		setTitle("Contactos");
		
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNombre.setBounds(181, 86, 76, 27);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblApellido.setBounds(181, 140, 76, 27);
		contentPane.add(lblApellido);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTelefono.setBounds(181, 188, 76, 27);
		contentPane.add(lblTelefono);
		
		JLabel lblFecha_Nacimiento = new JLabel("Fecha Nacimiento:");
		lblFecha_Nacimiento.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFecha_Nacimiento.setBounds(181, 245, 137, 27);
		contentPane.add(lblFecha_Nacimiento);
		
		tfNombre = new JTextField();
		tfNombre.setFont(new Font("Tahoma", Font.BOLD, 14));
		tfNombre.setBounds(352, 87, 268, 26);
		contentPane.add(tfNombre);
		tfNombre.setColumns(10);
		
		tfApellido = new JTextField();
		tfApellido.setFont(new Font("Tahoma", Font.BOLD, 14));
		tfApellido.setColumns(10);
		tfApellido.setBounds(352, 141, 268, 26);
		contentPane.add(tfApellido);
		
		tfTelefono = new JTextField();
		tfTelefono.setFont(new Font("Tahoma", Font.BOLD, 14));
		tfTelefono.setColumns(10);
		tfTelefono.setBounds(352, 188, 268, 27);
		contentPane.add(tfTelefono);
		
		tfFecha_Nacimiento = new JTextField();
		tfFecha_Nacimiento.setFont(new Font("Tahoma", Font.BOLD, 14));
		tfFecha_Nacimiento.setColumns(10);
		tfFecha_Nacimiento.setBounds(352, 243, 268, 27);
		contentPane.add(tfFecha_Nacimiento);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.setFont(new Font("Verdana", Font.BOLD, 20));
		btnMostrar.setBounds(545, 333, 106, 35);
		contentPane.add(btnMostrar);
	}
}
