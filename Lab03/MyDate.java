import java.time.LocalDate;
import java.util.Scanner;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		if( day >= 1 && day <= 31)
			this.day = day;
		else
			System.out.println("Error!!!");
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		if(month >=1 && month <= 12)
			this.month = month;
		else
			System.out.println("Error!!!");
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		if(year > 0)
			this.year = year;
		else 
			System.out.println("Error!!!");
	}
	
	static String[][] monthStrings = {
			{"1", "january", "jan.", "jan"},
			{"2", "february", "feb.", "feb"},
			{"3", "march", "mar.", "mar"},
			{"4", "april", "apr.", "apr"},
			{"5", "may", "may", "may"},
			{"6", "june", "june", "jun"},
			{"7", "july", "july", "jul"},
			{"8", "august", "aug.", "aug"},
			{"9", "september", "sept.", "sep"},
			{"10", "october", "oct.", "oct"},
			{"11", "november", "nov.", "nov"},
			{"12", "december", "dec.", "dec"}
	};
	private static int toIntMonth(String month) {
		month = month.toLowerCase();
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 4; j++) {
				if (month.equals(monthStrings[i][j]))
					return i + 1;
			}
		}
		return -1;
	}
	
	public static void printCurentDay() {
	LocalDate date = LocalDate.now();
	System.out.println(date);
	}
	
	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public MyDate() {
		LocalDate date = LocalDate.now();
		this.day = date.getDayOfMonth();
		this.month = date.getMonthValue();
		this.year = date.getYear();
	}
	
	public MyDate(String str) {
		String[] dateSplit = str.split(" ");
		
		int month = MyDate.toIntMonth(dateSplit[0]);
		if (month < 0) {
			System.out.println("Wrong format date");
			this.month = 1;
		}
		else this.month = month;
		
		try {
			this.day = Integer.parseInt(dateSplit[1].substring(0, 2));
		} catch (NumberFormatException e) {
			System.out.println("Wrong format date");
			this.day = 1;
		}
		
		try {
			this.year = Integer.parseInt(dateSplit[2]);
		} catch (NumberFormatException e) {
			System.out.println("Wrong format date");
			this.year = 2000;
		}
	}
	
	
	public void accept() {
		Scanner Keyboard = new Scanner(System.in);
		System.out.println("Please enter date (mm dd yyyy): ");
		String strDate = Keyboard.nextLine();
		MyDate test = new MyDate(strDate);
		System.out.println("day: " + test.day+", month: " + test.month+", year: " + test.year);

		Keyboard.close();
	}
	
	public void print() {
		MyDate test = new MyDate();
		System.out.print("Today is "+ test.day + " / " + test.month+ " / " + test.year);
	}
	
	
	
	
