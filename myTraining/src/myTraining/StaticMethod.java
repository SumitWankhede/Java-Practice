package myTraining;

//Program of changing the common property of all objects(static field).  
class Student3{  
   int rollno;  
   String name;  
   static String college = "ITS";  
     
   static void change(){  
	   college = "BBDIT";  
   }  

   Student3(int r, String n){  
	   rollno = r;  
	   name = n;  
   }
   
   void display (){System.out.println(rollno+" "+name+" "+college);}  
}

/* If you apply static keyword with any method, it is known as static method.
	* A static method belongs to the class rather than object of a class.
	* A static method can be invoked without the need for creating an instance of a class.
	* Static method can access static data member and can change the value of it. */


//Program to get cube of a given number by static method 
class Calculate{  
	  static int cube(int x){  
		  return x*x*x;  
	  }  
}

/* Restrictions for static method
There are two main restrictions for the static method. They are:
	The static method can not use non static data member or call non-static method directly.
	This and super cannot be used in static context. 

class A{  
	int a=40;//non static  
   
	public static void main(String args[]){  
		System.out.println(a);  
 	}  
} 

Output:Compile Time Error
*/


// Static block
// Is used to initialize the static data member.
// It is executed before main method at the time of classloading.

public class StaticMethod {
	
	static{
		System.out.println("static block is invoked");
	}  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student3.change();  
		  
	    Student3 s1 = new Student3 (111,"Karan");  
	    Student3 s2 = new Student3 (222,"Aryan");  
	    Student3 s3 = new Student3 (333,"Sonoo");  
	  
	    s1.display();  
	    s2.display();  
	    s3.display(); 
	    
	    int result=Calculate.cube(5);  
	    System.out.println(result);
	}

}
