package accesspecifier1;

public class MultipleInheritance implements Readable,Writeable {
public void read()
{
	System.out.println("student can read");
	
	}
public void write()
{
	System.out.println("Student can wirte");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MultipleInheritance mi=new  MultipleInheritance();
		 mi.read();
		 mi.write();
	}

}
