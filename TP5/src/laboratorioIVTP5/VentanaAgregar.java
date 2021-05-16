package laboratorioIVTP5;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class VentanaAgregar extends JFrame {


	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNombre;
	private JComboBox<String> cbGenero;
	private JMenuItem mntmAgregar;
	private JMenuItem mntmListar;
	private JButton btnAceptar;
	private JLabel lblid;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaAgregar frame = new VentanaAgregar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public VentanaAgregar() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Programa");
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 462, 21);
		contentPane.add(menuBar);
		
		JMenu mnPeliculas = new JMenu("Peliculas");
		menuBar.add(mnPeliculas);
		
		mntmAgregar = new JMenuItem("Agregar");
		mntmAgregar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				VentanaAgregar va = new VentanaAgregar();
				va.setVisible(true);
			}
		});
		mnPeliculas.add(mntmAgregar);
		
		mntmListar = new JMenuItem("Listar");
		mntmListar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				VentanaListar vl = new VentanaListar();
				vl.setVisible(true);
			}
		});
		mnPeliculas.add(mntmListar);
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblId.setBounds(57, 58, 31, 14);
		contentPane.add(lblId);
		
		JLabel lblCategoria = new JLabel("Nombre");
		lblCategoria.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCategoria.setBounds(57, 98, 67, 21);
		contentPane.add(lblCategoria);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblGenero.setBounds(57, 145, 54, 14);
		contentPane.add(lblGenero);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAceptar.setBounds(57, 185, 102, 25);
		contentPane.add(btnAceptar);
		
		cbGenero = new JComboBox<String>();
		cbGenero.setFont(new Font("Tahoma", Font.BOLD, 13));
		cbGenero.setBounds(159, 143, 133, 20);
		contentPane.add(cbGenero);
		
		tfNombre = new JTextField();
		tfNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		tfNombre.setBounds(159, 99, 133, 20);
		contentPane.add(tfNombre);
		tfNombre.setColumns(10);
		
		lblid = new JLabel("New label");
		lblid.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblid.setBounds(159, 59, 67, 14);
		contentPane.add(lblid);
	}
}
