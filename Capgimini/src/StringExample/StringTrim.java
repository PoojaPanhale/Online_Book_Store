package StringExample;

public class StringTrim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value="pooja";
		String value1="Pooja";
		System.out.println(value.trim());//trim method using for unwanted leading spaces
		System.out.println(value.length());//counting spaces and  length of word 
		boolean result=value.equals(value1);//
		System.out.println(result);
		char ch[]= {'P','o','o','j','a'};//
		String s=new String(ch);
		System.out.println(s);
		String s1="Pooja";
		System.out.println("Character at position is 3:"+s1.charAt(3));//
		System.out.println("index of character is a:"+s1.indexOf("a"));//
		System.out.println(s1.substring(0, 3));
	}

}
