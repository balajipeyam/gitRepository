package com.balaji;

public class AllowedShapes {
	enum allowedShape {
		Circle, Triangle, Square, Rectangle
	};

	allowedShape shape;

	public static void main(String[] args) {
		AllowedShapes a = new AllowedShapes();
		a.shape = allowedShape.Circle;
		System.out.println("Shape : " + a.shape);

	}

}
