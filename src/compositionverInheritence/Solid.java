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
public class Solid implements ICollidable{

    @Override
    public void Collide() {
        System.out.print("Bang");
    }

}
