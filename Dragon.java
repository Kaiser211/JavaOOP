package com.assignmentsjavaoop;

public class Dragon extends Mammal {
	public Dragon() {
		this.setEnergy(300);
	}
	public void fly() {
		System.out.println("Dragon taking off and decrease its energy");
		this.setEnergy(this.getEnergy()-50);
		System.out.println(getEnergy());
	}
	
	public void eatHumans() {
		System.out.println("Dragon increase its energy");
		this.setEnergy(this.getEnergy()+25);
		System.out.println(getEnergy());
	}
	public void attackTown() {
		System.out.println("Dragon decrease its energy");
		this.setEnergy(this.getEnergy()-100);
		System.out.println(getEnergy());
		
	}

}
