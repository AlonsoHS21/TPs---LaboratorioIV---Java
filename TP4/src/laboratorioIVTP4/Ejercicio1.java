package laboratorioIVTP4;

import java.awt.Color;
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
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

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
		lblNombre.setBounds(108, 111, 76, 27);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblApellido.setBounds(108, 168, 76, 27);
		contentPane.add(lblApellido);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTelefono.setBounds(108, 228, 76, 27);
		contentPane.add(lblTelefono);
		
		JLabel lblFecha_Nacimiento = new JLabel("Fecha Nacimiento:");
		lblFecha_Nacimiento.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFecha_Nacimiento.setBounds(108, 285, 137, 27);
		contentPane.add(lblFecha_Nacimiento);
		
		tfNombre = new JTextField();
		tfNombre.setFont(new Font("Tahoma", Font.BOLD, 14));
		tfNombre.setBounds(295, 112, 268, 26);
		contentPane.add(tfNombre);
		tfNombre.setColumns(10);
		
		tfApellido = new JTextField();
		tfApellido.setFont(new Font("Tahoma", Font.BOLD, 14));
		tfApellido.setColumns(10);
		tfApellido.setBounds(295, 169, 268, 26);
		contentPane.add(tfApellido);
		
		tfTelefono = new JTextField();
		tfTelefono.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char num = e.getKeyChar();
				CheckOnlyNumbers(num,e);
			}
		});
		tfTelefono.setFont(new Font("Tahoma", Font.BOLD, 14));
		tfTelefono.setColumns(10);
		tfTelefono.setBounds(295, 228, 268, 27);
		contentPane.add(tfTelefono);
		
		tfFecha_Nacimiento = new JTextField();
		tfFecha_Nacimiento.setFont(new Font("Tahoma", Font.BOLD, 14));
		tfFecha_Nacimiento.setColumns(10);
		tfFecha_Nacimiento.setBounds(295, 285, 268, 27);
		contentPane.add(tfFecha_Nacimiento);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(ComprobarCamposVacios()){
					case 1:{
						JOptionPane.showMessageDialog(rootPane, "Todos los campos estan correctos");
						MuestraDatos();
					}break;
					case 2:{
						tfNombre.setText(null);
						tfNombre.setBackground(Color.white);
						tfApellido.setText(null);
						tfApellido.setBackground(Color.white);
						tfTelefono.setText(null);
						tfTelefono.setBackground(Color.white);
						tfFecha_Nacimiento.setText(null);
						tfFecha_Nacimiento.setBackground(Color.white);
					}break;
					case 3:{
						tfNombre.setText(null);
						tfNombre.setBackground(Color.white);
					}break;
					case 4:{
						tfApellido.setText(null);
						tfApellido.setBackground(Color.white);
					}break;
					case 5:{
						tfTelefono.setText(null);
						tfTelefono.setBackground(Color.white);
					}break;
					case 6:{
						tfFecha_Nacimiento.setText(null);
						tfFecha_Nacimiento.setBackground(Color.white);
					}break;
					case 7:{
						tfTelefono.setText(null);
						tfTelefono.setBackground(Color.white);
					}break;
				}
				// Hay un problemita cuando un campo tiene texto y los demas no salta el mensaje de error
				// pero limpia todos los campos incluido ese en cuestion entonces como solucion podria 
				// hacer que ComprobarCamposVacios() sea un int y cada if devuelva un numero entonces
				// en el actionPerformed de Mostrar podria hacer switch y creando un metodo que reciba un
				// JTextFiel entonce borra el texto y setea en blanco el JTextField al que hacer
				// referencia el numero
			}
		});
		btnMostrar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnMostrar.setBounds(718, 343, 137, 50);
		contentPane.add(btnMostrar);
		
		taDatos = new JTextArea();
		taDatos.setFont(new Font("Tahoma", Font.BOLD, 14));
		taDatos.setBounds(662, 111, 236, 201);
		contentPane.add(taDatos);
	}
	public int ComprobarCamposVacios() {
		if(tfNombre.getText().isEmpty() && tfApellido.getText().isEmpty() && tfTelefono.getText().isEmpty()
				&& tfFecha_Nacimiento.getText().isEmpty()) {
			tfNombre.setBackground(Color.red);
			tfApellido.setBackground(Color.red);
			tfTelefono.setBackground(Color.red);
			tfFecha_Nacimiento.setBackground(Color.red);
			JOptionPane.showMessageDialog(rootPane, "Ningun campo puede quedar vacio");
			return 2;
		}
		else if(tfNombre.getText().isEmpty()) {
			tfNombre.setBackground(Color.red);
			JOptionPane.showMessageDialog(rootPane, "El campo Nombre esta vacio");
			return 3;
		}
		else if(tfApellido.getText().isEmpty()) {
			tfApellido.setBackground(Color.red);
			JOptionPane.showMessageDialog(rootPane, "El campo Apellido esta vacio");
			return 4;
		}
		else if(tfTelefono.getText().isEmpty()) {
			tfTelefono.setBackground(Color.red);
			JOptionPane.showMessageDialog(rootPane, "El campo Telefono esta vacio");
			return 5;
		}
		else if(tfFecha_Nacimiento.getText().isEmpty()) {
			tfFecha_Nacimiento.setBackground(Color.red);
			JOptionPane.showMessageDialog(rootPane, "El campo Fecha de Nacimineto esta vacio");
			return 6;
		}
		if(!(tfTelefono.getText().length() <= 10))  {
			JOptionPane.showMessageDialog(rootPane, "El Telefono no debe tener mas de 10 numeros");
			return 7;
		}
		return 1;
	}
	public void CheckOnlyNumbers(char caracter,KeyEvent e) {
		if(Character.isLetter(caracter)) { //if variable num is not a number
			getToolkit().beep(); //Get a sound -> si esta comentado se bugea el sonido de error
			e.consume(); //Funciona para no llamar a mas eventos como el KeyListener -> si esta comentado no borra la tecla erronea ingresada
			JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros");
		}
	}
	public void MuestraDatos() {
		taDatos.setText("Nombre: " + tfNombre.getText() + "\n"
				+ "Apellido: " + tfApellido.getText() + "\n"
				+ "Telefono: " + tfTelefono.getText() + "\n"
				+ "Fecha de Nacimiento: " + tfFecha_Nacimiento.getText());
	}
}
