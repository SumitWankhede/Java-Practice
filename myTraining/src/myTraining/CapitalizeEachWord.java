package myTraining;

class StringFormatter{
	public static String capitalizeWord(String str){
		String[] words = str.split("\\s");
		String word = "";
		for(String w : words){
			String first = w.substring(0,1);
			String afterFirst = w.substring(1);
			word += first.toUpperCase() + afterFirst + " ";
		}
		return word.trim();
	}
}

public class CapitalizeEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringFormatter obj = new StringFormatter();
		System.out.println(obj.capitalizeWord("my name is khan"));  
	    System.out.println(obj.capitalizeWord("I am sonoo jaiswal")); 
	}

}
