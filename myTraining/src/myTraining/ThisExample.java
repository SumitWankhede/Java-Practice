package myTraining;

class Student6{
	int rollno;
	String name, course;
	float fee;
	
	Student6(int rollno, String name, String course){
		this.rollno = rollno;
		this.name = name;
		this.course = course;
	}
	
	Student6(int rollno, String name, String course,float fee){
		this(rollno,name,course);//reusing constructor 
		this.fee = fee;
	}
	
	void display(){
		System.out.println(rollno+" "+name+" "+course+" "+fee);
	}  
}

// Rule: Call to this() must be the first statement in constructor.

public class ThisExample {

	public static void main(String[] args) {
		Student6 s1=new Student6(111,"ankit","java");  
		Student6 s2=new Student6(112,"sumit","java",6000f);  
		s1.display();  
		s2.display(); 
	}

}
