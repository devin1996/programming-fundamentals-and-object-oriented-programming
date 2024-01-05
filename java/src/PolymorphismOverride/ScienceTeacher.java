/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolymorphismOverride;

/**
 *
 * @author Devin Chandula
 */
public class ScienceTeacher extends Teacher {
    @Override
    public void Teaching(){
        System.out.println("Specialized for teach Science");
    }
}
