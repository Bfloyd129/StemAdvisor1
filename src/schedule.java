import java.io.FileNotFoundException;
import java.io.IOException;

public class schedule {

    public static void createSchedule(){

    }

    public static void createSchedule(Student student) throws IOException {
       // int csLevel = student.CS;
       // int engrLevel = student.engr;
       // int englishLevel = student.engl;
       // int mathLevel = student.math;
       // int physLevel = student.phys;
       // int chemLevel = student.chem;
        switch (student.major){
            case 0:
                Majors.setEngr(student);
                break;
            case 1:
                Majors.setPhys(student);
                break;
            case 2:
               Majors.setCSAA(student);
                break;
            case 3:
                Majors.setCSAS(student);
                break;
            case 4:
                Majors.setCompEngr(student);
                break;
            case 5:
                Majors.setChem(student);
                break;
        }
    }

}

