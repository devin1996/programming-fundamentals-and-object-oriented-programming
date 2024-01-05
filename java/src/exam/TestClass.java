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
public class TestClass {
        public static void main(String args[]) 
    { 

        AverageScoreDisplay averageScoreDisplay = 
                                       new AverageScoreDisplay(); 
        CurrentScoreDisplay currentScoreDisplay = 
                                       new CurrentScoreDisplay(); 
  
        CricketData latestScore = new CricketData(currentScoreDisplay, 
                                                  averageScoreDisplay); 
        latestScore.setCurrentScore(123);
        latestScore.setWickets(3);
        latestScore.setOvers((float) 12.5);
  
        latestScore.dataChanged();

    } 
}
