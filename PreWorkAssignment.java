package week2_coding;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PreWorkAssignment {
	Scanner sc = new Scanner(System.in);

	// A function to find if a number is a palindrome
	public void Palindrome() {
		System.out.println("enter a number to check a palindrome: ");
		int n = sc.nextInt();
		int x = n;
		int b = 0;
		String z = "";
		while (x != 0) {	
			b = x % 10;
			x /= 10;
			z += b;
		}
		if (z.equals(String.valueOf(n))) {
			System.out.println("A Palindrome!");
		} else
			System.out.println("Not A Palindrome!");

	}

	// A function to print a star pattern
	public void printPattern() {
		System.out.println("enter the number of stars to be printed: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print("*" + " ");

			}
			System.out.println();
		}
	}
	// A function for fibonacci series

	public void fibonacci() {
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int count = 0;
		while (count != n) {
			System.out.print(a + " ");
			int z = a + b;
			a = b;
			b = z;
			count++;
		}

	}
	//a function to check if the number is a prime number: 
	public void isPrime() {
		System.out.println("enter a number to check if it's prime or not: ");
		int n = sc.nextInt();
		boolean b = false;
			for (int i = 2; i <= n; i++) {
				if(n%i==0)
					b = true;
					break;
			}
			if(!b)
				System.out.println(n+" is a prime number");
			else
				System.out.println(n+" is not a prime number");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PreWorkAssignment obj = new PreWorkAssignment();
		int choice;
		do {
			System.out.println(
					"Select the options accordingly" + " 1.palindrome " + " 2.pattern " + " 3.fibonacci "
							+ " 4.isPrime " + "0 - TO EXIT");

			choice = sc.nextInt();
			switch (choice) {
			case 0:
				choice = 0;
				break;
			case 1:
				obj.Palindrome();
				break;
			case 2:
				obj.printPattern();
				break;
			case 3:
				obj.fibonacci();
				break;
			case 4:
				obj.isPrime();
				break;
			default:
				System.out.println("enter a valid choice");
			}
		} while (choice != 0);
		System.out.println("exited successfully");

	}
}
