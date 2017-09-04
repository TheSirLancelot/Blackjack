package Blackjack;
import java.awt.EventQueue;
import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;


public class BlackJackGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BlackJackGUI window = new BlackJackGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BlackJackGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel gameArea = new JPanel();
		//todo: add background and card placements
		gameArea.setBounds(6, 6, 400, 466);
		try{
			BufferedImage bg = ImageIO.read(new File("/Users/williamweir10/GitHub/Blackjack/src/Blackjack/blackjack-table.png"));
			JLabel imgLabel = new JLabel(new ImageIcon(bg));
			gameArea.add(imgLabel);
		}
		catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Error with background image");
			System.exit(0);
		}
		frame.getContentPane().add(gameArea);
		
		JPanel buttonArea = new JPanel();
		//todo: identify which buttons are going to be needed and add them
		buttonArea.setBounds(407, 6, 387, 466);
		frame.getContentPane().add(buttonArea);
	}
}
