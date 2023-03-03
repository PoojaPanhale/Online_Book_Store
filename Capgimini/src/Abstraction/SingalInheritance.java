package Abstraction;



class Animal
{
	String name;
	public void eat()
	{
		System.out.println("i am eat");
	}
	public void sleep()
	{
		System.out.println("i am sleeping");
	}
	}
class Tiger extends Animal
{
public void display()
{
	System.out.println("i am"+name);
	}

}
public class SingalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger t=new Tiger();
		t.name="Tiger1";
		t.display();
		t.eat();
		t.sleep();
	}

}
