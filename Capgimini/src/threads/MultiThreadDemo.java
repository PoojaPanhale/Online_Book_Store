package threads;

public class MultiThreadDemo extends Thread{
	@Override
	public void run() {
 for (int i=0;i<3;i++)
 {
	 System.out.println("java");
 }
 try
 {
	 Thread.sleep(2000);
 }
	catch(Exception e)
 {
		System.out.println(e);
 }
	}
	public static void main(String[] args) {
		 MultiThreadDemo m=new  MultiThreadDemo();
		
		 m.start();
		 m.setName("first");
		 m.setPriority(MAX_PRIORITY);
		 System.out.println(m.getName());
		 System.out.println(m.getPriority());
		 try
		 {
			m.join();
		 }
			catch(Exception e)
		 {
				System.out.println(e);
		 }
		 
		 MultiThreadDemo m1=new  MultiThreadDemo();
		 m1.start();
		 m1.setName("second");
		 m1.setPriority(MIN_PRIORITY);
		 System.out.println(m1.getName());
		 System.out.println(m1.getPriority());
	}

}
