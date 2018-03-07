package com.gmai.a.zagorodnia;

public class Dock {
	
	private String name;
	private Ship ship;
	

	public Dock(String name) {
		super();
		this.name = name;		
	}
	
	public Dock() {
		super();
		
	}

	public Ship getShip() {
		return ship;
	}

	public void setShip(Ship ship) {
		this.ship = ship;
	}
		
	public synchronized void unloadCargo (Ship ship, int cargoNum) {

		this.ship = ship;
		try {
			for (int i = 1; i <= cargoNum; i++) {
				Thread.sleep(30);
				ship.setCargo(ship.getCargo()-1);
		 		System.out.println(ship.getName() + " unload it's " + i + " cargo in " + name);
			}		
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(ship.getName() + " in dock " + name + " finished");
		this.ship = null;
	}

	@Override
	public String toString() {
		return "Dock [name=" + name + ", ship=" + ship + "]";
	}
		

}
