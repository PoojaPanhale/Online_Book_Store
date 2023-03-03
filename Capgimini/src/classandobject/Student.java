package classandobject;

public class Student {
	int id;
	String name;
	String Address;
	
    float sub1;
    float sub2;
    float sub3;
    float sub4;
    float sub5;
    double total()
    {
    	return (sub1+sub2+sub3+sub4+sub5);

}
    double percentage()
    {
    	return((total()/500)*100);
    	
    }
}
	
