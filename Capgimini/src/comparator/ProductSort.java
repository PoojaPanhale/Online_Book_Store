package comparator;

import java.util.Comparator;

public class ProductSort implements Comparator <Product>{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getNoofproduct(),o2.getNoofproduct());
	}

}
