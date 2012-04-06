/**
 * 
 */
package myFirstGUI;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

/**
 * @author Shadab
 * 
 */
public class TextInput extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;
	private JTextField jTextField1 = null;
	private JButton jButton1 = null;
	private JLabel jLabel1 = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			
			public void run() {

				TextInput thisClass = new TextInput();

				thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				thisClass.setVisible(true);
			}
		});
	}

	/**
	 * This is the default constructor
	 */
	public TextInput() {

		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {

		this.setSize(300, 150);
		this.setContentPane(getJContentPane());
		this.setTitle("GUI - Text Input Elements");
		this.setResizable(false);
		this.setLocationRelativeTo(null);
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {

		if (jContentPane == null)
		{
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(getJTextField1());
			jContentPane.add(getJButton1());
			jContentPane.add(getJLabel1());
		}
		return jContentPane;
	}

	private JTextField getJTextField1() {

		if (jTextField1 == null)
		{
			jTextField1 = new JTextField();
			jTextField1.setBounds(120, 20, 150, 25);
		}
		return jTextField1;
	}

	private JButton getJButton1() {

		if (jButton1 == null)
		{
			jButton1 = new JButton();
			jButton1.setBounds(120, 60, 100, 25);
			jButton1.setText("Click Me!");

			jButton1.addActionListener(new java.awt.event.ActionListener() {

				public void actionPerformed(java.awt.event.ActionEvent e) {

					JTextField jTextField1 = getJTextField1();
					String message = jTextField1.getText();
					
					if (message.trim().isEmpty() == true)
					{
						message = "WTF! Enter some characters first.";
						jTextField1.setText(null);
					}
					
					JOptionPane.showMessageDialog(null, message, "Go Away",
							JOptionPane.INFORMATION_MESSAGE);
				}
			});
		}
		return jButton1;
	}

	private JLabel getJLabel1() {

		if (jLabel1 == null)
		{
			jLabel1 = new JLabel();
			jLabel1.setBounds(10, 20, 105, 25);
			jLabel1.setText("Enter Some Text: ");
		}
		return jLabel1;
	}

}
