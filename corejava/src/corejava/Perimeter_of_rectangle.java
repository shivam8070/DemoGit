package corejava;

import java.util.Scanner;

public class Perimeter_of_rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of length and breath");
		Scanner sc=new Scanner (System.in);
		int length=sc.nextInt();
		int breath=sc.nextInt();
		System.out.println("perimeter="+(2*(length+breath)));
		
		
	}

}
