/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author Devin Chandula
 */
public class Arrays {
    public static void main(String args[]){
        String[] car={"Tesla","Nissan","Toyota","Ford"};
        System.out.println(car[0]);
        
        car[3]= "Vega";
        System.out.println(car[3]);
        
        System.out.println(car.length);
        
        for (int i = 0; i < car.length; i++) {
            System.out.println(car[i]);
        }
        
        for(String i : car){
            System.out.println(i);
        }
        
        int[][] myNumbers = {{1,2,3,4},{5,6,7}};
        int x = myNumbers[1][2];
        System.out.println(x);
        
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers.length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
            
        }
}
    
}
