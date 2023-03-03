package capgiminicourse;

import java.util.Scanner;

public class Multipleof3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		if(num%3==0)
		{
			System.out.println("number is multiple of three");
		}
			
		else
		{
			System.out.println(" number is not multiple of three");
		}

	}

}
