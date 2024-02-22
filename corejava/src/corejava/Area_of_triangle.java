package corejava;

import java.util.Scanner;

public class Area_of_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base of triangle");
		int base=sc.nextInt();
		System.out.println("Enter the height of triangle");
		
		int height=sc.nextInt();
		System.out.println("area="+(0.5*base*height));
		

	}

}
