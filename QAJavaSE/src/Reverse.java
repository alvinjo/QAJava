
public class Reverse {

	public static void main(String[] args) {
		System.out.println(reverse("hello"));
		System.out.println(reverse("olleh"));
		System.out.println(reverse("world"));
	}
	
	private static String reverse(String text) {
		String word = "";
		for(int i=text.length(); i>0; i--) {
			word += text.charAt(i-1);
		}
		return word;
	}
	
}
