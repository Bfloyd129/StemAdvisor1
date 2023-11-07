import javax.swing.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;
import java.io.IOException;




public class StemAdvisor {
    //declaring static variables
    static String FirstName;
    static String LastName;
    static int major;
    static int math = 0;
    static int phys =0;
    static int CS = 0;
    static int engl = 0;
    static int engr = 0;
    static int chem = 0;
    static Scanner keyboard = new Scanner(System.in);




    public static void main(String[] args) {


//greet
        System.out.print("Hello and welcome!");
        System.out.println();
//collect data from user
        collectdata();


        Student Student1 = new Student(FirstName, LastName, major, math, phys, CS, engl, engr, chem);
        System.out.println("Thanks " + FirstName + "," + "\nYou selected " + Majors.mathList.get(math) + ", " +
                Majors.chem.get(chem) + " " + Majors.english.get(engl) + ", " + Majors.phys.get(phys) + ", " +
                Majors.CS.get(CS) + ", " + Majors.engr.get(engr));


    }
    public static void collectdata(){

        System.out.println("Please enter your name (First, Last)");
        FirstName = keyboard.next();
        LastName = keyboard.next();
        System.out.println("Thanks, your name is " + FirstName + " " + LastName);

        major = getInput("major", Majors.ArraylistMajors);
        math = getInput("math", Majors.mathList);
        chem = getInput("chem", Majors.chem);
        engl = getInput("english", Majors.english);
        phys = getInput("phys", Majors.phys);
        CS = getInput("CS", Majors.CS);
        engr = getInput("engr", Majors.engr);
    }

    public static int getInput(String subject, ArrayList options) {
        boolean valid = false;
        int input = 0;

        while (!valid) {
            // Checks for major as it is formatted differently
            if (Objects.equals(subject, "major")) {
                System.out.println("Please select your major from the following (enter number) ");
            } else {
                System.out.println("Please select the highest " + subject + " class you have taken");
            }
            // Prints out options
            System.out.println(options);
            // Prevents infinite loop
            keyboard.nextLine();

            if (keyboard.hasNextInt()) {
                input = keyboard.nextInt();
                // Checks if valid; ends loop if true
                if (input <= options.size() - 1 && input >= 0) {
                    valid = true;
                } else {
                    System.out.println("Please enter a valid number from the list above");
                }
            } else {
                System.out.println("Input must be numeric");
            }
        }
        return input;
    }
}
