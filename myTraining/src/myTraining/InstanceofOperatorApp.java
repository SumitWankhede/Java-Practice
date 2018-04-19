package myTraining;

class Parent{
	
}

public class InstanceofOperatorApp extends Parent{

	public static void main(String[] args) {
		
		InstanceofOperatorApp obj = new InstanceofOperatorApp();
		InstanceofOperatorApp obj1 = null;
		System.out.println(obj instanceof InstanceofOperatorApp);// true
		
		// if InstanceofOperatorApp extends Parent then object of InstanceofOperatorApp 
		// can be referred by either InstanceofOperatorApp or Parent class.
		System.out.println(obj instanceof Parent);// true 
		
		System.out.println(obj1 instanceof InstanceofOperatorApp);// false
	}
}
