package assignment2;

import java.util.Scanner;

public class QuestionTwo {

	public static void main(String[] args) {
		int[] a = new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array elements");
		for (int i = 0; i < a.length; i++) {
			
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0) {
				System.out.print(a[i]+" ");
			}
		}

	}

}
