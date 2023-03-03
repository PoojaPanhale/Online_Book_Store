package collation;

//import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,String> map= new LinkedHashMap<Integer,String>();
		map.put(6, "six");
        map.put(1,"one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        System.out.println(map);
	}

}
