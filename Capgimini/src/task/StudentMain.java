package task;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import filehandaling.Employee;

public class StudentMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		StudentFileReader s=new StudentFileReader();
		s.ReadInfo();
}
}
