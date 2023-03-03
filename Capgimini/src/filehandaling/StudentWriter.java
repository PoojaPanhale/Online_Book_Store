package filehandaling;

import java.io.FileWriter;
import java.io.IOException;

public class StudentWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 FileWriter fw=new FileWriter("d:/studentinfo.csv");
	        fw.write("id,Name,Adress,sub1,sub2,sub3,sub4,sub5");
	        fw.write("\n12,ruturaj,phaltan,89,86,49,78,90");
	        fw.write("\n13,Anita,Nagar,78,95,94,83,67"); 
	        fw.write("\n14,pooja,wai,78,90,95,94,96");
	        fw.close();
	}

}
