package abc;

import javax.swing.JOptionPane;
public class hw3 {
	public static void main(String[] argv) {
		String num1, num2, num3;
		double delta;
		double a, b, c;
		double x1, x2;
		
		JOptionPane.showMessageDialog(null, "A second-degree equation with one variable");
		num1 = JOptionPane.showInputDialog(null, 
				"Please enter value of a: ", "ax^2 + bx + c = 0 ",
				JOptionPane.INFORMATION_MESSAGE);
		num2 = JOptionPane.showInputDialog(null, 
				"Please enter value of b: ", "ax^2 + bx + c = 0 ",
				JOptionPane.INFORMATION_MESSAGE);
		num3 = JOptionPane.showInputDialog(null, 
				"Please enter value of c: ", "ax^2 + bx + c = 0 ",
				JOptionPane.INFORMATION_MESSAGE);
		a = Double.parseDouble(num1);
		b = Double.parseDouble(num2);
		c = Double.parseDouble(num3);
		
		delta = b*b - 4*a*c;
		if(delta == 0) {
			x1 = -b/(2*a);
			JOptionPane.showMessageDialog(null, 
					"the equation has double root: \nx = " + x1,
					"Result",
					JOptionPane.INFORMATION_MESSAGE);
		}
		else if(delta > 0) {
			x1 = (-b + Math.sqrt(delta))/(2*a);
			x2 = (-b - Math.sqrt(delta))/(2*a);
			JOptionPane.showMessageDialog(null, 
					"the equation has 2 distinct roots:\nx1 = " + x1 + "\nx2 = " + x2,
					"Result",
					JOptionPane.INFORMATION_MESSAGE);
		}
		else
			JOptionPane.showMessageDialog(null, 
					"the equation has no solution ",
					"Result",
					JOptionPane.INFORMATION_MESSAGE);
	}

}
