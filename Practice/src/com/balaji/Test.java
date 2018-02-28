package com.balaji;

<<<<<<< Upstream, based on branch 'master' of https://github.com/balajipeyam/gitRepository.git
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
=======
@FunctionalInterface
interface interfaceTest {
	int method(int a, int b);

	default void method2() {
		System.out.println("Method 2");
	}

	default void method3() {
		System.out.println("Method 3");
	}

	static void method4() {
		System.out.println("Method 4");
	}

	static void method5() {
		System.out.println("Method 5");
	}
}

class xyz implements interfaceTest {

	@Override
	public int method(int a, int b) {
		return a + b;
	}

>>>>>>> 8f71139 Infy Laptop
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

<<<<<<< Upstream, based on branch 'master' of https://github.com/balajipeyam/gitRepository.git
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getExceptionMessage());
		}
		System.out.println(b1.getAccountBalance());
=======
		interfaceTest testIn = (int a, int b) -> {
			return a + a + b + b;
>>>>>>> 8f71139 Infy Laptop

<<<<<<< Upstream, based on branch 'master' of https://github.com/balajipeyam/gitRepository.git
=======
		};
		
		interfaceTest.method4();
		StringBuffer s1 = new StringBuffer("Hello World");
		s1.insert(6, "Good ");
		System.out.println(s1);
>>>>>>> 8f71139 Infy Laptop
	}

}
