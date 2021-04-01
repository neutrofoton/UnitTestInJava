package io.neutrolab.operation;

public class RectangularSolidOp implements GeometryOp3D {

	private int length;
	private int width;
	private int height;
	
	public RectangularSolidOp(int length, int width, int height) {
		this.length= length;
		this.width=width;
		this.height=height;
	}
	
	@Override
	public double calculateSurfaceArea() {
		return 2*(
				length*width + 
				height*width +
				height*length
			);
	}

	@Override
	public double calculateVolume() {
		return length*width*height;
	}

}
