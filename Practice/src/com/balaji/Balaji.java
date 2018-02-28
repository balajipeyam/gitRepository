package com.balaji;

public class Balaji {

	public static void main(String[] args) {
		String balaji = "balaji";
		String peyam = "peyam";

		balaji = balaji + peyam;
		System.out.println(balaji);
		peyam = balaji.substring(0, balaji.length() - peyam.length());
		balaji = balaji.substring(balaji.length() - peyam.length() + 1, balaji.length());
		System.out.println(balaji + peyam);
		String temp = balaji;
		balaji = peyam;
		peyam = temp;
		System.out.println(balaji + peyam);
	}

	public String getSecret() {
		// TODO Auto-generated method stub
		return "secret";
	}

}
