package threads;

public class SingleThreadExample extends Thread{
	public void run()
	{
		System.out.println("Hello Java");
	}

	public static void main(String[] args) {
		SingleThreadExample st= new SingleThreadExample();
		st.start();

	}

}
