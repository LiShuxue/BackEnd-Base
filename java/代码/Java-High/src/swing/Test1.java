package swing;

import javax.swing.JFrame;

public class Test1 {
	public static void main(String[] args) {
		JFrame frame = new myWindow();
	}
}

class myWindow extends JFrame {
	public myWindow() {
		setSize(400, 300);
		setLocationRelativeTo(null);//æ”÷–
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
