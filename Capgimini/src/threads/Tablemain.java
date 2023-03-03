package threads;

public class Tablemain {

	public static void main(String[] args) {
		Table t= new Table();
		First f=new First(t);
		Second s=new Second(t);
		f.start();
		f.setName("first");
		System.out.println(f.getName());
		//Second s=new Second(t);
		s.start();
		s.setName("second");
		System.out.println(s.getName());

	}

}
