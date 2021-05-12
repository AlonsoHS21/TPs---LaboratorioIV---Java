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
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ejercicio2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNota_1;
	private JTextField tfNota_2;
	private JTextField tfNota_3;
	private JTextField tfPromedio;
	private JTextField tfCondicion;
	private JLabel lblTps;
	private JButton btnNuevo;
	private JButton btnSalir;
	private JComboBox<String> cbTps;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio2 frame = new Ejercicio2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Ejercicio2() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		Toolkit miVentana = Toolkit.getDefaultToolkit();
		Dimension tamanoVentana = miVentana.getScreenSize();
		setSize(640, 444); 
		setLocation(tamanoVentana.width/4,tamanoVentana.height/4);
		setTitle("Promedio");
		
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNota_1 = new JLabel("Nota 1:");
		lblNota_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNota_1.setBounds(118, 53, 59, 22);
		contentPane.add(lblNota_1);
		
		JLabel lblNota_2 = new JLabel("Nota 2:");
		lblNota_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNota_2.setBounds(118, 94, 59, 22);
		contentPane.add(lblNota_2);
		
		JLabel lblNota_3 = new JLabel("Nota 3:");
		lblNota_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNota_3.setBounds(118, 137, 59, 22);
		contentPane.add(lblNota_3);
		
		tfNota_1 = new JTextField();
		tfNota_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char num = e.getKeyChar();
				CheckOnlyNumbers(num,e);
			}
		});
		tfNota_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		tfNota_1.setBounds(248, 54, 155, 25);
		contentPane.add(tfNota_1);
		tfNota_1.setColumns(10);
		
		tfNota_2 = new JTextField();
		tfNota_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char num = e.getKeyChar();
				CheckOnlyNumbers(num,e);
			}
		});
		tfNota_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		tfNota_2.setColumns(10);
		tfNota_2.setBounds(248, 95, 155, 25);
		contentPane.add(tfNota_2);
		
		tfNota_3 = new JTextField();
		tfNota_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char num = e.getKeyChar();
				CheckOnlyNumbers(num,e);
			}
		});
		tfNota_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		tfNota_3.setColumns(10);
		tfNota_3.setBounds(248, 138, 155, 25);
		contentPane.add(tfNota_3);
		
		JLabel lblPromedio = new JLabel("Promedio:");
		lblPromedio.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPromedio.setBounds(118, 272, 77, 22);
		contentPane.add(lblPromedio);
		
		JLabel lblCondicion = new JLabel("Condicion:");
		lblCondicion.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCondicion.setBounds(118, 319, 77, 22);
		contentPane.add(lblCondicion);
		
		tfPromedio = new JTextField();
		tfPromedio.setFont(new Font("Tahoma", Font.BOLD, 14));
		tfPromedio.setColumns(10);
		tfPromedio.setBounds(248, 273, 155, 25);
		contentPane.add(tfPromedio);
		
		tfCondicion = new JTextField();
		tfCondicion.setFont(new Font("Tahoma", Font.BOLD, 14));
		tfCondicion.setColumns(10);
		tfCondicion.setBounds(248, 320, 155, 25);
		contentPane.add(tfCondicion);
		
		lblTps = new JLabel("TPS");
		lblTps.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTps.setBounds(118, 178, 59, 22);
		contentPane.add(lblTps);
		
		cbTps = new JComboBox<String>(); //Cambio a partir de Java 7
		cbTps.setFont(new Font("Tahoma", Font.BOLD, 14));
		cbTps.setSelectedIndex(-1);// Para que cuando se cree no haya una eleccion predeterminada
		cbTps.addItem("Aprobado"); //Le agrego a CB los items para que el usuario pueda elegir
		cbTps.addItem("Desaprobado");
		cbTps.setBounds(248, 179, 155, 22);
		contentPane.add(cbTps);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				if(verificarCampos()) {
					MostrarDatos();
				}
			}
		});
		btnCalcular.setBounds(473, 113, 121, 46);
		contentPane.add(btnCalcular);
		
		btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				LimpiarTodosLosCampos();
			}
		});
		btnNuevo.setBounds(473, 168, 121, 46);
		contentPane.add(btnNuevo);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnSalir.setBounds(473, 225, 121, 46);
		contentPane.add(btnSalir);
	}
	public void CheckOnlyNumbers(char caracter,KeyEvent e) {
		if(Character.isLetter(caracter)) { //if variable num is not a number
			getToolkit().beep(); //Get a sound -> si esta comentado se bugea el sonido de error
			e.consume(); //Funciona para no llamar a mas eventos como el KeyListener -> si esta comentado no borra la tecla erronea ingresada
			JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros");
		}
	}
	public boolean verificarCampos() {
		if(tfNota_1.getText().isEmpty() && tfNota_2.getText().isEmpty() && tfNota_3.getText().isEmpty()) {
			JOptionPane.showMessageDialog(rootPane, "Todos los campos estan vacios");
			return false;
		}
		if(tfNota_1.getText().isEmpty()) {
			JOptionPane.showMessageDialog(rootPane, "El campo Nota 1 esta vacio");
			return false;
		}
		if(tfNota_2.getText().isEmpty()) {
			JOptionPane.showMessageDialog(rootPane, "El campo Nota 2 esta vacio");
			return false;
		}
		if(tfNota_3.getText().isEmpty()) {
			JOptionPane.showMessageDialog(rootPane, "El campo Nota 3 esta vacio");
			return false;
		}
		return true;
	}
	public void MostrarDatos() {
		//Calculo de Promedio
		float nota1 = Float.parseFloat(tfNota_1.getText());
		float nota2 = Float.parseFloat(tfNota_2.getText());
		float nota3 = Float.parseFloat(tfNota_3.getText());
		
		tfPromedio.setText(Float.toString((nota1 + nota2 + nota3)/3));
		
		//Calculo de Condicion
		if(cbTps.getSelectedItem().toString() == "Aprobado") {
			if(nota1 < 6 || nota2 < 6 || nota3 < 6) {
				tfCondicion.setText("Libre");
			}
			else if(nota1 >= 8 || nota2 >= 8 || nota3 >= 8) { //El TP se supone que esta aprobado 
				tfCondicion.setText("Promocionado");
			}
			else {
				tfCondicion.setText("Regular");
			}
		}
		else {
			tfCondicion.setText("Libre");
		}
	}
	public void LimpiarTodosLosCampos() {
		tfNota_1.setText(null);
		tfNota_2.setText(null);
		tfNota_3.setText(null);
		cbTps.setSelectedIndex(-1);
		tfPromedio.setText(null);
		tfCondicion.setText(null);
	}
}
