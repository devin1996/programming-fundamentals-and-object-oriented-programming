/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Variables;


public class DataTypes {
    public static void main (String args[]){
      int no1 = 20;
      
      System.out.println(no1);
      
      //widenig casting
      int myInt = 9;
      double myDouble = myInt;
      
      System.out.println(myDouble);
      
      //narrowing casting
      double dNo = 9.123456;
      int dInt = (int)dNo;
      
        System.out.println(dInt);
        
     //Strings
     String txt = "Madduma Acharige Devin Chandula";
     System.out.println(txt.length());
     System.out.println(txt.toLowerCase());
     System.out.println(txt.toUpperCase());
     
     System.out.println(txt.indexOf("Devin"));
     
     String fName= "Devin";
     String lName="Chandula";
     
     System.out.println("My name is"+fName+" "+lName);
     System.out.println(fName.concat(lName));
     
     //Java Math
     System.out.println(Math.max(5,10));
     System.out.println(Math.min(5,10));
     System.out.println(Math.sqrt(10));
     System.out.println(Math.abs(-5.5));
     System.out.println(Math.random());
     
     //boolean
     int x = 10;
     int y = 20;
     
     System.out.println(x<y);
     System.out.println(x>y);
     System.out.println(x==10);
     System.out.println(x==15);
     
     int day=9;
     switch(day){
         case 1:System.out.println("M");break;
         case 2:System.out.println("T");break;
         case 3:System.out.println("W");break;
         case 4:System.out.println("T");break;
         case 5:System.out.println("F");break;
         case 6:System.out.println("Sa");break;
         case 7:System.out.println("S");break;
         default:System.out.println("Error");
             }
     
     //for each
     String[] cars = {"Toyota","Nissan","Vega","Tesla","BMW","Ford"};
     for(String i:cars){
        System.out.println(i);
     }
     
     //break
        for (int i = 0; i < 10; i++) {
            if(i==4){
            break;
            }
        System.out.println(i);
     }
        
     for (int i = 0; i < 10; i++) {
            if(i==4){
            continue;
            }
        System.out.println(i);
     }
     
     
    }
    
}
