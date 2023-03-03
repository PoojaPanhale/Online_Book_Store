package StringExample;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="   hello";
		//String s1="HELLO";
		System.out.println(s);
		System.out.println(s.charAt(0));
		System.out.println(s.indexOf('h'));
		System.out.println(s.concat("word"));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.startsWith("h"));
		System.out.println(s.endsWith("o"));
		System.out.println(s.contains(s));
		System.out.println(s.trim());//trim method using for unwanted leading spaces
		System.out.println(s.length());//counting spaces and  length of word 
		

	}

}
