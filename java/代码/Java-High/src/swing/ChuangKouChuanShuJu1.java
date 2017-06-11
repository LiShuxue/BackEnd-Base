package swing;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
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
public class ChuangKouChuanShuJu1 extends javax.swing.JFrame {
	private JPanel jPanel1;
	private JButton jButton1;
	private JTextField jTextField1;
	private JLabel jLabel1;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				ChuangKouChuanShuJu1 inst = new ChuangKouChuanShuJu1();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public ChuangKouChuanShuJu1() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("\u7b2c\u4e00\u4e2a\u7a97\u53e3");
			{
				jPanel1 = new JPanel();
				getContentPane().add(jPanel1, BorderLayout.CENTER);
				jPanel1.setLayout(null);
				{
					jLabel1 = new JLabel();
					jPanel1.add(jLabel1);
					jLabel1.setText("\u8bf7\u8f93\u5165\u6570\u636e");
					jLabel1.setBounds(17, 25, 91, 17);
				}
				{
					jTextField1 = new JTextField();
					jPanel1.add(jTextField1);
					jTextField1.setBounds(98, 22, 157, 24);
				}
				{
					jButton1 = new JButton();
					jPanel1.add(jButton1);
					jButton1.setText("\u786e\u5b9a");
					jButton1.setBounds(193, 80, 62, 24);
					jButton1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							//点击按钮时，需要实例化第二个窗口
							SwingUtilities.invokeLater(new Runnable() {
								public void run() {
									//获得文本框数据
									String msg = jTextField1.getText();
									//传给第二个窗口
									ChuangKouChuanShuJu2 inst = ChuangKouChuanShuJu2.getInstance(msg);
									
									inst.setLocationRelativeTo(null);
									inst.setVisible(true);
									
									//将输入信息窗口隐藏，如果你需要。
									//ChuangKouChuanShuJu1.this.setVisible(false);
								}
							});
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
