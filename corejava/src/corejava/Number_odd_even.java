package corejava;

import java.util.Scanner;

public class Number_odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the  value of n:");
		int n= sc.nextInt();
		if(n%2==0) {
			System.out.println("The number is even");
		}
		
		else
		{
			System.out.println(" The number is odd");
		}
	}

}
