//Andrew Masone

/*Submit a properly formatted word document.   Filename: A05-YourLastName.pdf

        1. Write a short program in the language of your choice that calculates a number's odd parity.
            Show screen shot of the 4 runs of the programs using 4 different strings.
        a. The input: a string of 8 1's and 0's  ex: 1010 1011
        b. The output: the odd parity bit        ex: 0

        2. Find the 3 digit CRC for the following examples.  SHOW YOUR WORK!
        a. Data:  11100
        Divisor: 1101
        b. Data:  11101
        Divisor: 101
*/

import java.util.Scanner;

public class A05_Masone {
    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter a string of 1's and 0's: ");
        String inputstr1 = sc1.nextLine();  //String input of the binary code
        String inputstr2 = inputstr1.replaceAll("\\s",""); //Removing all whitespace from binary code
        int inputint=Integer.parseInt(inputstr2);  //Turning the String into an Int
        //System.out.println(inputint+" inputint first time");
        int output=0;
        for (int x=0; x<7; x++) {
            output = output+(inputint%10);
            inputint=inputint/10;
        }
        if (output==0){
            output=1;
        }
        else{
            output = output % 2;
        }

        System.out.println("The input: a string of 8 1's and 0's is: "+inputstr1);
        //System.out.println(inputint+" inputint second time");
        System.out.println("The output: "+output);
    }
}