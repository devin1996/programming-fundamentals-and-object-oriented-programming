/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Ex3;

public class FacadeDemo {

    public static void main(String[] args) {

        Facade facade = new Facade();

        //check eligibility by giving customer details
        facade.check("John", 12345, "Ithuru Mithuru", (float) 100000.00, (float) 1000000000.00);
    }
}
