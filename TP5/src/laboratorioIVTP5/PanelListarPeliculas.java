package laboratorioIVTP5;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JList;

public class PanelListarPeliculas extends JPanel {

	private static final long serialVersionUID = 1L;
	private JList lPeliculas;

	public PanelListarPeliculas() {
		setLayout(null);
		
		JLabel lblPeliculas = new JLabel("Peliculas");
		lblPeliculas.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPeliculas.setBounds(72, 128, 76, 16);
		add(lblPeliculas);
		
		lPeliculas = new JList();
		lPeliculas.setBounds(141, 25, 286, 252);
		add(lPeliculas);
		
	}

}
