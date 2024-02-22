package corejava;

import java.util.Scanner;

public class Sum_of_first_N_naturalno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc .nextInt();
		int sum=0;
		int i=1;
		while(i<=n) {
			sum+=i;
			i++;
		}
			{
				System.out.println("sum="+ sum);
			}
	}


		

	}


