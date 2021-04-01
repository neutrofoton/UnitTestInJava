package io.neutrolab.operation.service;

public class SphereService {
	
	public double evaluateVolume(double radius) {
		return (4/3) * Math.PI * Math.pow(radius, 3); 
	}
}
