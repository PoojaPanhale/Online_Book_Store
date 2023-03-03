package Abstraction;

public class MethodOverloading {
	public void square()
	{
		System.out.println("no  argument passed ");
	}
    public void square(int num)
    {
    	int sq=num*num;
    	System.out.println("argument passed and that argument square is :" +sq);
    }
    public void square(double num)
    {
    	double sq=num*num;
    	System.out.println("argument passed and that argument square is :" +sq);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MethodOverloading obj=new  MethodOverloading();
		 obj.square();
		 obj.square(90);
		 obj.square(67.5);
	}

}
