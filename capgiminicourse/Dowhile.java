package capgiminicourse;
import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		String s;
		do
		{
		Scanner sc=new Scanner(System.in);
		//Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the choice");
		int ch=sc.nextInt();
		//int ch1=s1.nextInt();
		 
		switch(ch)
		{
		case 1:
			System.out.println("large");
			break;
		case 2:
			System.out.println("medium");
			break;
		case 3:
			System.out.println("small");
			break;
			
		}
	
	
			System.out.println("Do u want to continue");
			//System.out.println("ch1");
			s=sc.next();
			
			
		
		}
		while(s.equals("yes"));
		
		
		
		}
		}

	


