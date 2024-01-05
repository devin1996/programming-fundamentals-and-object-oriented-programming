/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadepattern;

/**
 *
 * @author DEVIN
 */
public class Iphone implements MobileShop {

    @Override
    public void modelNo() {
        System.out.println(" Iphone 6 ");
    }

    @Override
    public void price() {
        System.out.println(" Rs 65000.00 ");

    }

}
