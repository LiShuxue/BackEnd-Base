package swing;
import java.awt.BorderLayout;
import javax.swing.JLabel;
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
public class ChuangKouChuanShuJu2 extends javax.swing.JFrame {
	private JPanel jPanel1;
	private JLabel jLabel1;
	
	//通过单例来实现
	//设置一个变量用来存信息
	private String msg = null;
	//设置一个私有的静态的对象
	private static ChuangKouChuanShuJu2 ck = null;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		
	}
	//私有化构造
	private ChuangKouChuanShuJu2() {
		super();
		initGUI();
	}

	//设置一个公有的静态方法来返回对象
	public static ChuangKouChuanShuJu2 getInstance(String msg) {
		if(ck == null) {
			ck = new ChuangKouChuanShuJu2();
		}
		ck.jLabel1.setText(msg);
		return ck;
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("\u7b2c\u4e8c\u4e2a\u7a97\u53e3");
			{
				jPanel1 = new JPanel();
				getContentPane().add(jPanel1, BorderLayout.CENTER);
				{
					jLabel1 = new JLabel();
					jPanel1.add(jLabel1);
					jLabel1.setPreferredSize(new java.awt.Dimension(103, 33));
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
