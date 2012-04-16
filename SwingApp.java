import javax.swing.SwingUtilities;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SwingApp {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {

				JFrame app = new Signin();
				app.setVisible(true);
			}
		});
	}
}

class Signin extends JFrame {

	private JPanel jContentPane = null;
	private JButton jSignupButton = null;

	Signin() {

		super();

		setSize(400, 250);
		setResizable(false);
		setContentPane(getJContentPane());
		setTitle("Signin Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private JButton getJSignupButton() {

		jSignupButton = new JButton("Sign Up");
		jSignupButton.setBounds(30, 10, 100, 30);

		jSignupButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame s = new Signup();
				s.setVisible(true);	// show signup frame
				setVisible(false);	// hide current frame
			}
		});

		return jSignupButton;		
	}

	private JPanel getJContentPane() {

		jContentPane = new JPanel();
		jContentPane.setLayout(null);
		jContentPane.add(getJSignupButton());

		return jContentPane;
	}
}

class Signup extends JFrame {

	private JPanel jContentPane = null;

	Signup() {

		super();

		setSize(400, 250);
		setResizable(false);
		setContentPane(getJContentPane());
		setTitle("Signup Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private JPanel getJContentPane() {

		jContentPane = new JPanel();
		jContentPane.setLayout(null);
		// jContentPane.add();

		return jContentPane;
	}
}

