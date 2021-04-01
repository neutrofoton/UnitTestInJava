package io.neutrolab.operation;

import io.neutrolab.operation.service.SphereService;

public class SphereOp implements GeometryOp3D{

	private int radius;
	
	private SphereService service;
	
	public SphereOp(int radius) {
		this.radius=radius;
	}
	
	public SphereOp(SphereService service) {
		this.service=service;
	}
	
	@Override
	public double calculateSurfaceArea() {
		return 4 * Math.PI * Math.pow(radius, 2);
	}

	@Override
	public double calculateVolume() {
		return (4/3) * Math.PI * Math.pow(radius, 3); 
	}
	
	public double calculateVolumeWithService(int r) {
		
		//return (4/3) * Math.PI * Math.pow(r, 3); 
		return service.evaluateVolume(r);
	}

}
