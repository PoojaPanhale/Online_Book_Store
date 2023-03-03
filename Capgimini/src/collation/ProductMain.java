package collation;

import java.util.Map;
//import java.util.HashSet;
import java.util.TreeMap;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Product p1=new Product(234,78,9);
      Product p2=new Product(567,98,90);
      Product p3=new Product(897,67,57);
      
  	TreeMap<Integer,Product> map1= new TreeMap<Integer,Product>();
  	 map1.put(p1.getOrderid(),p1);
     map1.put(p2.getOrderid(),p2);
     map1.put(p3.getOrderid(),p3);
    
	for(Map.Entry<Integer, Product>m:map1.entrySet())
     {
    	  System.out.println(m);
     }
 
    
      
      
	
	}
}