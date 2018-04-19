package myTraining;

// class which implements Cloneable interface
class Student18 implements Cloneable{
	int rollNo;
	String name;
	
	// constructor to initialize object
	Student18(int rollNo, String name){
		this.rollNo = rollNo;
		this.name = name;
	}

	// method overloading of clone() from Cloneable interface. you must mention CloneNotSupportedException  
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

public class ObjectCloning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Student18 s1 = new Student18(101, "Amit");
			Student18 s2 = (Student18)s1.clone();
			
			System.out.println(s1.rollNo+" "+s1.name);  
			System.out.println(s2.rollNo+" "+s2.name); 
		}catch(CloneNotSupportedException c){
			System.out.println("Oops!!!");
		}
	}
}
