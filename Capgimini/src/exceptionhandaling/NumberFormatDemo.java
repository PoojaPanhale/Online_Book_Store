package exceptionhandaling;

public class NumberFormatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="hello";
       try
       {
    	   int i =Integer.parseInt(s);
    	   System.out.println(i);
       }
       catch(NumberFormatException e)
       {
    	   System.out.println(e);
       }
	}

}