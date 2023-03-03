package filehandaling;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args)throws IOException {
		FileOutputStream fout=new FileOutputStream("one.txt");
		String s="Hello World";
		byte b[]=s.getBytes();
		fout.write(b);
		fout.close();
		System.out.println("created");

	}

}
