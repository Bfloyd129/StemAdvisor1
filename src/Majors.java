import java.util.ArrayList;
import java.util.List;


public class Majors {
    static ArrayList ArraylistMajors = new ArrayList();


    static {
        ArraylistMajors.add("(0) None");
        ArraylistMajors.add("(1) Mechanical Engr AS-T");
        ArraylistMajors.add("(2) Physics AS-T");
        ArraylistMajors.add("(3) CS AA-DTA");
        ArraylistMajors.add("(4) CS AS-T2");
        ArraylistMajors.add("(5) Computer Engr AS-T2");
        ArraylistMajors.add("(6) Chem AS-T1");
    }
    static ArrayList mathList = new ArrayList();
    static {
        mathList.add("(0) None");
        mathList.add("(1) Algebra for Precalc");
        mathList.add("(2) Precalc1");
        mathList.add("(3) Precalc2");
        mathList.add("(4) Intro to Statistics");
        mathList.add("(5) Calc I");
        mathList.add("(6) Calc II");
        mathList.add("(7) Calc III");
        mathList.add("(8) Calc IV");
        mathList.add("(9) Differential Equations");
        mathList.add("(10) Linear Algebra");


    }


    static ArrayList chem = new ArrayList();
    static{
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
        phys.add("(0) PHYS& 221");
        phys.add("(1) PHYS& 222");
        phys.add("(2) PHYS& 223");






    }
    static ArrayList engr = new ArrayList();


    static {

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





    public void engr(){
        int math = 7+1;
        int chem = 2+1;
        int english = 1+1;
        int phys = 2+1;
        int CS = 1+1;
        int total = math + chem + phys + english + CS;
    }
    public void phys(){
        int math = 7+1;
        int chem = 2+1;
        int english = 1+1;
        int phys = 2+1;
        int CS = 1+1;
        int total = math + chem + phys + english + CS;
    }
    public void CS(){
        int math = 7+1;
        int chem = 2+1;
        int english = 1+1;
        int phys = 2+1;
        int CS = 5+1;
        int total = math + chem + phys + english + CS;
    }
    public void setChem(){
        int math = 7+1;
        int chem = 2+1;
        int english = 1+1;
        int phys = 2+1;
        int CS = 1+1;
        int total = math + chem + phys + english + CS;
    }




}
