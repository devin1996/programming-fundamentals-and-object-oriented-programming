/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Ex3;


public class Facade {

    public void check(String cusName, int accno, String acctype, float balance, float amount){

        Bank cus = new Bank(cusName, accno, acctype, balance, amount);
        
        CreditPolicy policy = new CreditPolicy();
        PoliceDepartment record = new PoliceDepartment();

        if(!policy.checkLimit(cus)){
            System.out.println("Your balance is not enough to obtain the loan.");
        }
        else if((policy.checkLimit(cus)) && (!record.getReport(cus))){
            System.out.println("You can obtain the loan.");
        }
        else if((!policy.checkLimit(cus)) && (record.getReport(cus))){
            System.out.println("Your Balance is insufficient & you have police records. \n You can't obtain the loan.");
        }
        else if (record.getReport(cus)){
            System.out.println("You have police records. Loan request rejected.");
        }        
    }
}
