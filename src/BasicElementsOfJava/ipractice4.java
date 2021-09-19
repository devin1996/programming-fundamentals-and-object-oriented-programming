package BasicElementsOfJava;

import java.util.Scanner;
import java.io.*;

public class ipractice4 {


	public static void main(String[] args) throws Exception{ 

//		Fill your code
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        
        for(int j=0;j<=no;j++) {
        for(int i=0;i<j;i++) {
            System.out.print("*");
        }
        System.out.print("\n");
        }

	}
}
