/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Ex3;

public class PoliceDepartment {

    public boolean getReport(Bank cus){
        
        if(cus.getCusName().equals("ABC")){       //this customer has police records
            return true;
        }
        else if(cus.getAccno()==54321){             //this customer has police records
            return true;
        }
        else{
            return false;
        }
    }

}
