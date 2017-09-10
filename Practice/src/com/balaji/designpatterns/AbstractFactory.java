package com.balaji.designpatterns;

abstract class Automobile {
	public abstract String getEngine();

	public abstract String getFuel();

	public abstract String getCapacity();

	@Override
	public String toString() {
		return "ENGINE TYPE : " + this.getEngine() + "\tENGINE CAPACITY : " + this.getCapacity() + "\tFUEL TYPE : "
				+ this.getFuel();
	}

}

class TwoWheeler extends Automobile {
	private String engine;
	private String capacity;
	private String fuel;

	public TwoWheeler(String engine, String capacity, String fuel) {
		this.engine = engine;
		this.capacity = capacity;
		this.fuel = fuel;
	}

	@Override
	public String getEngine() {
		return this.engine;
	}

	@Override
	public String getFuel() {
		return this.fuel;
	}

	@Override
	public String getCapacity() {
		return this.capacity;
	}

}

class FourWheeler extends Automobile {
	private String engine;
	private String capacity;
	private String fuel;

	public FourWheeler(String engine, String capacity, String fuel) {
		this.engine = engine;
		this.capacity = capacity;
		this.fuel = fuel;
	}

	@Override
	public String getEngine() {
		return this.engine;
	}

	@Override
	public String getFuel() {
		return this.fuel;
	}

	@Override
	public String getCapacity() {
		return this.capacity;
	}
}

interface AutomobileAbstractFactory {
	public Automobile createAutomobile();
}

class TwoWheelerFactory implements AutomobileAbstractFactory {
	private String engine;
	private String capacity;
	private String fuel;

	public TwoWheelerFactory(String engine, String capacity, String fuel) {
		this.engine = engine;
		this.capacity = capacity;
		this.fuel = fuel;
	}

	@Override
	public Automobile createAutomobile() {
		return new TwoWheeler(engine, capacity, fuel);
	}
}

class FourWheelerFactory implements AutomobileAbstractFactory {
	private String engine;
	private String capacity;
	private String fuel;

	public FourWheelerFactory(String engine, String capacity, String fuel) {
		this.engine = engine;
		this.capacity = capacity;
		this.fuel = fuel;
	}

	@Override
	public Automobile createAutomobile() {
		return new FourWheeler(engine, capacity, fuel);
	}

}

class AutomobileFactory {
	public static Automobile createAutomobile(AutomobileAbstractFactory factory) {
		return factory.createAutomobile();
	}
}

public class AbstractFactory {
	public static void main(String[] args) {
		Automobile twoWheeler = AutomobileFactory
				.createAutomobile(new TwoWheelerFactory("2-Stroke", "100CC", "Petrol"));
		Automobile fourWheeler = AutomobileFactory
				.createAutomobile(new FourWheelerFactory("Naturally Aspirated", "2L", "Diesel"));

		System.out.println("Two Wheeler Details :" + twoWheeler);
		System.out.println("Four Wheeler Details :" + fourWheeler);
	}
}
