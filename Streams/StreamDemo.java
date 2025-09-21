import java.util.*;
class StreamDemo{
	public static void main(String s[]){
	
		ArrayList<String> arr = new ArrayList<>();
		arr.add("Sourav");
		arr.add("Dhiman Sir");
		arr.add("Sayan");
		arr.add("Sujit");
		arr.add("Ram");

		arr.stream()
	  		.filter(ele->ele.startsWith("S"))
			.count();
	  		
	}
}