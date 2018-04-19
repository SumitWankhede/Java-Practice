package myTraining;

class Bike{
	// Default constructor
	Bike(){
		System.out.println("Bike is created");
	}
}

class Student{
	int id;
	String name;
	int age;
	
	// Default constructor
	Student(){}
	
	// Parameterized constructor
	Student(int i, String n){
		id = i;
		name = n;
	}
	
	// Constructor overloading
	Student(int i, String n, int a){
		id = i;
		name = n;
		age = a;
	}
	
	// Copy constructor
	Student(Student s){
		id = s.id;
		name = s.name;
		age = s.age;
	}
	
	void display(){
		System.out.println(id + " " + name + " " + age);
	}
}

public class Constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b1 = new Bike();  // Default constructor
		Student s1 = new Student(5,"Ravi");   // Parameterized constructor
		Student s2 = new Student(3,"Shiv", 18); // Constructor overloading
		Student s3 = new Student(s2); // Copy constructor
		Student s4 = new Student();   // Copying values without constructor
		
		s1.display();
		
		s2.display();
		
		s3.display();
		
		s4.id = s3.id;
		s4.name = s3.name;
		s4.age = s3.age;
		s4.display();
	}
}
