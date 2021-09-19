/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Ex3;

public class CreditPolicy {

    public static float plus18_limit = (float) 10000.00;    //define the minimum balance to obtain loan for 18+ accounts
    public static float ithurumithuru_limit = (float) 15000.00;    //define the minimum balance to obtain loan for ithurumithuru accounts

    
    //check customer details with policy
    public boolean checkLimit(Bank cus){
        
        if ((cus.getBalance() > cus.getAmount()) && (cus.getAcctype().equals("18+")) && (cus.getBalance() > plus18_limit)){
            return true;
        }
        else if ((cus.getBalance() > cus.getAmount()) && (cus.getAcctype().equals("Ithuru Mithuru")) && (cus.getBalance() > ithurumithuru_limit)){
            return true;
        }
        else{
            return false;
        }
    }
}
