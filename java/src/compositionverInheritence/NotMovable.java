/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositionverInheritence;

/**
 *
 * @author User
 */
public class NotMovable implements IUpdatable{

    @Override
    public void update() {
       System.out.print("I'm saying put");
    }
    
}
