package threads;

public class SingleThreadEx implements Runnable{
	@Override
	public void run() {
		System.out.println("hello java");
		
	}
	public static void main(String[] args) {
		 SingleThreadEx st=new  SingleThreadEx();
		 Thread t=new Thread(st);
		 t.start();

	}

	
}
