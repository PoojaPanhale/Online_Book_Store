package StringExample;

public class StringBufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s=new StringBuffer("hello");
		s.append("java");
		System.out.println(s);
		// s.reverse();//
	      
	      //System.out.println(s);
	      s.insert(1,'R');//
	      System.out.println(s);
	      s.replace(8,11,"to");//
	      System.out.println(s);
	      s.delete(4,8);//
	      System.out.println(s);

	}

}
