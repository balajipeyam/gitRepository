package com.balaji;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test1 {
	public static void main(String[] args) throws IOException {
		System.out.println("Reading File");
		File file1 = new File("C:\\Users\\balaji_pandurangam\\Desktop\\Files\\accounts.txt");
		FileReader fr = new FileReader(file1);
		BufferedReader br = new BufferedReader(fr);
		int counter = 0;
		String output = "account_no in (", st;
		while ((st = br.readLine()) != null) {
			if (counter < 999) {
				output = output + st + ',';
				counter++;
			} else {
				counter = 0;
				output = output + st + ")\n or account_no in (";
			}
		}
		System.out.println("Writing File....");
		File file2 = new File("C:\\Users\\balaji_pandurangam\\Desktop\\Files\\accounts_output.txt");
		FileWriter fw = new FileWriter(file2);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(output);
		bw.close();
		fw.close();
		System.out.println("Finished Writing.");
	}

}
