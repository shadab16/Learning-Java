import java.applet.Applet;

import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppletTest extends Applet {

	private TextField input;
	private Label output;
	private Button button;

	public void init() {

		setLayout(null);

		input = new TextField();
		input.setBounds(10, 20, 150, 30);
		add(input);

		button = new Button("Process");
		button.setBounds(10, 100, 150, 30);
		button.addActionListener(new ButtonActionListener());
		add(button);

		output = new Label();
		output.setBounds(10, 60, 150, 30);
		add(output);
	}

	class ButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			try {
				int n = Integer.parseInt(input.getText());
				output.setText("Square: " + (n * n));
			} catch (NumberFormatException ex) {
				output.setText("Invalid Number.");
			}
		}
	}
}

