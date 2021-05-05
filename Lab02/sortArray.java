
import java.util.Arrays;
import java.util.Scanner;

public class sortArray {
	public static void main(String[] argv) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the length of Array: ");
		int n = input.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter values of Arr: ");
		for(int i = 0; i < n; i++) {
			System.out.printf("arr[%d]", i);
			arr[i] = input.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Arr-Sort");
		for(int i = 0; i < n; i++)
			System.out.print(arr[i]+ " ");
	}

}
