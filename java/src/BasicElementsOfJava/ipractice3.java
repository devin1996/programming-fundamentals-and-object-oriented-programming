package BasicElementsOfJava;

import java.util.*;
import java.io.*;

public class ipractice3{
	public static void main(String[] args) throws Exception{ 

//		Fill your code

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        
        if(age<15){
            System.out.print("Not Allowed");
        }
        else if(age>60){
            System.out.print("Not Allowed");
        }
        else{
            System.out.print("Allowed");
        }

	}
}

