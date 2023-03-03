package comparator;

import java.util.Map;
//import java.util.HashSet;
import java.util.TreeMap;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Product p1=new Product(234,78,9);
    Product p2=new Product(567,98,90);
    Product p3=new Product(897,67,57);
    ProductSort p=new ProductSort();
	TreeMap<Product,Integer> map1= new TreeMap<Product,Integer>(p);
	 map1.put(p1,p1.getOrderid());
   map1.put(p2,p2.getOrderid());
   map1.put(p3,p3.getOrderid());
  
	for(Map.Entry<Product, Integer>m:map1.entrySet())
   {
  	  System.out.println(m);
   }

  
    
      
	
	}
}