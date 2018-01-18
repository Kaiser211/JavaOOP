package com.assignmentsjavaoop;

public class Human {
	//private String name;
	private int strength ;
	private int stealth ;
	private int intelligence;
	private int health;
	
	public Human() {
		//this.name = name;
		this.strength = 3;
		this.intelligence = 3;
		this.stealth = 3;
		this.health = 100;
	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getName() {
//		return name;
//	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	
	public int getStealth() {
		return stealth;
	}
	public void setStealth(int stealth) {
		this.stealth = stealth;
	}
	
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	public void getInfo() {
		System.out.println("Health: " +health);
		System.out.println("Strength: "+strength);
		System.out.println("Intelligence: "+intelligence);
		System.out.println("Stealth: "+stealth+"\n");
		
	}
	public void attack(Human human) {
		human.setHealth(human.getHealth()-strength);
//		System.out.println(name+ " dealt " +strength +" damage to "
//				+human.getName());
		
		
	}

}
