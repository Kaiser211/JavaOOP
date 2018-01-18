package com.assignmentsjavaoop;

public class ProjectTest {
	
	public static Portfolio portfolio = new Portfolio();

    public static void main(String[] args){
        portfolio.addProject(new Project("Apple ","Great!.",11.5));
        portfolio.addProject(new Project("Laptop","That laptop I didn't buy yet.",19.00));
        portfolio.addProject(new Project("K"," I can't tell you about.",190.00));
        portfolio.addProject(new Project("Java ","It's not easy.",7.50));
    
        portfolio.showPortfolio();
    }
}
