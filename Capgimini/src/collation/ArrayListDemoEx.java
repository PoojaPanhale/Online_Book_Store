package collation;

import java.util.ArrayList;

public class ArrayListDemoEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer>list=new ArrayList<Integer>();
		list.add(12);
		list.add(13);
		list.add(90);
		list.add(90);
		list.add(96);
		System.out.println(list);
		System.out.println(list.get(2));
		System.out.println(list.set(3, 56));
		System.out.println(list);
		System.out.println(list.get(0));
		list.set(0, 100);
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
	}

}
