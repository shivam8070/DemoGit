package corejava;

import java.util.Scanner;
import java.lang.Math;
public class Compound_Intrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the value of P,R,T");
		Scanner sc=new Scanner(System.in);
		int P=sc.nextInt();
		int R=sc.nextInt();
		int T=sc.nextInt();
		
		System.out.println("compound interst="+(P *(Math.pow((1 + R / 100), T)))); 
                //for power we use Math.pow
		

	}

}
