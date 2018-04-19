package myTraining;

class Rectangle{
	int length;
	int width;
	
	void insert(int l, int w){
		length = l;
		width = w;
	}
	
	void calculateArea(){
		System.out.println("Area of rectangle: " + length*width);
	}
}

public class TestRectangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(), r2 = new Rectangle();
		r1.insert(4, 5);
		r2.insert(70, 80);
		r1.calculateArea();
		r2.calculateArea();
	}

}
