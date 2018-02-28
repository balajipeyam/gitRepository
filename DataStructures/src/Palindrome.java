
public class Palindrome {

	public boolean isPalindrome(String s) {
		char[] allChars = s.toCharArray();
		for (int i = 0; i < allChars.length / 2; i++)
			if (allChars[i] != allChars[allChars.length - i - 1])
				return false;
		return true;
	}

	public static void main(String[] args) {
		String s = "malayalam";
		Palindrome p = new Palindrome();
		if (p.isPalindrome(s))
			System.out.println("Is a palindrome");
		else
			System.out.println("Is not a Palindrome");
	}
}
