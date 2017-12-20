package com.balaji;

class InsufficientBalanceException extends RuntimeException {
	private String exceptionMessage;

	public String getExceptionMessage() {
		return exceptionMessage;
	}

	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}

	public InsufficientBalanceException(String message) {
		exceptionMessage = message;
	}
}

class BankAccount extends Thread {
	private int accountBalance;

	public int getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}

	public void depositCash(int amount) {
		accountBalance += amount;
	}

	public void withdrawCash(int amount) throws InsufficientBalanceException {
		if (amount >= accountBalance) {
			throw new InsufficientBalanceException(
					"Insufficient Balance in your account, cannot proceed with Withdrawl");
		} else
			accountBalance -= amount;
	}
}

public class Test {
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();
		BankAccount b2 = new BankAccount();
		BankAccount b3 = new BankAccount();
		b1.start();
		b2.start();
		b3.start();
		b1.depositCash(100);
		System.out.println(b1.getAccountBalance());
		try {
			b2.withdrawCash(100);
			b1.withdrawCash(1000);

		} catch (InsufficientBalanceException e) {
			System.out.println(e.getExceptionMessage());
		}
		System.out.println(b1.getAccountBalance());

	}

}
