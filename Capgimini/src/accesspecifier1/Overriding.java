package accesspecifier1;
class human
{
	public void walk()
	{
		System.out.println("human can walk");
	}
	}
class girls extends human
{
	public void walk()
	{
		super.walk();
		
		System.out.println("girls can also walk");
	
	}
}
public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		girls g= new girls();
		g.walk();
		//human h=new human();
		//h.walk();
        
	}

}
