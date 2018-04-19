package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class StackZ{
	private int maxSize;
	private char[] stackArray;
	private int top;
	//---------------------------------------------------------------------------------
	public StackZ(int size){
		maxSize = size;
		stackArray = new char[maxSize];
		top = -1;
	}
	//----------------------------------------------------------------------------------
	public void push(char ch){
		stackArray[++top] = ch;
	}
	//----------------------------------------------------------------------------------
	public char pop(){
		return stackArray[top--];
	}
	//----------------------------------------------------------------------------------
	public char peak(){
		return stackArray[top];
	}
	//----------------------------------------------------------------------------------
	public boolean isEmpty(){
		if (top == -1)
			return true;
		else 
			return false;
	}
	//----------------------------------------------------------------------------------
} // END OF CLASS STACKZ

class BracketChecker{
	private String input;
	//----------------------------------------------------------------------------------
	public BracketChecker(String in){
		input = in;
	}
	//----------------------------------------------------------------------------------
	public void check(){
		int stackSize = input.length();
		StackZ theStack = new StackZ(stackSize);
		
		for(int j=0; j<stackSize; j++){
			char ch = input.charAt(j);
			switch(ch)
			{
			case '{':
			case '[':
			case '(':
				theStack.push(ch);
				break;
			case '}':
			case ']':
			case ')':
				if(!theStack.isEmpty()){
					char chx = theStack.pop();
					if((ch == '}' && chx != '{') || 
					   (ch == ']' && chx != '[') ||
					   (ch == ')' && chx != '('))
						System.out.println("Error: " + ch + " at " + j);
				}
				else{
					System.out.println("Error: " + ch + " at " + j);
				}
				break;
			default:
				break;
			} // end switch
		} // end for
		// at this point, all characters have been processed
		if(!theStack.isEmpty())
			System.out.println("Error: missing right delimiter");
	} // end check()
} // end class BracketChecker
/////////////////////////////////////////////////////////////////////////////////
public class BracketsApp {

	public static void main(String[] args) throws IOException {
		String input;
		while(true){
			System.out.print("Enter string containing delimiters:");
			System.out.flush();
			input = getString();
			if(input.equals(""))
				break;
			BracketChecker theChecker = new BracketChecker(input);
			theChecker.check();
		} // END WHILE
	} // END MAIN
	//-------------------------------------------------------------------------------
	public static String getString() throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
}
