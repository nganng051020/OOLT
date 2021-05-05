

import java.util.Scanner;

public class addTwoArr {
	public static void main(String[] argv) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the length of Arr:");
		int n = input.nextInt();
		
		System.out.println("Enter values of 1st Arr:");
		int arr1[]= new int[n];
		for(int i = 0; i < n; i++) {
			System.out.printf("arr1[%d]", i);
			arr1[i] = input.nextInt();
		}
		System.out.println("Enter values of 2nd Arr:");
		int arr2[]= new int[n];
		for(int i = 0; i < n; i++) {
			System.out.printf("arr1[%d]", i);
			arr2[i] = input.nextInt();
		}
		
		for(int i = 0; i < n; i++) arr1[i] = arr1[i] + arr2[i];
		
		System.out.println("Sum of 2 Arrs:");
		for(int i = 0; i < n; i++) System.out.print(arr1[i] + " ");
		input.close();
	}

}
