package accesspecifier1;
abstract class Language
{
	public void show()
	{
		System.out.println("this is java language");
	}
	}

public class Abstract extends Language{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract a=new Abstract();
		a.show();
	}

}
