package swing;
import java.awt.BorderLayout;
import javax.swing.JEditorPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSeparator;
import javax.swing.JTextArea;

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
public class JiShiBen extends javax.swing.JFrame {
	private JPanel jPanel1;
	private JMenu jMenu5;
	private JMenuItem jMenuItem14;
	private JMenuItem jMenuItem13;
	private JMenuItem jMenuItem9;
	private JMenuItem jMenuItem12;
	private JTextArea jTextArea1;
	private JMenuItem jMenuItem22;
	private JSeparator jSeparator6;
	private JMenuItem jMenuItem21;
	private JMenuItem jMenuItem20;
	private JMenuItem jMenuItem19;
	private JRadioButtonMenuItem jRadioButtonMenuItem1;
	private JMenuItem jMenuItem18;
	private JMenuItem jMenuItem17;
	private JSeparator jSeparator5;
	private JMenuItem jMenuItem16;
	private JMenuItem jMenuItem15;
	private JSeparator jSeparator4;
	private JMenuItem jMenuItem11;
	private JMenuItem jMenuItem10;
	private JSeparator jSeparator3;
	private JMenuItem jMenuItem8;
	private JMenuItem jMenuItem7;
	private JSeparator jSeparator2;
	private JMenuItem jMenuItem6;
	private JMenuItem jMenuItem5;
	private JSeparator jSeparator1;
	private JMenuItem jMenuItem4;
	private JMenuItem jMenuItem3;
	private JMenuItem jMenuItem2;
	private JMenuItem jMenuItem1;
	private JMenu jMenu4;
	private JMenu jMenu3;
	private JMenu jMenu2;
	private JMenu jMenu1;
	private JMenuBar jMenuBar1;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JiShiBen inst = new JiShiBen();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public JiShiBen() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				jMenuBar1 = new JMenuBar();
				setJMenuBar(jMenuBar1);
				{
					jMenu1 = new JMenu();
					jMenuBar1.add(jMenu1);
					jMenu1.setText("\u6587\u4ef6(F)");
					{
						jMenuItem1 = new JMenuItem();
						jMenu1.add(jMenuItem1);
						jMenuItem1.setText("\u65b0\u5efa(N)");
					}
					{
						jMenuItem2 = new JMenuItem();
						jMenu1.add(jMenuItem2);
						jMenuItem2.setText("\u6253\u5f00(O)");
					}
					{
						jMenuItem3 = new JMenuItem();
						jMenu1.add(jMenuItem3);
						jMenuItem3.setText("\u4fdd\u5b58(S)");
					}
					{
						jMenuItem4 = new JMenuItem();
						jMenu1.add(jMenuItem4);
						jMenuItem4.setText("\u53e6\u5b58\u4e3a(A)");
					}
					{
						jSeparator1 = new JSeparator();
						jMenu1.add(jSeparator1);
					}
					{
						jMenuItem5 = new JMenuItem();
						jMenu1.add(jMenuItem5);
						jMenuItem5.setText("\u9875\u9762\u8bbe\u7f6e(U)");
					}
					{
						jMenuItem6 = new JMenuItem();
						jMenu1.add(jMenuItem6);
						jMenuItem6.setText("\u6253\u5370(P)");
					}
					{
						jSeparator2 = new JSeparator();
						jMenu1.add(jSeparator2);
					}
					{
						jMenuItem7 = new JMenuItem();
						jMenu1.add(jMenuItem7);
						jMenuItem7.setText("\u9000\u51fa(X)");
					}
				}
				{
					jMenu2 = new JMenu();
					jMenuBar1.add(jMenu2);
					jMenu2.setText("\u7f16\u8f91(E)");
					{
						jMenuItem8 = new JMenuItem();
						jMenu2.add(jMenuItem8);
						jMenuItem8.setText("\u64a4\u9500(U)");
					}
					{
						jSeparator3 = new JSeparator();
						jMenu2.add(jSeparator3);
					}
					{
						jMenuItem9 = new JMenuItem();
						jMenu2.add(jMenuItem9);
						jMenuItem9.setText("\u526a\u5207(T)");
					}
					{
						jMenuItem10 = new JMenuItem();
						jMenu2.add(jMenuItem10);
						jMenuItem10.setText("\u590d\u5236(C)");
					}
					{
						jMenuItem11 = new JMenuItem();
						jMenu2.add(jMenuItem11);
						jMenuItem11.setText("\u7c98\u8d34(P)");
					}
					{
						jMenuItem12 = new JMenuItem();
						jMenu2.add(jMenuItem12);
						jMenuItem12.setText("\u5220\u9664(L)");
					}
					{
						jSeparator4 = new JSeparator();
						jMenu2.add(jSeparator4);
					}
					{
						jMenuItem13 = new JMenuItem();
						jMenu2.add(jMenuItem13);
						jMenuItem13.setText("\u67e5\u627e(F)");
					}
					{
						jMenuItem14 = new JMenuItem();
						jMenu2.add(jMenuItem14);
						jMenuItem14.setText("\u67e5\u627e\u4e0b\u4e00\u4e2a(N)");
					}
					{
						jMenuItem15 = new JMenuItem();
						jMenu2.add(jMenuItem15);
						jMenuItem15.setText("\u66ff\u6362(R)");
					}
					{
						jMenuItem16 = new JMenuItem();
						jMenu2.add(jMenuItem16);
						jMenuItem16.setText("\u8f6c\u5230(G)");
					}
					{
						jSeparator5 = new JSeparator();
						jMenu2.add(jSeparator5);
					}
					{
						jMenuItem17 = new JMenuItem();
						jMenu2.add(jMenuItem17);
						jMenuItem17.setText("\u5168\u9009(A)");
					}
					{
						jMenuItem18 = new JMenuItem();
						jMenu2.add(jMenuItem18);
						jMenuItem18.setText("\u65f6\u95f4/\u65e5\u671f(D)");
					}
				}
				{
					jMenu3 = new JMenu();
					jMenuBar1.add(jMenu3);
					jMenu3.setText("\u683c\u5f0f(O)");
					{
						jRadioButtonMenuItem1 = new JRadioButtonMenuItem();
						jMenu3.add(jRadioButtonMenuItem1);
						jRadioButtonMenuItem1.setText("\u81ea\u52a8\u6362\u884c(W)");
					}
					{
						jMenuItem19 = new JMenuItem();
						jMenu3.add(jMenuItem19);
						jMenuItem19.setText("\u5b57\u4f53(F)");
					}
				}
				{
					jMenu4 = new JMenu();
					jMenuBar1.add(jMenu4);
					jMenu4.setText("\u67e5\u770b(V)");
					{
						jMenuItem20 = new JMenuItem();
						jMenu4.add(jMenuItem20);
						jMenuItem20.setText("\u72b6\u6001\u680f(S)");
					}
				}
				{
					jMenu5 = new JMenu();
					jMenuBar1.add(jMenu5);
					jMenu5.setText("\u5e2e\u52a9(H)");
					{
						jMenuItem21 = new JMenuItem();
						jMenu5.add(jMenuItem21);
						jMenuItem21.setText("\u67e5\u770b\u5e2e\u52a9(H)");
					}
					{
						jSeparator6 = new JSeparator();
						jMenu5.add(jSeparator6);
					}
					{
						jMenuItem22 = new JMenuItem();
						jMenu5.add(jMenuItem22);
						jMenuItem22.setText("\u5173\u4e8e\u8bb0\u4e8b\u672c(A)");
					}
				}
			}
			{
				jPanel1 = new JPanel();
				BorderLayout jPanel1Layout = new BorderLayout();
				jPanel1.setLayout(jPanel1Layout);
				getContentPane().add(jPanel1, BorderLayout.CENTER);
				jPanel1.setPreferredSize(new java.awt.Dimension(383, 237));
				{
					jTextArea1 = new JTextArea();
					jPanel1.add(jTextArea1, BorderLayout.CENTER);
					jTextArea1.setPreferredSize(new java.awt.Dimension(383, 186));
				}
			}
			pack();
			this.setSize(399, 300);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
