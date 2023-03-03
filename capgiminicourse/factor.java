package capgiminicourse;
import java.util.Scanner;

public class factor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x , i = 1;
		System.out.println("enter the number");
		x = sc.nextInt();
		
		System.out.print("\nthe factor of the" + x + " are: ");
		while(i<=x)
		{
			if(x % i==0)
			{
				System.out.print(i + " ");
			
			}
			++i;
			
		}
		System.out.print("\n");
	}

}
