package com.zyw.demo;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
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
	private JPanel jPanel1;
	private JTable jTable1;

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
				jPanel1 = new JPanel();
				BorderLayout jPanel1Layout = new BorderLayout();
				jPanel1.setLayout(jPanel1Layout);
				getContentPane().add(jPanel1, BorderLayout.NORTH);
				jPanel1.setPreferredSize(new java.awt.Dimension(384, 222));
				{
					//注意，一定将TableModel改为DefaultTableModel
					DefaultTableModel jTable1Model = 
							new DefaultTableModel(null,new String[] { "Column 1", "Column 2" });
					jTable1 = new JTable();
					//显示标题
					jPanel1.add(jTable1.getTableHeader(),BorderLayout.PAGE_START);
					//行设置 只能单选
					jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
					
					jPanel1.add(jTable1, BorderLayout.CENTER);
					jTable1.setModel(jTable1Model);
					
					//进行显示的模拟，自己创建一个集合，以后你是通过service获得集合
					List<Student> list = new ArrayList<>();
					list.add(new Student(1, "zhangsan"));
					list.add(new Student(2, "lisi"));
					list.add(new Student(3, "wangwu"));
					//给JTable指定数据,根据集合中数据的数量循环
					for (Student s : list) {
						//每次根据对象，创建一个“行”，将属性值放入数组
						Object[] row = {s.getId() , s.getName()};
						//将这个行指定给 DefaultTableModel 的对象jTable1Model
						jTable1Model.addRow(row);
					}
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




