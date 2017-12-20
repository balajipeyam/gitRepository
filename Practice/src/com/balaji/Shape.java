package com.balaji;

public class Shape {
	enum allowedShape {
		Circle, Triangle, Square, Rectangle
	}

	allowedShape objectShape;

	public static void main(String[] args) {
		Shape a = new Shape();
		a.objectShape = allowedShape.Circle;
		System.out.println("Shape : " + a.objectShape);

	}

}
