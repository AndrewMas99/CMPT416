//Andrew Masone

/*
Write a short program in a language of your choice.  It should input a password and then validate it with these rules:
    a. valid passwords have exactly 8 characters
    b. There is both alpha and numerics

 Display a screenshot of the program executing, with examples of 2 invalid passwords (of the above rules) and a third valid entry.
 */

import java.util.Scanner;
import java.util.regex.Pattern;

public class A06_Masone {
    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter a password 8 characters long, contains both alpha and numerical value,and has no spaces:");
        String inputpass = sc1.nextLine();
        boolean validpass=false;
        inputpass = inputpass.replaceAll("\\s","");
        String regex = regex = "^(?=.*[a-zA-Z])(?=.*[0-9])[A-Za-z0-9]+$";
        //System.out.println("Checkpoint before for loop");
        while(validpass==false) {
            if (inputpass.length() == 8) {
                if(inputpass.matches(regex)){
                validpass = true;
                }
                else{
                    System.out.println("Please re-enter your password with both letters and numerical values");
                    inputpass = sc1.nextLine();
                }
            }
            else{
                System.out.println("Please re-enter your password 8 characters long with no spaces");
                inputpass = sc1.nextLine();
            }
        }
        //System.out.println("Checkpoint 2");
        System.out.println("Valid Password Entry: "+inputpass);
    }
}