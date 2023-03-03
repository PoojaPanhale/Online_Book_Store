package capgiminicourse;
import java.util.Scanner;

public class Alphabets {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Alphabet :");
		char choice = sc.next().charAt(0);
		switch(choice)
		{
		case 'A':
			
			System.out.println("Apple");
			break;
case 'B':
			
			System.out.println("Ball");
			break;
case 'c':
	
	System.out.println("Cat");
	break;
	 default :
	 
			
			System.out.println("No match choice");
			break;
		}

	}

}
