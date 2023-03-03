package lambadaexp;

import java.util.Arrays;
import java.util.List;

public class ProductMain {

	public static void main(String[] args) {
		  Product p1=new Product(123,36,"pen");
		  Product p2=new Product(78,75,"chair");
		  Product p3=new Product(80,67,"book");
		  List<Product>list = Arrays.asList(p1,p2,p3);
		  list.forEach((x)->
		  {
			 System.out.println(x); 
		  });
	}

}
