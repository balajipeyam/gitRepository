package com.balaji;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandling {
	public static void main(String[] args) throws IOException {
		File f1 = new File("C://Users//balaji_pandurangam//Desktop//input.txt");
		try {
			FileReader fr1 = new FileReader(f1);
			BufferedReader br1 = new BufferedReader(fr1);
			String s = br1.readLine();
			int[] num = new int[20];
			int i = 0;
			while (s != null) {
				num[i] = Integer.parseInt(s);
				System.out.println(num[i]);
				i++;
				s = br1.readLine();
			}
			br1.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		}
	}

}
