package myTraining;

class Account{
	int acc_no;
	String name;
	float amount;
	
	void insert(int a, String n, float amt){
		acc_no = a;
		name = n;
		amount = amt;
	}
	
	void deposit(float amt){
		amount = amount + amt;
		System.out.println(amt + " deposited");
	}
	
	void withdraw(float amt){
		if(amount > amt){
			amount = amount - amt;
			System.out.println(amt + " withdrawn");
		}
		else{
			System.out.println("Insufficient balance!");
		}
	}
	
	void checkBalance(){
		System.out.println("Balance is: "+amount);
	}
	
	void display(){
		System.out.println("Name: "+ name);
		System.out.println("Account number is: "+ acc_no);
		System.out.println("Balance is: "+ amount);
	}
}

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account();
		a1.insert(832345, "Ankit", 1000);
		a1.display();
		a1.checkBalance();
		a1.deposit(40000);
		a1.checkBalance();
		a1.withdraw(15000);
		a1.checkBalance();
	}
}
