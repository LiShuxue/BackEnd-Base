package com.zyw.demo;
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

/**
 * ��B���ڸı�Ϊ����
 * @author Administrator
 *
 */
public class NewJFrameB extends javax.swing.JFrame {
	private JPanel jPanel1;
	private JLabel jLabel1;
	//��������
	private String msg = null;
	private static NewJFrameB nb = null;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		
	}
	
	private NewJFrameB() {
		super();
		initGUI();
	}
	
	//֧�ִ����ݵĹ���
	/*private NewJFrameB(String msg){
		this.msg = msg;
		initGUI();
	}*/
	
	public static NewJFrameB getInstance(String msg){
		if(nb == null){
			nb = new NewJFrameB();
		}
		//���������õ�Lable��
		nb.jLabel1.setText(msg);
		return nb;
	}
	
	
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				jPanel1 = new JPanel();
				getContentPane().add(jPanel1, BorderLayout.CENTER);
				{
					jLabel1 = new JLabel();
					jPanel1.add(jLabel1);
					jLabel1.setPreferredSize(new java.awt.Dimension(111, 17));
					
					//����label��ʾ������
					//jLabel1.setText(this.msg);
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
