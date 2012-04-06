/**
 * 
 */
package myFirstGUI;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Rectangle;

/**
 * @author Shadab
 *
 */
public class FirstGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JButton jButton = null;
	
	/**
	 * This method initializes jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton() {
		
		if (jButton == null) {
			
			jButton = new JButton();
			jButton.setBounds(new Rectangle(61, 31, 270, 46));
			jButton.setText("Click ME!");
			
			jButton.addMouseListener(new java.awt.event.MouseAdapter() {
				
				public void mouseClicked(java.awt.event.MouseEvent e) {
					
					JOptionPane.showMessageDialog(
							getJContentPane(),
							"Hell Yeah!",
							"It works!",
							JOptionPane.PLAIN_MESSAGE
					);
				}
			});
		}
		
		return jButton;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			public void run() {
				
				FirstGUI thisClass = new FirstGUI();
				thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				thisClass.setVisible(true);
			}
		});
	}

	/**
	 * This is the default constructor
	 */
	public FirstGUI() {
		
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		
		this.setSize(400, 250);
		this.setResizable(false);
		this.setContentPane(getJContentPane());
		this.setTitle("JFrame : First GUI Program");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		
		if (jContentPane == null) {
			
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(getJButton(), null);
		}
		
		return jContentPane;
	}

}
