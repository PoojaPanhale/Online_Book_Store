package classandobject;

public class Product1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product1 p1=new Product1();
		p1.setProduct1Id(1001);
		p1.setProduct1name("chair");
		p1.setNooforders(23);
		
		System.out.println("ProductId :"+p1.getProduct1Id());
		System.out.println("ProductName :"+p1.getProduct1name());
		System.out.println("No of Orders :"+p1.getNooforders());
	}

}
