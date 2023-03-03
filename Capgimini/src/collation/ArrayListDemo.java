package collation;
import java.util.ArrayList;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer>list=new ArrayList<Integer>();
		list.add(12);
		list.add(13);
		list.add(90);
		list.add(90);
		list.add(96);
		System.out.println(list);
		ArrayList<Double>list1=new ArrayList<Double>();
		list1.add(90.89);
		list1.add(13.89);
		list1.add(90.79);
		list1.add(90.78);
		list1.add(96.79);
		System.out.println(list1);
		ArrayList<Character>list2=new ArrayList<Character>();
		list2.add('A');
		list2.add('b');
		list2.add('c');
		list2.add('d');
		list2.add('d');
		System.out.println(list2);

	}

}
