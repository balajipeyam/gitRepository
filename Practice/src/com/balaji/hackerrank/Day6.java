package com.balaji.hackerrank;

import java.util.Scanner;

public class Day6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		String s[] = new String[n];
		for (int i = 0; i < n; i++)
			s[i] = scan.nextLine();
		for (int i = 0; i < s.length; i++) {
			char charArray[] = s[i].toCharArray();
			char charArrayEven[] = new char[s[i].length() / 2 + s[i].length() % 2];
			char charArrayOdd[] = new char[s[i].length() / 2];
			int even = 0;
			int odd = 0;
			for (int j = 0; j < charArray.length; j++) {
				if (j % 2 == 0) {
					charArrayEven[even] = charArray[j];
					even++;
				} else {
					charArrayOdd[odd] = charArray[j];
					odd++;
				}
			}
			String evenLettersString = new String(charArrayEven);
			String oddLettersString = new String(charArrayOdd);
			System.out.println(evenLettersString + " " + oddLettersString);
		}
	}
}
