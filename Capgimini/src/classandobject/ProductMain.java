package classandobject;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Product p=new Product();
		p.id=1001;
		p.name="NoteBook";
		p.noofProduct=8;
		p.costperproduct=10;
		System.out.println(p);
		System.out.println("========================================================");
		Product p1=new Product();
		p1.id=1023;
		p1.name="Book";
		p1.noofProduct=5;
		p1.costperproduct=7;
		System.out.println(p1);
		System.out.println("========================================================");
		Product p2=new Product();
		p2.id=17;
		p2.name="Pen";
		p2.noofProduct=4;
		p2.costperproduct=9;
		System.out.println(p2);
		System.out.println("========================================================");
	}

}
