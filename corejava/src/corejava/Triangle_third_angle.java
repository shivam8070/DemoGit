package corejava;

import java.util.Scanner;

public class Triangle_third_angle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of first angle");
		int first_angle= sc.nextInt();
		System.out.println("Enter the value of second angle");
		int second_angle= sc.nextInt();
		//Scanner sc= new Scanner(System.in);
		//int first_angle= sc.nextInt();
		
		System.out.println("third angle="+(180-(first_angle+second_angle)));
		

	}

}
