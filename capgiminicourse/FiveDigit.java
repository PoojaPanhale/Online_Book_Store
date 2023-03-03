package capgiminicourse;

import java.util.Scanner;

public class FiveDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		if(num>=10000 && num<=99999)
		{
			System.out.println("Five digit number");
		}
			
		else
		{
			System.out.println(" It is not five digit number");
		}


	}

}
