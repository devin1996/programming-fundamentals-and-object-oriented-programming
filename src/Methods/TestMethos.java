/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

import static Methods.Method.ParameterMethod;
import static Methods.Method.returnMethod;
import static Methods.Method.staticMethod;

/**
 *
 * @author Devin Chandula
 */
public class TestMethos {
    public static void main(String argsd[]){
           staticMethod();
           staticMethod();
           
           ParameterMethod("Devin");
           
           int y= returnMethod(20);
           
           System.out.println(y);
        }
}
