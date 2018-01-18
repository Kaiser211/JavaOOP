package com.assignmentsjavaoop;

public class Gorilla extends Mammal {
	public void throwSth(){
        System.out.println("Gorilla got sick!");
        this.setEnergy(this.getEnergy()-5);
    }

    public void eatBananas(){
        System.out.println("Gorilla satisfied!");
        this.setEnergy(this.getEnergy()+10);
    }

    public void climb(){
        System.out.println("Gorilla climbed!");
        this.setEnergy(this.getEnergy()-10);
    }
}

