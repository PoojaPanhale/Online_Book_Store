package interfaces;

public class D implements B,C {

	@Override
	public void a() {
		System.out.println("method a :");
		
	}

	@Override
	public void c() {
		System.out.println("method c :");
		
	}

	@Override
	public void b() {
		System.out.println("method b :");
	}

}
