package collation;
import java.util.Vector;
public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Vector<Integer>v=new  Vector<Integer>();
       v.add(34);
       v.add(57);
       v.add(69);
       v.add(50);
      System.out.println(v);
      v.add(2, 22);
      System.out.println(v.get(0));
      v.set(3, 100);
      System.out.println(v);
      v.remove(1);
      System.out.println(v);
      
	}

}
