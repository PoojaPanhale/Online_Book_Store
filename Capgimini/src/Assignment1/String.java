package Assignment1;

import java.util.Scanner;

public class String {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        System.out.println("enter the sentence");
	        java.lang.String sentence = sc.nextLine();
	        java.lang.String word[]=sentence.split(",");
	        for(java.lang.String temp:word)
	     // String s1="Panhale";
	     //if(s==s1)
	     {
	         System.out.println(temp);
	     }

	}

}
