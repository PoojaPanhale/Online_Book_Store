package lambadaexp;

import java.util.Arrays;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(1,3,2,40);
		list.forEach((x)->System.out.println(x));

	}

}
