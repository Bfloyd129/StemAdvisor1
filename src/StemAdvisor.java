import javax.swing.*;
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
        System.out.printf("Hello and welcome!");
        System.out.println("");
//collect data from user
        collectdata();

        Student Student1 = new Student(FirstName, LastName, major, math, phys, CS, engl, engr, chem);
        System.out.println("Thanks " + FirstName + "," + "\nYou selected " + Majors.mathList.get(math) + ", " +
                Majors.chem.get(chem) + " " + Majors.english.get(engl) + ", " + Majors.phys.get(phys) + ", " +
                Majors.CS.get(CS) + ", " + Majors.engr.get(engr));

    }
    public static void collectdata(){
        boolean goodData = false;




        System.out.println("Please enter your name (First, Last)");
        FirstName = keyboard.next();
        LastName = keyboard.next();
        System.out.println("Thanks, your name is " + FirstName + " " + LastName);








        boolean done = false;
        String test ;




        while (!done){
//ask for input
            System.out.println("please select your major from the following (enter number) ");
//display options
            System.out.println(Majors.ArraylistMajors);
//new variable to hold data being verified (stops infinite loop idk why)
            test = keyboard.nextLine();




            if (keyboard.hasNextInt()) {
//is number
                major = keyboard.nextInt();
//is one of the valid options
                if((major <= Majors.ArraylistMajors.size() - 1) && (major>=0)){
//validation met. Loop exit condition met
                    done = true;
                }
                else{
//data was invalid
                    System.out.println("please enter a valid number from the list above");
                }
            }
//wrong input type
            else {
                System.out.println("Input must be numeric");
            }
        }
        done=false;




        while(!done) {
            System.out.println("please select the highest math class you have taken");
            System.out.println(Majors.mathList);
            test = keyboard.nextLine();


            if(keyboard.hasNextInt()) {
                math = keyboard.nextInt();
                if(math <= Majors.mathList.size() - 1 && math>=0){
                    done = true;
                }
                else{
                    System.out.println("please enter a valid number from the list above");
                }
            }
            else{
                System.out.println("Input must be numeric");
            }
        }
        done = false;


        while (!done) {
            System.out.println("please select the highest chem class you have taken");
            System.out.println(Majors.chem);
            test = keyboard.nextLine();


            if  (keyboard.hasNextInt()) {
                chem = keyboard.nextInt();
                if (chem <= Majors.chem.size() - 1 && chem >= 0) {
                    done = true;
                } else {
                    System.out.println("please enter a valid number from the list above");
                }
            } else {
                System.out.println("Input must be numeric");
            }
        }
        done = false;


        while (!done) {
            System.out.println("please select the highest english class you have taken");
            System.out.println(Majors.english);
            test = keyboard.nextLine();


            if (keyboard.hasNextInt()) {
                engl = keyboard.nextInt();
                if (engl <= Majors.english.size() - 1 && engl >= 0) {
                    done = true;
                } else {
                    System.out.println("please enter a valid number from the list above");
                }
            } else {
                System.out.println("Input must be numeric");
            }
        }
        done = false;


        while (!done) {
            System.out.println("please select the highest phys class you have taken");
            System.out.println(Majors.phys);
            test = keyboard.nextLine();


            if (keyboard.hasNextInt()) {
                phys = keyboard.nextInt();
                if (phys <= Majors.phys.size() - 1 && phys >= 0) {
                    done = true;
                } else {
                    System.out.println("please enter a valid number from the list above");
                }
            } else {
                System.out.println("Input must be numeric");
            }
        }
        done = false;


        while (!done) {
            System.out.println("please select the highest CS class you have taken");
            System.out.println(Majors.CS);
            test = keyboard.nextLine();


            if (keyboard.hasNextInt()) {
                CS = keyboard.nextInt();
                if (CS <= Majors.CS.size() - 1 && CS >= 0) {
                    done = true;
                } else {
                    System.out.println("please enter a valid number from the list above");
                }
            } else {
                System.out.println("Input must be numeric");
            }
        }
        done = false;


        while (!done) {
            System.out.println("please select the highest Engr class you have taken");
            System.out.println(Majors.engr);
            test = keyboard.nextLine();


            if (keyboard.hasNextInt()) {
                engr = keyboard.nextInt();
                if (engr <= Majors.engr.size() - 1 && engr >= 0) {
                    done = true;
                } else {
                    System.out.println("please enter a valid number from the list above");
                }
            } else {
                System.out.println("Input must be numeric");
            }
        }
    }
}


