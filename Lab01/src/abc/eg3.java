package abc;

import javax.swing.JOptionPane;
public class eg3 {
	public static void main(String[] argv) {
		String result;
		result = JOptionPane.showInputDialog("Please enter your name:");
		JOptionPane.showMessageDialog(null, "hi " + result);
		System.exit(0);
	}
}
