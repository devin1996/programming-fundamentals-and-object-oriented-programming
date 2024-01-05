/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Ex3;

public class Bank {

    private String cusName;
    private int accno;
    private String acctype;         // 18+ or Ithuru Mithuru or Ran Kekulu
    private float balance;
    private float amount;           //loan amount

    public Bank() {
    }

    public Bank(String cusName, int accno, String acctype, float balance, float amount) {
        this.cusName = cusName;
        this.accno = accno;
        this.acctype = acctype;
        this.balance = balance;
        this.amount = amount;
    }
    
    /**
     * @return the cusName
     */
    public String getCusName() {
        return cusName;
    }

    /**
     * @param cusName the cusName to set
     */
    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    /**
     * @return the accno
     */
    public int getAccno() {
        return accno;
    }

    /**
     * @param accno the accno to set
     */
    public void setAccno(int accno) {
        this.accno = accno;
    }

    /**
     * @return the acctype
     */
    public String getAcctype() {
        return acctype;
    }

    /**
     * @param acctype the acctype to set
     */
    public void setAcctype(String acctype) {
        this.acctype = acctype;
    }

    /**
     * @return the balance
     */
    public float getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(float balance) {
        this.balance = balance;
    }

    /**
     * @return the amount
     */
    public float getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(float amount) {
        this.amount = amount;
    }

}
