import java.util.Scanner;

public class calendar {
	public static void main(String[] argv) {
		Scanner input = new Scanner(System.in);
		String month = "";
		
		System.out.println("Enter Month: ");
		int iMonth  = input.nextInt();
		System.out.println("Enter Year: ");
		int iYear = input.nextInt();
		int day = 0;
		
		switch(iMonth) {
		case 1:
			month = "January";
			day = 31; break;
		case 2:
			month = "February";
			if(iYear%(400) == 0 || (iYear%4 == 0 && iYear%100 != 0)) day = 29;
			else day = 28; break;
		case 3:
			month = "March";
			day = 31; break;
		case 4:
			month = "April";
			day = 30; break;
		case 5:
			month = "May";
			day = 31; break;
		case 6:
			month = "June";
			day = 30; break;
		case 7:
			month = "July";
			day = 31; break;
		case 8:
			month = "August";
			day = 31; break;
		case 9:
			month = "September";
			day = 30; break;
		case 10:
			month = "October";
			day = 31; break;
		case 11:
			month = "November";
			day = 30; break;
		case 12:
			month = "December";
			day = 31; break;
		default:
			System.out.println("Error!!!\n");			
		}
		System.out.println("Days of " +month + " is " + day) ;
		input.close();
		
		
	}
}
