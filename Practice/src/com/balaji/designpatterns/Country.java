package com.balaji.designpatterns;

public class Country {
	private String name = "";
	private States states;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public States getStates() {
		return states;
	}

	public void setStates(States states) {
		this.states = states;
	}

}
