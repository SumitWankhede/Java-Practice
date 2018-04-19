package myTraining;

class Operations{
	int data = 50;
	
	void change(int data){
		data = data + 100;
	}
	
	void change(Operations op){
		op.data = op.data + 100;
	}
}

public class CallByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operations obj = new Operations();
		
		System.out.println("Call by value example : 1");
		System.out.println("Before change: " + obj.data);
		obj.change(500);
		System.out.println("After change: " + obj.data);
		
		System.out.println("Call by value example : 2");
		System.out.println("before change "+obj.data);  
		obj.change(obj);//passing object  
		System.out.println("after change "+obj.data);
	}
}
