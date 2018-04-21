/*
	ISYS 320
	Name(s):
	Date: 
*/
import java.io.*;
import java.util.Scanner;

public class P1_FindMinAndMax {

	public static void main(String[] args) {
        Scanner console = new Scanner( System.in );              
        // YOUR CODE STARTS HERE
        double exit = -1;        
        System.out.println("Type a number (or -1 to stop) ");
        double userNumber = console.nextDouble();
        double smallest = userNumber;
        double largest = userNumber;
        while( userNumber != exit) {
        	if (userNumber < smallest) {
        		smallest = userNumber;
        	} else if (userNumber > largest) {
        		largest = userNumber;
        	}
        	userNumber = console.nextDouble();
        }       
        // YOUR CODE ENDS HERE
        
       System.out.println(smallest);
       System.out.println(largest);
    }

}
