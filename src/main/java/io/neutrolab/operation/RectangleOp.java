package io.neutrolab.operation;

public class RectangleOp implements GeometryOp2D {

	private int length;
	private int width;
	
	public RectangleOp(int length, int width) {
		this.length=length;
		this.width=width;
	}
	
	@Override
	public double calculateArea() {
		return length * width;
	}

	@Override
	public double calculatePerimeterOrCircumference() {
		return 2*(length + width);
	}

}
