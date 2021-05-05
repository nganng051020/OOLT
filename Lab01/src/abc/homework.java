package abc;

import javax.swing.JOptionPane;
public class homework {
	public static void main(String[] argv) {
		String strA, strB;
		Double a, b, x;
		strA = JOptionPane.showInputDialog(null, 
				"Please enter a value: ", "ax + b = 0", 
				JOptionPane.INFORMATION_MESSAGE);
		a = Double.parseDouble(strA);
		
		strB = JOptionPane.showInputDialog(null, 
				"Please enter b value: ", "ax + b = 0", 
				JOptionPane.INFORMATION_MESSAGE);
		b = Double.parseDouble(strB);
		
		x = -b/a;
		JOptionPane.showMessageDialog(null, "x = " + x, "ax + b = 0", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
		
	}

}
