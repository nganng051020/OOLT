package abc;

import javax.swing.JOptionPane;
public class hw2 {
	public static void main(String[] argv) {
		String num11, num12, num21, num22, numb1, numb2;
		double x1, x2;
		double d, d1, d2;
		
		JOptionPane.showMessageDialog(null, "System of 1st-degree equations with 2 variables");;
		num11 = JOptionPane.showInputDialog(null, 
				"Please enter value of a11: ", "a11.x1 + a12.x2 = b1 ",
				JOptionPane.INFORMATION_MESSAGE);
		num12 = JOptionPane.showInputDialog(null, 
				"Please enter value of a12: ", "a11.x1 + a12.x2 = b1 ",
				JOptionPane.INFORMATION_MESSAGE);
		numb1 = JOptionPane.showInputDialog(null, 
				"Please enter value of b1: ", "a11.x1 + a12.x2 = b1 ",
				JOptionPane.INFORMATION_MESSAGE);
		num21 = JOptionPane.showInputDialog(null, 
				"Please enter value of a21: ", "a21.x1 + a22.x2 = b1 ",
				JOptionPane.INFORMATION_MESSAGE);
		num22 = JOptionPane.showInputDialog(null, 
				"Please enter value of a22: ", "a21.x1 + a22.x2 = b1 ",
				JOptionPane.INFORMATION_MESSAGE);
		numb2 = JOptionPane.showInputDialog(null, 
				"Please enter value of b2: ", "a21.x1 + a22.x2 = b1 ",
				JOptionPane.INFORMATION_MESSAGE);
		double a11 = Double.parseDouble(num11),
				a12 = Double.parseDouble(num12),
				a21 = Double.parseDouble(num21),
				a22 = Double.parseDouble(num22),
				b1 = Double.parseDouble(numb1),
				b2 = Double.parseDouble(numb2);
		d = a11 * a22 - a21 *  a12;
		d1 = b1 * a22 - b2 * a12;
		d2 = a11 * b2 - a21 * b1;
		
		if (d != 0) {
			x1 = d1/d;
			x2 = d2/d;
			JOptionPane.showMessageDialog(null, "x1 = " + x1 + "\nx2 = " + x2,
					"Results", JOptionPane.INFORMATION_MESSAGE);
		}
		else if(d == 0) {
			JOptionPane.showMessageDialog(null, "INFINI",
					"Results", JOptionPane.INFORMATION_MESSAGE);
		}
		else
			JOptionPane.showMessageDialog(null, "NO SOLUTION",
					"Results", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}

}
