package Assignment1;

import java.util.Scanner;

public class ArrayusingRuntimeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int sum=0;
		//int cube;
		int size=sc.nextInt();
	
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			 a[i]=sc.nextInt();
			 
			
		}
		for(int j=0;j<size;j++)
		{
			//cube=a[i]*a[i]*a[i];
			sum=sum+a[j];
		}
		
			System.out.println(sum);
		

	}

}
