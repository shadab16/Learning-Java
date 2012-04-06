package firstLayoutGUI;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 * @author Shadab
 * 
 */
public class FirstGridBagLayout extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private GridBagLayout layoutManager = null;
	private JPanel contentPanel = null;
	
	private JLabel lblFirstName = null;
	private JLabel lblLastName = null;
	private JTextField txtFirstName = null;
	private JTextField txtLastName = null;
	private JButton btnSubmit = null;
	
	/**
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			
			public void run() {

				FirstGridBagLayout app = new FirstGridBagLayout();
				app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				app.setVisible(true);
			}
		});
	}
	
	/**
	 * The default constructor
	 */
	public FirstGridBagLayout() {

		super();
		initialize();
	}
	
	private void initialize() {

		this.setSize(300, 200);
		this.setMinimumSize(this.getSize());
		
		this.setContentPane(getContentPanel());
		this.setTitle("Using GridBagLayout - 1");
		
		this.setLocationRelativeTo(null);
	}
	
	private GridBagLayout getLayoutManager() {

		if (layoutManager == null)
		{
			layoutManager = new GridBagLayout();
		}
		return layoutManager;
	}
	
	/**
	 * This method initializes contentPanel
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getContentPanel() {

		if (contentPanel == null)
		{
			contentPanel = new JPanel(getLayoutManager());
			
			contentPanel.add(getLblFirstName());
			contentPanel.add(getTxtFirstName());
			
			contentPanel.add(getLblLastName());
			contentPanel.add(getTxtLastName());
			
			contentPanel.add(getBtnSubmit());
		}
		return contentPanel;
	}
	
	private JLabel getLblFirstName() {

		if (lblFirstName == null)
		{
			lblFirstName = new JLabel();
			lblFirstName.setText("First Name:");
			
			GridBagConstraints gbc = new GridBagConstraints();
			gbc.gridx = 0;
			gbc.gridy = 0;
			gbc.ipadx = 10;
			gbc.ipady = 15;
			
			getLayoutManager().setConstraints(lblFirstName, gbc);
		}
		return lblFirstName;
	}
	
	private JLabel getLblLastName() {

		if (lblLastName == null)
		{
			lblLastName = new JLabel();
			lblLastName.setText("Last Name:");
			
			GridBagConstraints gbc = new GridBagConstraints();
			gbc.gridx = 0;
			gbc.gridy = 1;
			gbc.ipadx = 10;
			gbc.ipady = 15;
			
			getLayoutManager().setConstraints(lblLastName, gbc);
		}
		return lblLastName;
	}
	
	private JTextField getTxtFirstName() {

		if (txtFirstName == null)
		{
			txtFirstName = new JTextField(10);
			
			GridBagConstraints gbc = new GridBagConstraints();
			gbc.gridx = 1;
			gbc.gridy = 0;
			
			getLayoutManager().setConstraints(txtFirstName, gbc);
		}
		return txtFirstName;
	}
	
	private JTextField getTxtLastName() {

		if (txtLastName == null)
		{
			txtLastName = new JTextField(10);
			
			GridBagConstraints gbc = new GridBagConstraints();
			gbc.gridx = 1;
			gbc.gridy = 1;
			
			getLayoutManager().setConstraints(txtLastName, gbc);
		}
		return txtLastName;
	}
	
	private JButton getBtnSubmit() {

		if (btnSubmit == null)
		{
			btnSubmit = new JButton("Submit Data");
			
			GridBagConstraints gbc = new GridBagConstraints();
			gbc.gridx = 1;
			gbc.gridy = 2;
			gbc.fill = GridBagConstraints.HORIZONTAL;
			
			getLayoutManager().setConstraints(btnSubmit, gbc);
			
			btnSubmit.addActionListener(this);
		}
		return btnSubmit;
	}
	
	public void actionPerformed(ActionEvent e) {

		String firstName = getTxtFirstName().getText().trim();
		String lastName = getTxtLastName().getText().trim();
		
		JOptionPane.showMessageDialog(getContentPanel(),
				"Data : " + firstName + " " + lastName,
				"Submitted Data", JOptionPane.PLAIN_MESSAGE);
	}
	
}
