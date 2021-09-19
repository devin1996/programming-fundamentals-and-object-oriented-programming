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
class AverageScoreDisplay 
{ 
    private float runRate; 
    private int expectedScore; 
  
    public void update(int currentScore,int wickets,float overs) 
    { 
        this.runRate = (float)currentScore/overs; 
        this.expectedScore = (int) (this.runRate * 50); 
        display(); 
    } 
  
    public void display() 
    { 
        System.out.println( "Run Rate is" + runRate);
        System.out.println( "Expected Score is" + expectedScore);
    } 
} 
  