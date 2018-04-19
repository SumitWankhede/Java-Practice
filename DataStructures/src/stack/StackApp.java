package stack;

class StackX{
	private int maxSize=0;
	private long[] stackArray;
	private int top;
	//--------------------------------------------------------------------
	public StackX(int size){						// constructor
		maxSize = size;
		top = -1;
		stackArray = new long[maxSize];
	}
	//---------------------------------------------------------------------
	public void push(int value){
		stackArray[++top] = value;
	}
	//---------------------------------------------------------------------
	public long pop(){
		return stackArray[top--];
	}
	//---------------------------------------------------------------------
	public long peak(){
		return stackArray[top];
	}
	//---------------------------------------------------------------------
	public boolean isEmpty(){
		if (top == -1)
			return true;
		else
			return false;
	}
	//----------------------------------------------------------------------
	public boolean isFull(){
		if(top == maxSize)
			return true;
		else
			return false;
	}
	//----------------------------------------------------------------------
}
////////////////////////////////////////////////////////////////////////////

public class StackApp {

	public static void main(String[] args) {
		StackX theStack = new StackX(10);
		theStack.push(20);
		theStack.push(40);
		theStack.push(70);
		theStack.push(50);
		
		while(!theStack.isEmpty()){
			long value = theStack.pop();
			System.out.println(value);
			System.out.print("");
		}
		System.out.println(" ");
	}
}
