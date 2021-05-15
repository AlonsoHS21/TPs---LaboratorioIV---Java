package laboratorioIVTP5;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class VentanaPrincipal extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Toolkit miVentana = Toolkit.getDefaultToolkit();
		Dimension tamanoVentana = miVentana.getScreenSize();
		setSize(tamanoVentana.width/2, tamanoVentana.height/2); 
		setLocation(tamanoVentana.width/4,tamanoVentana.height/4); 
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 944, 21);
		panel.add(menuBar);
		
		JMenu mnPeliculas = new JMenu("Peliculas");
		menuBar.add(mnPeliculas);
		
		JMenuItem mntmAgregar = new JMenuItem("Agregar");
		mnPeliculas.add(mntmAgregar);
		mntmAgregar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				VentanaAgregar va = new VentanaAgregar();
				va.setVisible(true);
			}
		});
		
		JMenuItem mntmListar = new JMenuItem("Listar");
		mnPeliculas.add(mntmListar);
		mntmListar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				VentanaListar vl = new VentanaListar();
				vl.setVisible(true);
			}
			
		});
	}
}
