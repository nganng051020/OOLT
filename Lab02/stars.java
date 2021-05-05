import java.util.Scanner;

public class stars {
	public static void main(String[] argv) {
		Scanner hstar = new Scanner(System.in);
		int n;
		
		do {
		System.out.println("Height of star: ");
		n = hstar.nextInt();
		}while( n > 0);
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n-i-1; j++)
				System.out.println(" ");
			for(int j = 0; j < i*2+1; j++)
				System.out.println("*");
			System.out.println("");
				
		}
		
	}

}
