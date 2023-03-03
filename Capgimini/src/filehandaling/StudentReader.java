package filehandaling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StudentReader {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileReader f=new FileReader ("d:/studentinfo.csv");
		String id,Name,Adress,sub1,sub2,sub3,sub4,sub5;
		 BufferedReader br = new BufferedReader(f);
			String col=br.readLine();
			String row=br.readLine();
			System.out.println(col);
			while(row!=null)
			{
				String[]s=row.split(",");
				id=s[0];
				Name=s[1];
				Adress=s[2];
				sub1=s[3];
				sub2=s[4];
				sub3=s[6];
				sub4=s[6];
				sub5=s[7];
				
			
			System.out.println(id +","+Name +","+ sub1+","+sub2+","+sub3+","+sub4);
			row=br.readLine();
			
			

		}
	}

}
