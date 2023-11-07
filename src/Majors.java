import java.util.ArrayList;
import java.util.List;

public class Majors {
    static ArrayList ArraylistMajors = new ArrayList();

    static {
        ArraylistMajors.add("(0) None");
        ArraylistMajors.add("(1) MechEngr");
        ArraylistMajors.add("(2) Physics");
        ArraylistMajors.add("(3) CS");
        ArraylistMajors.add("(4) chem");
    }
    static ArrayList mathList = new ArrayList();
    static {
        mathList.add("(0) None");
        mathList.add("(1) precalc1");
        mathList.add("(2) precalc2");
        mathList.add("(3) calc2");
        mathList.add("(4) calc3");
        mathList.add("(5) calc4");
        mathList.add("(6) linear algebra");
        mathList.add("(7) differential equations");

    }

    static ArrayList chem = new ArrayList();
    static{
        chem.add("(0) None");
        chem.add("(1) intro to chem");
        chem.add("(2) chem 161");
        chem.add("(3) chem 162");
        chem.add("(4) chem 163");

    }
    static ArrayList english = new ArrayList();
    static {
        english.add("(0) None");
        english.add("(1) engl99");
        english.add("(2) engl101");

    }
    static ArrayList CS = new ArrayList();
    static {
        CS.add("(0) None");
        CS.add("(1) CS115");
        CS.add("(2) Language 1");
        CS.add("(3) Language 2");
        CS.add("(4) Language 3");
    }
    static ArrayList phys = new ArrayList();
    static {
        phys.add("(0) phys 221");
        phys.add("(1) phys 221");
        phys.add("(2) phys 222");



    }
    static ArrayList engr = new ArrayList();

    static {
        engr.add("(0) engr 111");
        engr.add("(1) Statics engr214 ");
        engr.add("(2) Dynamics engr 215");
        engr.add("(3) Mechanics of Materials engr 225");
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
