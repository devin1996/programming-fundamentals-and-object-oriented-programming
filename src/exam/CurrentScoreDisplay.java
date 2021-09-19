/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

/**
 *
 * @author User
 */
class CurrentScoreDisplay 
{ 
    private int currentScore, wickets; 
    private float overs; 
  
    public void update(int currentScore,int wickets,float overs) 
    { 
        this.currentScore = currentScore; 
        this.wickets = wickets; 
        this.overs = overs; 
        display(); 
    } 
  
    public void display() 
    { 
        System.out.println("\nCurrent Score is " +currentScore);
        System.out.println("\nNumber of Wickets " +wickets);
        System.out.println("\nNumber of Overs " +overs);
    } 
} 