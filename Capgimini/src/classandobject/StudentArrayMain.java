package classandobject;

public class StudentArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m1[]= {78,90,78,67,88};
		StudentArray s1=new StudentArray();
		s1.id=1001;
		s1.name="pooja";
		s1.address="wai";
		
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.address);
		s1.mark=m1;
		double percentage=s1.percentage();
		System.out.println(percentage);

	}

}
