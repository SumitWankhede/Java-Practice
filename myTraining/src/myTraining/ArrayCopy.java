package myTraining;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] src = {'a','b','c','L','o','v','e','f','g','h'};
		char[] tar = new char[4];
		
		System.arraycopy(src, 3, tar, 0, 4);
		System.out.println(tar);
	}

}
