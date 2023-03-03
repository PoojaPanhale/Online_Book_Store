package classandobject;
import java.util.Arrays;

public class StudentEx {
	int id;
	String name;
   String address;
     int []marks;
     int total=0;
  
   double percentage()
   {
	   for(int i=0;i<marks.length;i++)
	   {
		   total=total+marks[i];
	   }
	   double percentage=total*100/500.0;
	   return percentage;
   }
public String toString()
{
	return "id=:"+id+"\nName=:"+name+"\naddress=:"+address+"\nMarks=:"+Arrays.toString(marks)+"\nPercentage=:"+percentage();
}
}
