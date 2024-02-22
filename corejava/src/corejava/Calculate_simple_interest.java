package corejava;

import java.util.Scanner;

public class Calculate_simple_interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the value of P,R,T");
		Scanner sc= new Scanner(System.in);
		int P= sc.nextInt();
		int R= sc.nextInt();
		int T= sc.nextInt();
		System.out.println("simple intrest="+(P*R*T)/100);
		
		

	}

}
