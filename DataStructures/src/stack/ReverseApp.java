package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class StackY{
	private int maxSize;
	private char[] stackArraay;
	private int top;
	//----------------------------------------------------------------------
	public StackY(int size){
		maxSize = size;
		stackArraay = new char[maxSize];
		top = -1;
	}
	//----------------------------------------------------------------------
	public void push(char c){
		stackArraay[++top] = c;
	}
	//----------------------------------------------------------------------
	public char pop(){
		return stackArraay[top--];
	}
	//----------------------------------------------------------------------
	public char peek(){
		return stackArraay[top];
	}
	//----------------------------------------------------------------------
	public boolean isEmpty(){
		if (top == -1)
			return true;
		else
			return false;
	}
	//----------------------------------------------------------------------
}// END OF CLASS
////////////////////////////////////////////////////////////////////////////

class Reverser{
	private String input;
	private String output;
	//-----------------------------------------------------------------------
	public Reverser(String in){
		input = in;
	}
	//-----------------------------------------------------------------------
	public String doRev(){
		int stackSize = input.length();
		StackY theStack = new StackY(stackSize);
		
		for(int j=0; j < stackSize; j++){
			char ch = input.charAt(j);
			theStack.push(ch);
		}
		output = "";
		
		while(!theStack.isEmpty()){
			char ch = theStack.pop();
			output = output + ch;
		}
		
		return output;
	} // END OF doRev
	//------------------------------------------------------------------------
} // END OF REVERSER CLASS
//////////////////////////////////////////////////////////////////////////////

public class ReverseApp {

	public static void main(String[] args) throws IOException {
		String input, output;
		while(true){
			System.out.println("Enter a string:");
			System.out.flush();
			input = getString();
			if(input == "")
				break;
			Reverser theReverser = new Reverser(input);
			
			output = theReverser.doRev();
			
			System.out.println("Reversed string is:" + output);
		} // END OF WHILE
	} // END IF MAIN()
	//-----------------------------------------------------------------------------
	public static String getString() throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
}
