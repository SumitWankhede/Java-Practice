package myTraining;

class reverseToggle{
	
	public String run(String str){
		// sIHT sI tNIOPTAVAJ
		String[] words = str.split("\\s");
		String reverseToggle = "";
		for(String w : words){
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			String first = sb.substring(0, 1);
			String afterFirst = sb.substring(1);
			reverseToggle += first + afterFirst.toUpperCase() + " ";
		}
		return reverseToggle.trim();
	}
}

public class StringReverseToggle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseToggle obj = new reverseToggle();
		System.out.println(obj.run("this is javatpoint"));
	}

}
