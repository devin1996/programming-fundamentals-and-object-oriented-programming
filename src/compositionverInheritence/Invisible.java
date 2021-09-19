/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositionverInheritence;

import javax.crypto.spec.IvParameterSpec;

/**
 *
 * @author User
 */
public class Invisible implements IVisible {

    @Override
    public void Draw() {
       System.out.print("I won't appear");
    }
    
}
