package lambadaexp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     List<Integer> list=new ArrayList<Integer>();
	     list.add(17);
	     list.add(19);
	     list.add(12);
	     list.add(18);
	     list.add(10);
	     for(Integer i:list)
	     {
	    	 System.out.println(i);
	     }
	     System.out.println("======================================================");
	    list.forEach(
	    
	    (n)->System.out.println(n)
	    );
	}

}
