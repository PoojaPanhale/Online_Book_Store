package StringExample;

public class Hashcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s="hello";
	      String s1="Hello";
	      System.out.println(s.hashCode());
	      System.out.println(s1.hashCode());
	      if(s==s1)//checking also location
	      {
	    	  System.out.println("true");
	      }
	      else
	      {
	    	  System.out.println("false");
	      }
	}

}
