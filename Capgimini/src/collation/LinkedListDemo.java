package collation;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer>list=new LinkedList<Integer>();
		list.add(12);
		list.add(13);
		list.add(90);
		list.add(90);
		list.add(96);
		System.out.println(list);
		list.addFirst(34);
		list.addLast(68);
		System.out.println(list);
		list.removeFirst();
		list.removeLast();
		System.out.println(list);

	}

}
