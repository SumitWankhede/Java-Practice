package myTraining;

class Author{
	String authorName;
	int age;
	String place;
	 Author(String name,int age,String place)
	 {
		  this.authorName=name;
		  this.age=age;
		  this.place=place;
	 }
	 public String getAuthorName()
	 {
		 return authorName;
	 }
	 public int getAge()
	 {
		 return age;
	 }
	 public String getPlace()
	 {
		 return place;
	 }
}

class Book{
	String name;
	int price;
	Author auth; // Aggregation
	
	Book(String n, int p, Author a){
		name = n;
		price = p;
		auth = a;
	}
	
	public void showDetails(){
		System.out.println("Book is " + name);
		System.out.println("price is " + price);
		System.out.println("Author is " + auth.getAuthorName());
	}
}

// When use Aggregation?
// Code reuse is also best achieved by aggregation when there is no is-a relationship.
// Inheritance should be used only if the relationship is-a is maintained 
// throughout the lifetime of the objects involved; otherwise, aggregation is the best choice.

/*
 * When A is not going to consume all the properties of B then it is advisable to use aggregation
 * instead of inheritance. 
 * */


public class Aggregation {

	public static void main(String[] args) {
		
		Author ath = new Author("Chetan", 22, "Mumbai");
		Book b = new Book("Boys", 330, ath);
		b.showDetails();
	}
}