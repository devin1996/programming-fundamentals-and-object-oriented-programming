/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Devin Chandula
 */
class MathsTeacher implements Teacher{
  
  @Override
  public void Salary() {
    // The body of Salary() is provided here
    System.out.println("Her Salary is 30000 ");
  }

  @Override
    public void Subject() {
         System.out.println("She mainly focused on Vectors");
    }
    
}
