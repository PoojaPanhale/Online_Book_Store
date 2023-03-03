package threads;

public class SleepingThread implements Runnable{

	@Override
	public void run() {
 for (int i=0;i<5;i++)
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
      
		SleepingThread st=new SleepingThread();
		Thread t=new Thread(st);
		t.start();

	}


}
