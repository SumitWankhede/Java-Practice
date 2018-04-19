package myTraining;

class Company{
	String name = "Capgemini";
}

//Inheritance using extends keyword
//single inheritance 
class Employee extends Company{
	float salary = 40000;
}

//multilevel inheritance
class Programmer extends Employee{
	int bonus = 10000;
}

//Hierarchical inheritance
class Tester extends Employee{
	int bonus = 10000;
}

/* To reduce the complexity and simplify the language, 
 * multiple inheritance is not supported in java. 
 * Consider a scenario where A, B and C are three classes. 
 * The C class inherits A and B classes. 
 * If A and B classes have same method and you call it from child class object, 
 * there will be ambiguity to call method of A or B class. */
/*class A{  
	void msg(){System.out.println("Hello");}  
}  
class B{  
	void msg(){System.out.println("Welcome");}  
}  
class C extends A,B{    //suppose if it were  
   
	Public Static void main(String args[]){  
		C obj=new C();  
		obj.msg();      //Now which msg() method would be invoked?  
	}  
}*/  


public class Inheritance {

	public static void main(String[] args) {
		
		Programmer p = new Programmer();
		
		System.out.println("Programmer Salary is :" + p.salary);
		System.out.println("Bonus is :" + p.bonus);
		System.out.println("Company name :" + p.name);
		
		Tester t = new Tester();
		
		System.out.println("Tester Salary is :" + t.salary);
		System.out.println("Bonus is :" + t.bonus);
		System.out.println("Company name :" + t.name);
	}
}
