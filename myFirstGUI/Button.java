/**
 * 
 */
package myFirstGUI;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.awt.Color;

/**
 * @author Shadab
 * 
 */
public class Button extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;

	private JButton btnButton1 = null;
	private JButton btnButton2 = null;
	private JButton btnButton3 = null;
	private JButton btnButton4 = null;

	private JLabel lblLabel1 = null;

	private int intCounter = 0;

	/**
	 * This method initializes btnButton1
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getBtnButton1() {

		if (btnButton1 == null)
		{
			btnButton1 = new JButton();
			btnButton1.setBounds(25, 15, 115, 25);
			btnButton1.setText("Show Popup");
			btnButton1.addActionListener(new java.awt.event.ActionListener() {

				public void actionPerformed(java.awt.event.ActionEvent e) {

					JOptionPane.showMessageDialog(getJContentPane(),
							"You clicked Button 1", "Title 1",
							JOptionPane.PLAIN_MESSAGE);
				}
			});
		}
		return btnButton1;
	}

	/**
	 * This method initializes btnButton2
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getBtnButton2() {

		if (btnButton2 == null)
		{
			btnButton2 = new JButton();
			btnButton2.setBounds(25, 55, 115, 25);
			btnButton2.setText("Add to Count");
			btnButton2.addActionListener(new java.awt.event.ActionListener() {

				public void actionPerformed(java.awt.event.ActionEvent e) {

					incrementCounter();
					displayCounter();
				}
			});
		}
		return btnButton2;
	}

	/**
	 * This method initializes btnButton3
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getBtnButton3() {

		if (btnButton3 == null)
		{
			btnButton3 = new JButton();
			btnButton3.setBounds(160, 15, 115, 25);
			btnButton3.setText("Toggle Label");
			btnButton3.addActionListener(new java.awt.event.ActionListener() {

				public void actionPerformed(java.awt.event.ActionEvent e) {

					JLabel label = getLblLabel1();

					if (label.isVisible() == true)
					{
						label.setVisible(false);
						getBtnButton2().setEnabled(false);
					}
					else
					{
						label.setVisible(true);
						getBtnButton2().setEnabled(true);
					}
				}
			});
		}
		return btnButton3;
	}

	private JButton getBtnButton4() {

		if (btnButton4 == null)
		{
			btnButton4 = new JButton();
			btnButton4.setBounds(160, 55, 115, 25);
			btnButton4.setText("Exit App.");
			btnButton4.addActionListener(new java.awt.event.ActionListener() {

				public void actionPerformed(java.awt.event.ActionEvent e) {

					System.exit(0);
				}
			});
		}
		return btnButton4;
	}

	/**
	 * This method initializes lblLabel1
	 * 
	 * @return javax.swing.JLabel
	 */
	private JLabel getLblLabel1() {

		if (lblLabel1 == null)
		{
			lblLabel1 = new JLabel();
			lblLabel1.setBounds(25, 95, 250, 25);
			lblLabel1.setOpaque(true);
			lblLabel1.setBackground(new Color(255, 252, 240));
			lblLabel1.setHorizontalAlignment(SwingConstants.CENTER);
			lblLabel1.setText("");
		}
		return lblLabel1;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
	    try {
	        javax.swing.UIManager.setLookAndFeel(
	        		"com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
	    }
	    catch (javax.swing.UnsupportedLookAndFeelException e) {
	    }
	    catch (ClassNotFoundException e) {
	    }
	    catch (InstantiationException e) {
	    }
	    catch (IllegalAccessException e) {
	    }
		*/
		
		SwingUtilities.invokeLater(new Runnable() {

			public void run() {

				Button thisClass = new Button();

				thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				thisClass.setVisible(true);
			}
		});
	}

	/**
	 * This is the default constructor
	 */
	public Button() {

		super();
		initialize();

		displayCounter();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {

		this.setSize(300, 175);
		this.setContentPane(getJContentPane());
		this.setTitle("GUI - Buttons & Labels");
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

			jContentPane.add(getBtnButton1());
			jContentPane.add(getBtnButton2());
			jContentPane.add(getBtnButton3());
			jContentPane.add(getBtnButton4());

			jContentPane.add(getLblLabel1());
		}
		return jContentPane;
	}

	private void incrementCounter() {

		if (intCounter < Integer.MAX_VALUE)
		{
			intCounter++;
		}
		else
		{
			intCounter = 0;
		}
	}

	private void displayCounter() {

		getLblLabel1().setText("The value of Counter is: " + intCounter);
	}

}
