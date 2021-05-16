package laboratorioIVTP5;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelAgregarPeliculas extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField tfNombre;
	private JComboBox<String> cbGenero;
	private JButton btnAceptar;
	
	public PanelAgregarPeliculas() {
		
		setLayout(null);
		
		JLabel lblid = new JLabel("ID");
		lblid.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblid.setBounds(78, 79, 46, 14);
		add(lblid);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre.setBounds(78, 120, 60, 14);
		add(lblNombre);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblGenero.setBounds(78, 159, 60, 14);
		add(lblGenero);
		
		tfNombre = new JTextField();
		tfNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		tfNombre.setBounds(171, 118, 123, 20);
		add(tfNombre);
		tfNombre.setColumns(10);
		
		JLabel lblID = new JLabel("");
		lblID.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblID.setBounds(171, 79, 46, 14);
		add(lblID);
		
		cbGenero = new JComboBox<String>();
		cbGenero.setFont(new Font("Tahoma", Font.BOLD, 13));
		cbGenero.setBounds(171, 157, 123, 20);
		add(cbGenero);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAceptar.setBounds(78, 209, 100, 23);
		add(btnAceptar);
		
	}

}
