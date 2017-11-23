//XML based spring beans
package com.balaji.springDIpractice;

public class HelloWorld {
	private String message;
	private HelloWorldInput helloWorldInput;

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Your Message : " + message + "\n" + helloWorldInput.getInput());
	}

	public HelloWorldInput getHelloWorldInput() {
		return helloWorldInput;
	}

	public void setHelloWorldInput(HelloWorldInput helloWorldInput) {
		this.helloWorldInput = helloWorldInput;
	}
}
