import java.awt.EventQueue;
import java.awt.BorderLayout;

import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Frame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class AwtTest {

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				TestFrame f = new TestFrame();
			}
		});
	}
}

class TestFrame {

	private Frame frame;
	private TextField input;
	private Label output;
	private Button button;

	public TestFrame() {
		init();
	}

	private void init() {

		frame = new Frame("Test AWT Frame");

		input = new TextField("", 20);
		frame.add(input, BorderLayout.NORTH);

		output = new Label();
		frame.add(output, BorderLayout.CENTER);

		button = new Button("Process");
		button.addActionListener(new ButtonActionListener());
		frame.add(button, BorderLayout.SOUTH);

		frame.setSize(300, 200);
		frame.setVisible(true);
	}

	class ButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			try {
				int n = Integer.parseInt(input.getText());
				output.setText("Square: " + (n * n));
			} catch (NumberFormatException ex) {
				output.setText("Invalid Integer.");
			}
		}
	}
}

