public class Student {
    String first = "";
    String last = "";
    int major = 0;
    String Class;
    int math;
    int phys;
    int CS;
    int engl;
    int engr;
    int chem;

    public Student() {
        this("", "", 0, 0, 0, 0, 0, 0, 0);
    }

    public Student(String first, String last, int major, int math, int phys, int CS, int engl, int engr, int chem) {
        this.last = last;
        this.first = first;
        this.major = major;
        this.math = math;
        this.phys = phys;
        this.CS = CS;
        this.engl = engl;
        this.engr = engr;
        this.chem = chem;

    }


}
