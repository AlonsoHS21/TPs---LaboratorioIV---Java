package laboratorioIVTP4;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		tfNota_1.setBounds(248, 54, 155, 25);
		contentPane.add(tfNota_1);
		tfNota_1.setColumns(10);
		
		tfNota_2 = new JTextField();
		tfNota_2.setColumns(10);
		tfNota_2.setBounds(248, 95, 155, 25);
		contentPane.add(tfNota_2);
		
		tfNota_3 = new JTextField();
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
		tfPromedio.setColumns(10);
		tfPromedio.setBounds(248, 273, 155, 25);
		contentPane.add(tfPromedio);
		
		tfCondicion = new JTextField();
		tfCondicion.setColumns(10);
		tfCondicion.setBounds(248, 320, 155, 25);
		contentPane.add(tfCondicion);
		
		lblTps = new JLabel("TPS");
		lblTps.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTps.setBounds(118, 178, 59, 22);
		contentPane.add(lblTps);
		
		JComboBox<String> comboBox = new JComboBox<String>(); //Cambio a partir de Java 7
		comboBox.setBounds(248, 181, 155, 20);
		contentPane.add(comboBox);
		
		JButton btnCalcular = new JButton("Calcular");
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
	public void LimpiarTodosLosCampos() {
		
	}
}
