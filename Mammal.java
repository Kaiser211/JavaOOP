package com.assignmentsjavaoop;

public class Mammal {
	private int energylevel = 100;
	
	public Mammal() {
		
	}
	public void setEnergy(int energylevel) {
		this.energylevel = energylevel;
	}
	public int getEnergy() {
		return energylevel;
	}
	public int displayEnergy() {
		System.out.println(energylevel);
		return energylevel;
	}
}
