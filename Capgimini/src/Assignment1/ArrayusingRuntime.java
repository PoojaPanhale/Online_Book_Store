package Assignment1;
import java.util.Scanner;

public class ArrayusingRuntime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		//int sum=0;
		int size=s.nextInt();//3
		int a[]=new int[size];//3
		for(int i=0;i<size;i++)//0<3 1<3 2<3
		{
			 a[i]=s.nextInt();
			 //a[0]=12,a[1]=14 a[2]=15
		}
		for(int j=0;j<size;j++)
		{
			//sum=sum+a[j];
		
			System.out.println(a[j]);
		}
		
	}

}
