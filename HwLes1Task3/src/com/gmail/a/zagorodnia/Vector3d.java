package com.gmail.a.zagorodnia;

public class Vector3d {
	
	private double x;
	private double y;
	private double z;

	public Vector3d(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public Vector3d() {
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}
	
	public void setZ(double z) {
		this.z = z;
	}
	
	public Vector3d vectAddition(Vector3d vector) {
		return new Vector3d(x + vector.x, y + vector.y, z + vector.z);
	}
	
	public Vector3d scalarProd(Vector3d vector) {
		return new Vector3d(x * vector.x, y * vector.y, z * vector.z);
	}
	
	public Vector3d vectorProd(Vector3d vector) {
		
		return new Vector3d(y * vector.z - z * vector.y, z * vector.x - x * vector.z, x * vector.y - y * vector.x);
    	
//		return new Vector3d(z * vector.y - y * vector.z, x * vector.z - z * vector.x, y * vector.x - x * vector.y);
    	
	}
        
	@Override
	public String toString() {
		return "Vector3d [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
    
}
