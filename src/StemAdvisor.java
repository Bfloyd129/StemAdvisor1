
import java.io.FileWriter;
import java.util.ArrayList;

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
    static int nextQuarter = 0;

    static boolean allowSummer = false;
    static Scanner keyboard = new Scanner(System.in);





    public static void main(String[] args) throws IOException {


//greet
        System.out.print("Hello and welcome!");
        System.out.println();
//collect data from user
        collectdata();


        Student Student1 = new Student(FirstName, LastName, major, math, phys, CS, engl, engr, chem, nextQuarter, allowSummer);
        System.out.println("Thanks " + FirstName + "," + "\nYou selected " + Majors.mathList.get(math) + ", " +
                Majors.chem.get(chem) + " " + Majors.english.get(engl) + ", " + Majors.phys.get(phys) + ", " +
                Majors.CS.get(CS) + ", " + Majors.engr.get(engr));
        schedule.createSchedule(Student1);



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
        nextQuarter = getInput("nextQuarter", Majors.nextQuarter);
        System.out.println("Are you interested in taking classes during the summer quarter? (enter true/false)");
        allowSummer = booleanCheck();
    }

    public static boolean booleanCheck() {
        boolean test = false;
        if(keyboard.hasNextBoolean()) {
            test = true;
            return keyboard.nextBoolean();

        } else {
                System.out.println("Your input was weird. Please enter a true or false ");

                while (!(keyboard.hasNextBoolean())) {
                    System.out.println("Please enter a true or false. Try Again.");
                    keyboard.next();
                }
            }
        return keyboard.nextBoolean();

        }
    public static int getInput(String subject, ArrayList options) {
        boolean valid = false;
        int input = 0;

        while (!valid) {
            // Checks for major as it is formatted differently
            if (Objects.equals(subject, "major")) {
                System.out.println("Please select your major from the following (enter number) ");
            } else if (Objects.equals(subject, "nextQuarter")) {
                System.out.println("What is the next quarter you will be taking");
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
