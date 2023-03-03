package collation;

import java.util.ArrayList;
import java.util.Collections;

public class ListSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<Integer> list=new ArrayList<Integer>();
     list.add(17);
     list.add(19);
     list.add(12);
     list.add(18);
     list.add(10);
     System.out.println(list);
     Collections.sort(list);
     System.out.println(list);
	}

}
