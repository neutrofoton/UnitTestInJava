package io.neutrolab.operation;

public class CircleOp implements GeometryOp2D {

	private int radius;
	public CircleOp(int radius) {
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public double calculatePerimeterOrCircumference() {
		return 2 * Math.PI * radius;
	}

}
