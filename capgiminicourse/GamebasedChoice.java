package capgiminicourse;
import java.util.Scanner;

public class GamebasedChoice {

	public static void main(String[] args) {
		String s;
		do
		{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the choice :");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("Large");
			break;
			case 2:
				System.out.println("medium");
			break;
			case 3:
				System.out.println("small");
			break;
			
		}
		System.out.println("do u want to continue");
		s=sc.next();
		}
		while(s.equals("yes"));
	}
	}

