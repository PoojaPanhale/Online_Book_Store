package exceptionhandaling;

public class PositiveAndNegative {
public static void positive(int num)
{ 
	if(num<0)
	{
		try
		{
			throw new Exception("Enter the number is Negative");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	else
	{
		System.out.println("Enter the number is Positive ");
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      positive(10);
	}

}
