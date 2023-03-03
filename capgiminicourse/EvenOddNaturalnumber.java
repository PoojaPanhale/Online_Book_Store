package capgiminicourse;
import java.util.Scanner;

public class EvenOddNaturalnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no :");
		int no =sc.nextInt();
		int i=1;
		while(i<=no)
		{
		if(i%2==0)
		{
			
		System.out.println("Even no :"+i);
		}
		else
		{
			System.out.println("Odd no :"+i);
			}
		i++;
		}
	}

}
