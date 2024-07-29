package practice;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abba";
		String name = word(s);
		if (s.equals(name)) {
			System.out.println("Given name is Palindrome");

		} else {
			System.out.println("Given name is not palindrome");
		}

	}

	public static String word(String s) {
		if (s.isEmpty()) {
			return s;

		} else {
			return word(s.substring(1)) + s.charAt(0);
		}

	}
}
