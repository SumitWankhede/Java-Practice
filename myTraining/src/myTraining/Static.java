package myTraining;

// Understanding problem without static variable
class Student1{
	int rollno;
	String name;
	String college = "SPIT";
}
/* Suppose there are 500 students in my college, now all instance data 
 * members will get memory each time when object is created.
 * All student have its unique rollno and name so instance data member is good.
 * Here, college refers to the common property of all objects.
 * If we make it static,this field will get memory only once. */


// Example of static variable
class Student2{
	int rollno;
	String name;
	static String college = "SPIT";
	
	Student2(int r, String n){
		rollno = r;
		name = n;
	}
	
	void display(){
		System.out.println(rollno + " " + name + " " + college);
	}
}


public class Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1 = new Student1();
		Student2 s2 = new Student2(111,"Karan");
		
		s2.display();
	}

}
