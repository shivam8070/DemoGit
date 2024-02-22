package corejava;

import java.util.Scanner;

public class Ifelse_condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the age");
		int age = sc.nextInt();
		if(age>18) {
			System.out.println("eligible for driving");
		}
		else
		{
			System.out.println(" not eligible for driving ");
		}

	}

}
