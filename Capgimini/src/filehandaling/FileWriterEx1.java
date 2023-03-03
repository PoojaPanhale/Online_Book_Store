package filehandaling;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriterEx1 {

	public static void main(String[] args)  throws IOException {
				
		        FileWriter fw=new FileWriter("d:/studentnew.csv");
		        fw.write("id,Name,Adress");
		        fw.write("\n12,ruturaj,phaltan");
		        fw.write("\n13,Anita,Nagar"); 
		        fw.write("\n14,pooja,wai");
		        fw.close();
	}

}
