package com.balaji.designpatterns;

class Automobile1 {

	// mandatory paramenters
	private String engineType;
	private String fuelType;

	// optional parameters
	private boolean isAirConditioned;
	private int fuelTankCapacity;

	
	//private constructor, since new object creation is restricted from outside
	private Automobile1(AutomobileBuilder automobileBuilder) {
		this.engineType = automobileBuilder.engineType;
		this.fuelType = automobileBuilder.fuelType;
		this.isAirConditioned = automobileBuilder.isAirConditioned;
		this.fuelTankCapacity = automobileBuilder.fuelTankCapacity;
	}

	public String getEngineType() {
		return engineType;
	}

	public String getFuelType() {
		return fuelType;
	}

	public boolean isAirConditioned() {
		return isAirConditioned;
	}

	public int getfuelTankCapacity() {
		return fuelTankCapacity;
	}

	@Override
	public String toString() {
		return "Automobile Details :" + this.engineType + "\t" + this.fuelType + "\t AirConditioning : "
				+ this.isAirConditioned + "\t fuel tank : " + this.fuelTankCapacity;
	}

	public static class AutomobileBuilder {
		// mandatory paramenters
		private String engineType;
		private String fuelType;

		// optional parameters
		private boolean isAirConditioned;
		private int fuelTankCapacity;

		public AutomobileBuilder(String engineType, String fuelType) {
			this.engineType = engineType;
			this.fuelType = fuelType;
		}

		public AutomobileBuilder setAirCOnditioned(boolean isAirConditioned) {
			this.isAirConditioned = isAirConditioned;
			return this;
		}

		public AutomobileBuilder setFuelTankCapacity(int fuelTankCapacity) {
			this.fuelTankCapacity = fuelTankCapacity;
			return this;
		}

		public Automobile1 build() {
			return new Automobile1(this);
		}
	}
}

public class BuilderPattern {
	public static void main(String[] args) {
		Automobile1 automobile1 = new Automobile1.AutomobileBuilder("Naturally Aspirated", "Petrol")
				.setFuelTankCapacity(120).setAirCOnditioned(true).build();
		System.out.println(automobile1.toString());
	}

}
