package corejava;

import java.util.Scanner;

public class Or_And_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the number:");
		int n= sc.nextInt();
		
	//	if(n % 5== 0 ||n % 11 ==0)
	//	{
			//System.out.println("True");
	//	}
	//	else
	//	{
		//	System.out.println("False");
		//}
	//}
		
		//And operator
		if(n%5==0&&n%11==0)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
}
