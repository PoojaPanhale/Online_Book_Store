package StringExample;

import java.util.Scanner;

public class StringRuntime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner var =new Scanner(System.in);
	        System.out.println("enter the sentence");
	        String sentence = var.nextLine();
	        String word[]=sentence.split(",");
	        for(String temp:word)
	     // String s1="Panhale";
	     //if(s==s1)
	     {
	         System.out.println(temp);
	     }

	}

}
