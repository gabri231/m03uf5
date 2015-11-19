package exemple;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class interfaz {

	private JFrame frame;
	private JTextField txtIntroduceTuNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfaz window = new interfaz();
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
	public interfaz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblTuNombre = new JLabel("Tu nombre");
		panel.add(lblTuNombre);
		
		JPanel panel0 = new JPanel();
		frame.getContentPane().add(panel0, BorderLayout.WEST);
		
		JLabel lblNewLabel = new JLabel("Prueba de texto");
		panel0.add(lblNewLabel);
		
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		
		txtIntroduceTuNombre = new JTextField();
		txtIntroduceTuNombre.setText("Introduce tu nombre");
		panel_1.add(txtIntroduceTuNombre);
		txtIntroduceTuNombre.setColumns(15);
		
		JButton button = new JButton("Enviar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialog d = new JDialog(frame, "hello", true);
				d.setLocationRelativeTo(frame);
				d.setVisible(true);
			}
		});
		panel_1.add(button);
		
		JComboBox comboBox = new JComboBox();
		panel_1.add(comboBox);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("New menu");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmAsdasd = new JMenuItem("asdasd");
		mnNewMenu.add(mntmAsdasd);
	}

}
