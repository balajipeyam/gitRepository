package com.balaji;

public class CompressedString {

	public String compressString(String str) {
		String output = "";
		int counter = 1;
		char[] inputChars = str.toCharArray();
		for (int i = 1; i < inputChars.length; i++) {
			if (inputChars[i - 1] == inputChars[i])
				counter++;
			else {
				if (counter != 1) {
					output = output + inputChars[i - 1] + counter;
					counter = 1;
				} else
					output = output + inputChars[i - 1];
			}
		}
		return output + inputChars[inputChars.length - 1] + counter;
	}

	public static void main(String[] args) {
		CompressedString cs = new CompressedString();
		String str = "abbbccdedddeefghh";
		String output = cs.compressString(str);
		System.out.println(output);

	}
}
