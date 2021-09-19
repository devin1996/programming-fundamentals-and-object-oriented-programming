/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultipleInterface;

/**
 *
 * @author Devin Chandula
 */
public class ChildDemo implements FirstInterface, SecondInterface {
  
    @Override
    public void myFirstInterfaceMethod() {
         System.out.println("This my First Interface");
    }

    @Override
    public void mySecondInterfaceMethod() {
        System.out.println("This my Second Interface");
}
}