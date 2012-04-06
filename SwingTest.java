import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import javax.swing.SwingUtilities;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class SwingTest {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				create();
			}
		});
	}

	private static void create() {

		JFrame frame = new JFrame();

		// Add the JPanel to this frame
		frame.setContentPane(new Application());

		frame.setSize(250, 150);
		frame.setLocationRelativeTo(null);

		// Exit application if the frame is closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// And off we go!
		frame.setVisible(true);
	}
}

class Application extends JPanel {

	private JTextField input;
	private JLabel     output;
	private JButton    button;

	Application() {

		super();
		initialize();
	}

	private void initialize() {

		input = new JTextField(20);
		add(input);

		output = new JLabel("Enter an Integer");
		add(output);

		button = new JButton("Calculate Square");
		button.addActionListener(new ButtonActionListener());
		add(button);
	}

	class ButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			try {
				long n = Long.parseLong(input.getText());
				output.setText("Square: " + (n * n));
			} catch (NumberFormatException ex) {
				output.setText("Invalid integer specified");
			}
		}
	}
}

