/**
 * Cay S. Horstmann -- Chapter 1
 * Exercise #8
 * Write a program that reads a string and prints all of its 
 * nonempty substrings.
 */
package java_ex8_printstring;

import java.util.Scanner;

/**
 *
 * @author jhonatan
 */
public class Java_Ex8_PrintString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your text: ");
        String text = scan.nextLine();
        int i=0;
        while(!text.substring(i).isEmpty()){
            System.out.println(text.substring(i,i+1));
            i++;
        }
    }
    
}
