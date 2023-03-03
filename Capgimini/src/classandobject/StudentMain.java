package classandobject;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st=new Student();
		st.id=33;
		st.name="pooja";
		st.Address="a/p Wai";
		st.sub1=20;
		st.sub2=50;
		st.sub3=90;
		st.sub4=30;
		st.sub5=50;

		System.out.println("The Student id=:"+st.id);
		System.out.println("The Student name=:"+st.name);
		System.out.println("The Student salary=:"+st.Address);
		System.out.println("total marks=:"+st.total());
		System.out.println("Percentege of student=:"+st.percentage());
		System.out.println("================================================================================");
		
		Student st2=new Student();
		st2.id=32;
		st2.name="anita";
		st2.Address="a/p kharda";
		st2.sub1=69;
		st2.sub2=39;
		st2.sub3=59;
		st2.sub4=70;
		st2.sub5=50;
		

		System.out.println("The Student id=:"+st2.id);
		System.out.println("The Student name=:"+st2.name);
		System.out.println("The Student Address:"+st2.Address);
		System.out.println("total marks=:"+st2.total());
		System.out.println("Percentege of student=:"+st2.percentage());
		System.out.println("================================================================================");
        
		
		Student st3=new Student();
		st3.id=18;
		st3.name="ruturaj";
		st3.Address="a/p girvi";
		st3.sub1=38;
		st3.sub2=69;
		st3.sub3=96;
		st3.sub4=37;
		st3.sub5=52;

		System.out.println("The Student id=:"+st3.id);
		System.out.println("The Student name=:"+st3.name);
		System.out.println("The Student salary=:"+st3.Address);
		System.out.println("total marks=:"+st3.total());
		System.out.println("Percentege of student=:"+st3.percentage());
		System.out.println("================================================================================");


	}
	}


