package com.gmai.a.zagorodnia;

import java.util.Arrays;

public class Ship implements Runnable {
	
	private String name;
	private int cargo;
	private Dock [] dock;
		
	public Ship(String name, int cargo, Dock [] dock) {
		super();
		this.name = name;
		this.cargo = cargo;
		this.dock = dock;
	}
		
	public Ship() {
		super();
	}
	
	public int getCargo() {
		return cargo;
	}

	public void setCargo(int cargo) {
		this.cargo = cargo;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	@Override
	public void run() {
				
		while (cargo != 0) {
			
			for (Dock dock : dock) {
				
				if(dock.getShip() == null && cargo != 0) {
					
					dock.unloadCargo(this, cargo);
				} 
			}
		}			
	}

	@Override
	public String toString() {
		return "Ship [name=" + name + ", cargo=" + cargo + ", dock=" + Arrays.toString(dock) + "]";
	}
	
	
}
