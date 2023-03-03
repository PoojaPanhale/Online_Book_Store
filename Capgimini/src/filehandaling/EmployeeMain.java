package filehandaling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Employee e1=new Employee("pooja", "satara", 24000);
		Employee e2=new Employee("acb", "wai", 29000);
		Employee e3=new Employee("anita", "phaltan", 28000);
	FileOutputStream fout=new FileOutputStream("d:/input.txt");
	 ObjectOutputStream	out =new ObjectOutputStream(fout);
	out.writeObject(e1);
	out.writeObject(e2);
	out.writeObject(e3);
	out.close();
  	}

	
       
}
