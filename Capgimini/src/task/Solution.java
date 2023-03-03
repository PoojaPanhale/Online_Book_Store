package task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
            boolean isBalanced = true;
            Map<Character, Character> pList = new HashMap<>();
            pList.put('{', '}');
            pList.put('[', ']');
            pList.put('(', ')');
            ArrayList<Character> open = new ArrayList<>(Arrays.asList(pList.keySet().toArray(new Character[0])));
            ArrayList<Character> closed = new ArrayList<>(Arrays.asList(pList.values().toArray(new Character[0])));
            Stack<Character> paranthesis = new Stack<>();
                for(int i = 0; i < input.length(); i++) {
                    if((i == 0 || (paranthesis.isEmpty())) && closed.contains(input.charAt(i))) {
                        isBalanced = false;
                        break;
                    }
                    if(open.contains(input.charAt(i))) {
                        paranthesis.push(input.charAt(i));
                    }
                    if(closed.contains(input.charAt(i)) && (pList.get(paranthesis.peek()) == input.charAt(i))) {
                        paranthesis.pop();
                    }
                }
                if(paranthesis.isEmpty() && isBalanced == true){
                    System.out.println("true");
                    continue;                
                }
                System.out.println("false");
            }
		}
	}


