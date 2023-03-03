package StringExample;

public class EqualsIgnorCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		String s1="HELLO";
		System.out.println(s);
		//if(s.equalsIgnoreCase(s1))
		if(s.hashCode()==s1.hashCode())
			
		{
			System.out.println("true");
		
		}
		else
		{
			System.out.println("false");
		}
		

	}

}
