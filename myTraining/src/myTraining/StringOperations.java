package myTraining;

public class StringOperations {

	public static void main(String[] args) {
		// String declarations and initialization
		String s1 = "java";
		char ch[] = {'s','t','r','i','n','g','s'};
		String s2 = new String(ch);
		String s3 = new String("Example");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		// Methods
		// 1. char charAt(int index) -- 	returns char value for the particular index
		char c1 = s2.charAt(3);
		System.out.println(c1);
		
		// 2. 	int length() -- 	returns string length
		System.out.println("Length of String s3: " + s3.length());
		
		// https://www.javatpoint.com/java-string
		String s4 = String.format("Hi %s %f", "Sumit", 3.2f);
		System.out.println(s4);
		
		// Java String split
		String s5 = "java string split method by javatpoint";
		String[] s6 = s5.split("\\s");
		for(String s: s6)
			System.out.println(s);
	}

}
