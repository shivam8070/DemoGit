package corejava;

import java.util.Scanner;

public class Circle_radius_area_circumfrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the radius of circle");
		Scanner sc= new Scanner(System.in);
		int radius=sc.nextInt();
		System.out.println("Diameter="+(2*radius));
		System.out.println("Circumference="+(2*3.14*radius));
		System.out.println("Area="+(3.14*radius*radius));
		

	}

}
