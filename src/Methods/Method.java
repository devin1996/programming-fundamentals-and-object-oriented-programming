/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

/**
 *
 * @author Devin Chandula
 */
public class Method {
    
static void staticMethod(){
    System.out.println("Static Methods Dont need to create objects for call them");
}    

static void ParameterMethod(String fName){
    
    System.out.println(fName+" Chandula");
}

static int returnMethod(int x){
    return x+5;
}
    
    
}
