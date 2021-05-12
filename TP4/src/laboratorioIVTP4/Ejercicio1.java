package laboratorioIVTP4;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNombre;
	private JTextField tfApellido;
	private JTextField tfTelefono;
	private JTextField tfFecha_Nacimiento;
	private JTextArea taDatos;
	
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
		lblNombre.setBounds(108, 86, 76, 27);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblApellido.setBounds(108, 140, 76, 27);
		contentPane.add(lblApellido);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTelefono.setBounds(108, 188, 76, 27);
		contentPane.add(lblTelefono);
		
		JLabel lblFecha_Nacimiento = new JLabel("Fecha Nacimiento:");
		lblFecha_Nacimiento.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFecha_Nacimiento.setBounds(108, 245, 137, 27);
		contentPane.add(lblFecha_Nacimiento);
		
		tfNombre = new JTextField();
		tfNombre.setFont(new Font("Tahoma", Font.BOLD, 14));
		tfNombre.setBounds(295, 87, 268, 26);
		contentPane.add(tfNombre);
		tfNombre.setColumns(10);
		
		tfApellido = new JTextField();
		tfApellido.setFont(new Font("Tahoma", Font.BOLD, 14));
		tfApellido.setColumns(10);
		tfApellido.setBounds(295, 141, 268, 26);
		contentPane.add(tfApellido);
		
		tfTelefono = new JTextField();
		tfTelefono.setFont(new Font("Tahoma", Font.BOLD, 14));
		tfTelefono.setColumns(10);
		tfTelefono.setBounds(295, 188, 268, 27);
		contentPane.add(tfTelefono);
		
		tfFecha_Nacimiento = new JTextField();
		tfFecha_Nacimiento.setFont(new Font("Tahoma", Font.BOLD, 14));
		tfFecha_Nacimiento.setColumns(10);
		tfFecha_Nacimiento.setBounds(295, 245, 268, 27);
		contentPane.add(tfFecha_Nacimiento);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ComprobarCamposVacios()) {
					MuestraDatos();
				}
				
			}
		});
		btnMostrar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnMostrar.setBounds(716, 308, 137, 50);
		contentPane.add(btnMostrar);
		
		taDatos = new JTextArea();
		taDatos.setFont(new Font("Tahoma", Font.BOLD, 14));
		taDatos.setBounds(663, 89, 236, 183);
		contentPane.add(taDatos);
	}
	public boolean ComprobarCamposVacios() {
		if(tfNombre.getText().isEmpty() && tfApellido.getText().isEmpty() && tfTelefono.getText().isEmpty()
				&& tfFecha_Nacimiento.getText().isEmpty()) {
			JOptionPane.showMessageDialog(rootPane, "Ningun campo puede quedar vacio");
			return false;
		}
		else if(tfNombre.getText().isEmpty()) {
			JOptionPane.showMessageDialog(rootPane, "El campo Nombre esta vacio");
			return false;
		}
		else if(tfApellido.getText().isEmpty()) {
			JOptionPane.showMessageDialog(rootPane, "El campo Apellido esta vacio");
			return false;
		}
		else if(tfTelefono.getText().isEmpty()) {
			JOptionPane.showMessageDialog(rootPane, "El campo Telefono esta vacio");
			return false;
		}
		else if(tfFecha_Nacimiento.getText().isEmpty()) {
			JOptionPane.showMessageDialog(rootPane, "El campo Fecha de Nacimineto esta vacio");
			return false;
		}
		return true;
	}
	public void MuestraDatos() {
		taDatos.setText("Nombre: " + tfNombre.getText() + "\n"
				+ "Apellido: " + tfApellido.getText() + "\n"
				+ "Telefono: " + tfTelefono.getText() + "\n"
				+ "Fecha de Nacimiento: " + tfFecha_Nacimiento.getText());
	}
}
