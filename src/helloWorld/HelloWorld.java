/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloWorld;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author User
 */
public class HelloWorld {

    public void runHelp() throws FileNotFoundException, IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("C:/Projects/codingloo/JAVA-Basics-and-OOP/src/helloWorld/newfile.txt"))) {
            for (String line; (line = br.readLine()) != null;) {
                System.out.println(line);
            }
            // line is not visible here.
        }
    }
}
