package swing;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

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
public class GunDongTiao extends javax.swing.JFrame {
	private JPanel jPanel1;
	private JScrollPane jScrollPane1;
	private JButton jButton1;
	private JButton jButton2;
	private JPanel jPanel2;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GunDongTiao inst = new GunDongTiao();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public GunDongTiao() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				jPanel1 = new JPanel();
				BorderLayout jPanel1Layout = new BorderLayout();
				jPanel1.setLayout(jPanel1Layout);
				getContentPane().add(jPanel1, BorderLayout.CENTER);
				jPanel1.setPreferredSize(new java.awt.Dimension(299, 309));
				{
					jScrollPane1 = new JScrollPane();
					jPanel1.add(jScrollPane1, BorderLayout.CENTER);
					jScrollPane1.setPreferredSize(new java.awt.Dimension(299, 277));
					{
						jPanel2 = new JPanel();
						jScrollPane1.setViewportView(jPanel2);
						jPanel2.setLayout(null);
						jPanel2.setPreferredSize(new java.awt.Dimension(296, 363));
						{
							jButton1 = new JButton();
							jPanel2.add(jButton1);
							jButton1.setText("jButton1");
							jButton1.setBounds(117, 5, 62, 24);
						}
						{
							jButton2 = new JButton();
							jPanel2.add(jButton2);
							jButton2.setText("jButton2");
							jButton2.setBounds(171, 292, 62, 24);
						}
					}
				}
			}
			pack();
			this.setSize(315, 173);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
