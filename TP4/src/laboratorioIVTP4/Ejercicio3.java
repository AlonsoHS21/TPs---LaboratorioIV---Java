package laboratorioIVTP4;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class Ejercicio3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfCantidad_Horas;
	private JRadioButton rdbtnWindows;
	private JRadioButton rdbtnMac;
	private JRadioButton rdbtnLinux;
	private JCheckBox chckbxProgramacion;
	private JCheckBox chckbxAdministracion;
	private JCheckBox chckbxDiseno_Grafico;

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
		
		JPanel pEspecialidad = new JPanel();
		pEspecialidad.setBorder(new LineBorder(new Color(0, 0, 0)));
		pEspecialidad.setForeground(Color.BLACK);
		pEspecialidad.setBounds(198, 172, 564, 135);
		contentPane.add(pEspecialidad);
		pEspecialidad.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Elije una especialidad");
		lblNewLabel_1.setBounds(47, 48, 154, 23);
		pEspecialidad.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		chckbxProgramacion = new JCheckBox("Programacion");
		chckbxProgramacion.setBounds(296, 7, 127, 23);
		pEspecialidad.add(chckbxProgramacion);
		chckbxProgramacion.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		chckbxAdministracion = new JCheckBox("Administracion");
		chckbxAdministracion.setBounds(296, 48, 127, 23);
		pEspecialidad.add(chckbxAdministracion);
		chckbxAdministracion.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		chckbxDiseno_Grafico = new JCheckBox("Dise\u00F1o Gr\u00E1fico"); //Diseño Grafico
		chckbxDiseno_Grafico.setBounds(296, 92, 127, 23);
		pEspecialidad.add(chckbxDiseno_Grafico);
		chckbxDiseno_Grafico.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JPanel pSistema_Operativo = new JPanel();
		pSistema_Operativo.setForeground(Color.BLACK);
		pSistema_Operativo.setBorder(new LineBorder(new Color(0, 0, 0)));
		pSistema_Operativo.setBounds(198, 75, 567, 63);
		contentPane.add(pSistema_Operativo);
		pSistema_Operativo.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Elije un sistema operativo");
		lblNewLabel.setBounds(31, 21, 176, 17);
		pSistema_Operativo.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		// ------ Creamos los radio buttons --------------
		rdbtnWindows = new JRadioButton("Windows");
		rdbtnWindows.setBounds(229, 18, 109, 23);
		pSistema_Operativo.add(rdbtnWindows);
		rdbtnWindows.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		rdbtnMac = new JRadioButton("Mac");
		rdbtnMac.setBounds(340, 18, 69, 23);
		pSistema_Operativo.add(rdbtnMac);
		rdbtnMac.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		rdbtnLinux = new JRadioButton("Linux");
		rdbtnLinux.setBounds(421, 18, 127, 23);
		pSistema_Operativo.add(rdbtnLinux);
		rdbtnLinux.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		// --------- Los agrupamos para que no se puedan elegir mas de uno  --------------
		
		ButtonGroup grupo1 = new ButtonGroup();
		grupo1.add(rdbtnWindows);
		grupo1.add(rdbtnMac);
		grupo1.add(rdbtnLinux);
		
		// ------------------------------------------------
		
		JLabel lblNewLabel_2 = new JLabel(" Cantidad de horas en el computador:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(225, 355, 283, 17);
		contentPane.add(lblNewLabel_2);
		
		tfCantidad_Horas = new JTextField();
		tfCantidad_Horas.setBounds(540, 350, 150, 31);
		contentPane.add(tfCantidad_Horas);
		tfCantidad_Horas.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ComprobarCampos();
			}
		});
		btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAceptar.setBounds(604, 408, 127, 47);
		contentPane.add(btnAceptar);
	}
	public void ComprobarCampos() {
		//No hace falta los else en los if porque solo se puede elegir 1 en los rdbtn
		String sistema = "";
		if(rdbtnWindows.isSelected()) {
			sistema = rdbtnWindows.getText();
		}
		else if(rdbtnMac.isSelected()) {
			sistema = rdbtnMac.getText();
		}
		else if(rdbtnLinux.isSelected()) {
			sistema = rdbtnLinux.getText();
		}
		else {
			JOptionPane.showMessageDialog(rootPane, "Elija un Sistema Operativo");
		}
		if(tfCantidad_Horas.getText().isEmpty()) {
			JOptionPane.showMessageDialog(rootPane, "Indique la cantidad de horas");
		}
	}
	
}
