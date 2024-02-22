package corejava;

import java.util.Scanner;

public class Find_total_average_perctange_marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the marks of maths,english,hindi,science,gk");
		Scanner sc=new Scanner(System.in);
		int maths=sc.nextInt();
		int english=sc.nextInt();
		int hindi=sc.nextInt();
		int science=sc.nextInt();
		int gk=sc.nextInt();
		int total_marks=(maths+english+hindi+science+gk);
		System.out.println("total marks="+total_marks);
		System.out.println("average marks="+(total_marks/2));
		System.out.println("perctange="+(total_marks*100)/500);

	}

}
