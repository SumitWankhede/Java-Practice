package myTraining;

class Bike1{  
	 int speedlimit=90;  
}

public class DataMemberRuntimePolymorphism extends Bike1{

	int speedlimit=150; 
	
	public static void main(String[] args) {
		
		Bike1 obj=new DataMemberRuntimePolymorphism();  
		
		System.out.println(obj.speedlimit);//90 

	}

}
