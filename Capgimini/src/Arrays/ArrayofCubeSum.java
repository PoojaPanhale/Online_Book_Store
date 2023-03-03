package Arrays;

import java.util.Scanner;

public class ArrayofCubeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int sum=0;
		int cube;
		int size=sc.nextInt();
	
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			 a[i]=sc.nextInt();
			 cube=a[i]*a[i]*a[i];
				sum=sum+cube;
			
		}
		
		
			System.out.println("sum of array cube:"+sum);
		

	}

}
