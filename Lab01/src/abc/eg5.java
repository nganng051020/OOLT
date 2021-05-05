package abc;

import javax.swing.JOptionPane;
public class eg5 {
	public static void main(String[] argv) {
		String strNum1, strNum2;
		String strNotification = "";
		
		strNum1 = JOptionPane.showInputDialog(null, 
				"Please input the first number:", "Input the first number", 
				JOptionPane.INFORMATION_MESSAGE);
		double num1,num2;
		num1 = Double.parseDouble(strNum1);
		
		strNum2 = JOptionPane.showInputDialog(null, 
				"Please input the second number:", "Input the second number", 
				JOptionPane.INFORMATION_MESSAGE);
		num2 = Double.parseDouble(strNum2);
		
		double sum, dif, pro, quo;
		sum = num1 + num2;
		dif = num1 - num2;
		pro = num1 * num2;
		if(num2 != 0) {
			quo = num1 / num2;
			strNotification = "Sum: " + sum 
					+ "\nDiference: " + dif
					+ "\nProduct: " + pro
					+ "\nQuotient: " + quo;
		}
		else {
			strNotification = "Sum: " + sum 
					+ "\nDiference: " + dif
					+ "\nProduct: " + pro
					+ "\nQuotient can't calculate";
		}
		JOptionPane.showMessageDialog(null, strNotification, "Calculate",
				JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}

}
