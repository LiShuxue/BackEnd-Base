package swing;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class NewJFrame extends javax.swing.JFrame {
	private JPanel p1;
	private JButton jButton1;
	private JButton jButton5;
	private JButton jButton4;
	private JButton jButton3;
	private JButton jButton2;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				NewJFrame inst = new NewJFrame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public NewJFrame() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				p1 = new JPanel();
				BorderLayout p1Layout = new BorderLayout();
				getContentPane().add(p1, BorderLayout.CENTER);
				p1.setLayout(p1Layout);
				{
					jButton1 = new JButton();
					p1.add(jButton1, BorderLayout.NORTH);
					jButton1.setText("jButton1");
					jButton1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							JOptionPane.showMessageDialog(NewJFrame.this, "ÉÏ");
						}
					});
				}
				{
					jButton2 = new JButton();
					p1.add(jButton2, BorderLayout.SOUTH);
					jButton2.setText("jButton2");
					jButton2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							JOptionPane.showMessageDialog(NewJFrame.this, "ÏÂ");
						}
					});
				}
				{
					jButton3 = new JButton();
					p1.add(jButton3, BorderLayout.WEST);
					jButton3.setText("jButton3");
					jButton3.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							JOptionPane.showMessageDialog(NewJFrame.this, "×ó");
						}
					});
				}
				{
					jButton4 = new JButton();
					p1.add(jButton4, BorderLayout.EAST);
					jButton4.setText("jButton4");
					jButton4.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							JOptionPane.showMessageDialog(NewJFrame.this, "ÓÒ");
						}
					});
				}
				{
					jButton5 = new JButton();
					p1.add(jButton5, BorderLayout.CENTER);
					jButton5.setText("jButton5");
					jButton5.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							JOptionPane.showMessageDialog(NewJFrame.this, "ÖÐ");
						}
					});
				}
			}
			pack();
			setSize(400, 300);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
