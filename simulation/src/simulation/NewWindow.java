package simulation;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NewWindow {
	private JFrame frame;
	private JPanel panelBlue, panelRed, panelGreen, panelGray, panelMain;
	private JLabel[][] pokemonPictures;
	private String[][] pokemonPicSource = {
			{},
			{},
			{}
	};
	private JLabel image;
	
	public NewWindow() {
		frame = new JFrame("Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1540, 900);
		frame.setLocationRelativeTo(null);
		
		panelMain = new JPanel(new GridBagLayout());
		panelRed = new JPanel(new GridBagLayout());
		panelGreen = new JPanel(new GridBagLayout());
		panelBlue = new JPanel(new GridBagLayout());
		panelGray = new JPanel(new GridBagLayout());
		
		panelMain.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		image = new JLabel();
		
		panelRed.setBackground(Color.red);
		c.gridy = 0;
		c.ipadx = 1540;
		c.ipady = 70;
		c.insets = new Insets(10,0,0,0);
		panelMain.add(panelRed, c);
		
		panelGreen.setBackground(Color.green);
		c.gridy = 1;
		panelMain.add(panelGreen, c);
		
		panelBlue.setBackground(Color.blue);
		c.gridy = 2;
		panelMain.add(panelBlue, c);
		
		panelGray.setBackground(Color.gray);
		image.setIcon(new ImageIcon("H:\\git\\simulation2\\simulation\\src\\simulation\\Images/Scorbunny.png"));
		panelGray.add(image);
		c.gridy = 3;
		c.ipady = 580;
		panelMain.add(panelGray, c);
		
		frame.setContentPane(panelMain);
		frame.setVisible(true);
	}
	

}