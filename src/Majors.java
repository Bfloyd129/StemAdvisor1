import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;


public class Majors {
    int mathReq;
    int physReq;
    int CSReq;
    int englReq;
    int engrReq;
    int chemReq;
    static int I = 0;
    static boolean full = false;

    static FileWriter schedText;
    static PrintWriter schedPrint;

    static ArrayList<String> ArraylistMajors = new ArrayList<>();
//create new majors
    public Majors(int math, int phys, int CS, int engl, int engr, int chem) {
        this.mathReq = math;
        this.physReq = phys;
        this.CSReq = CS;
        this.englReq = engl;
        this.engrReq = engr;
        this.chemReq = chem;

    }

    static {
//major options
        ArraylistMajors.add("(0) Mechanical Engr AS-T");
        ArraylistMajors.add("(1) Physics AS-T");
        ArraylistMajors.add("(2) CS AA-DTA");
        ArraylistMajors.add("(3) CS AS-T2");
        ArraylistMajors.add("(4) Computer Engr AS-T2");
        ArraylistMajors.add("(5) Chem AS-T1");
    }

    static ArrayList mathList = new ArrayList();

    static {//classes  available
        mathList.add("(0) None");
        mathList.add("(1) Algebra for Precalc");
        mathList.add("(2) Precalc1");
        mathList.add("(3) Precalc2");
        mathList.add("(4) Intro to Statistics");
        mathList.add("(5) Calc I");
        mathList.add("(6) Calc II");
        mathList.add("(7) Calc III");
        mathList.add("(8) Differential Equations");
        mathList.add("(9) Linear Algebra");
        mathList.add("(10) Calc IV");
//beans

    }


    static ArrayList chem = new ArrayList();

    static {
        chem.add("(0) None");
        chem.add("(1) CHEM& 121");
        chem.add("(2) CHEM& 139");
        chem.add("(2) CHEM& 161");
        chem.add("(3) CHEM& 162");
        chem.add("(4) CHEM& 163");
        chem.add("(5) CHEM& 261");
        chem.add("(6) CHEM& 262");
        chem.add("(7) CHEM& 263");


    }

    static ArrayList english = new ArrayList();

    static {
        english.add("(0) None");
        english.add("(1) ENGL& 99");
        english.add("(2) ENGL& 101");
        english.add("(3) ENGL& 102");
        english.add("(4) ENGL& 235");


    }

    static ArrayList CS = new ArrayList();

    static {
        CS.add("(0) None");
        CS.add("(1) CS 115");
        CS.add("(2) CS I C++");
        CS.add("(3) CS II C++");
        CS.add("(4) CS III C++");
        CS.add("(5) CS I Java");
        CS.add("(6) CS II Java");
        CS.add("(7) CS III Java");


    }

    static ArrayList phys = new ArrayList();

    static {
        phys.add("(0) none");
        phys.add("(1) PHYS& 221");
        phys.add("(2) PHYS& 222");
        phys.add("(3) PHYS& 223");

    }

    static ArrayList engr = new ArrayList();


    static {
        engr.add("(0) none");
        engr.add("(1) ENGR& 214-Statics");
        engr.add("(2) ENGR& 215-Dynamics");
        engr.add("(3) ENGR& 225-Mechanics of Materials");
    }

    static ArrayList nextQuarter = new ArrayList();

    static {
        nextQuarter.add("(0) FALL");
        nextQuarter.add("(1) WINTER");
        nextQuarter.add("(2) SPRING");
        nextQuarter.add("(3) SUMMER");
    }

    public static void setEngr(Student student) throws IOException { //create a new engr student, populates values for requirements, then fills the schedule
        Majors engrStudent = new Majors(10 , 2+1, 1 + 1, 1 + 1, 2+1, 2 + 1);//class requirements
        fill(engrStudent, student);//fill schedule
    }
    public static void setPhys(Student student) throws IOException {
        Majors physStudent = new Majors(10 , 2+1, 1 + 1, 1 + 1, 2, 2 + 1);
        fill(physStudent, student);
    }
    public static void setChem(Student student) throws IOException {
        Majors chemStudent = new Majors(10 , 2 + 1, 1 + 1, 3 + 1,  1, 7 + 1);
        fill(chemStudent, student);
    }


    public static void setCSAA(Student student) throws IOException {
        Majors CSStudent = new Majors(10 ,2 + 1, 4 + 1, 3 + 1, 1, 1);
        fill(CSStudent, student);
    }


    public static void setCSAS(Student student) throws IOException {
        Majors CS2Student = new Majors(10 , 2 + 1, 6 + 1, 3 + 1, 1, 1);
        fill(CS2Student, student);
    }


    public static void setCompEngr(Student student) throws IOException {
        Majors cmpengrStudent = new Majors(10 ,2 + 1, 2 + 1, 3 + 1,  2 + 1, 2 + 1);
        fill(cmpengrStudent, student);
    }

    public static int matchFill(int studentVal, int reqVal, String[] quarter, ArrayList<String> classList){
        int b = studentVal;
        if (I < 3) {//check if the quarter array is full
            if (studentVal < reqVal) {
                b = studentVal + 1;
                quarter[I] = classList.get(b);
                I++;
            }
        }
        return b;
    }

    public static void fill(Majors major, Student student) throws IOException {
        int mathReq = major.mathReq;
        int chemReq = major.chemReq;
        int englishReq = major.englReq;
        int physReq = major.physReq;
        int CSReq = major.CSReq;
        int engrReq = major.engrReq;
        ArrayList<String[]> engrSched = new ArrayList();
        boolean enoughCredits = false;
        while (!enoughCredits) {

            while (!full) {
                if (student.math >= mathReq && student.CS >= CSReq &&
                        student.engl >= englishReq && student.engr >= engrReq
                        && student.chem >= chemReq && student.phys >= physReq) {
                    enoughCredits = true;
                    try {
                        schedText = new FileWriter("Schedule.txt");
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                    schedPrint = new PrintWriter(schedText);
                    schedPrint.println("Schedule for " + student.first + ", " + student.last);
                    for (int p = 0; p < engrSched.size(); p++) {
                        switch (StemAdvisor.nextQuarter) {
                            case 0:
                                System.out.print("Fall:   ");
                                schedPrint.print("fall:   ");
                                StemAdvisor.nextQuarter++;
                                break;
                            case 1:
                                System.out.print("Winter: ");
                                schedPrint.print("Winter: ");
                                StemAdvisor.nextQuarter++;
                                break;
                            case 2:
                                System.out.print("Spring: ");
                                schedPrint.print("Spring: ");
                                if (StemAdvisor.allowSummer) {
                                    StemAdvisor.nextQuarter++;
                                } else {
                                    StemAdvisor.nextQuarter = 0;
                                }
                                break;
                            case 3:
                                System.out.print("Summer: ");
                                schedPrint.print("Summer: ");
                                StemAdvisor.nextQuarter = 0;
                                break;
                        }
                        System.out.println(Arrays.toString(engrSched.get(p)));
                        schedPrint.println(Arrays.toString(engrSched.get(p)));
                    }
                    schedText.close();
                    break;
                }
                full = false;
                 I = 0;
                String[] quarter = new String[3];//creates a new quarter array
                engrSched.add(quarter);//adds the new quarter into the schedule array
                student.math = matchFill(student.math, major.mathReq, quarter, Majors.mathList);//calls to match classes taken to required and adds
                //classes to the quarter array

                student.CS = matchFill(student.CS, major.CSReq, quarter, Majors.CS);

                student.engl = matchFill(student.engl, major.englReq, quarter, Majors.english);

                student.chem = matchFill(student.chem, major.chemReq, quarter, Majors.chem);

                student.phys = matchFill(student.phys, major.physReq, quarter, Majors.phys);

                student.engr = matchFill(student.engr, major.engrReq, quarter, Majors.engr);

                if(I < 3 ){
                quarter[I] = ("elective");
                I++;}

                if(I < 3){
                quarter[I] = ("elective");
                I++;}

            }
        }

        {

        }

    }
}





