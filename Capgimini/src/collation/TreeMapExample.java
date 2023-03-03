package collation;

//import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> map= new TreeMap<Integer,String>();
		map.put(6, "six");
        map.put(1,"one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        System.out.println(map);
	}

}
