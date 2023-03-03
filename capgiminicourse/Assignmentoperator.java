package capgiminicourse;
import java.util.Scanner;

public class Assignmentoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number1 and number2");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		num1+=num2;
				System.out.println("Ans=:"+num1);
				num1-=num2;
				System.out.println("Ans=:"+num1);
				num1*=num2;
				System.out.println("Ans=:"+num1);
				num1/=num2;
				System.out.println("Ans=:"+num1);
						
		

	}

}
