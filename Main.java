package com.assignmentsjavaoop;

public class Main {

	public static void main(String[] args) {
		
		Human human = new Human();
		human.getInfo();
		
		Wizard wizard = new Wizard();
		wizard.getInfo();
		human.attack(wizard);
		wizard.getInfo();
		
		Ninja ninja = new Ninja();
		ninja.getInfo();
		wizard.heal(ninja);
		ninja.getInfo();
		
		Samurai samurai = new Samurai();
		samurai.deathBlow(human);
		samurai.getInfo();
		human.getInfo();
		
		Samurai samurai2 = new Samurai();
		Samurai samurai3 = new Samurai();
		Samurai samurai4 = new Samurai();
		Samurai samurai5 = new Samurai();
		Samurai samurai6 = new Samurai();
		
		System.out.println(Samurai.howMany());
		
		
		
		
	}

}
