import java.util.ArrayList;

public class Student {
    public String name;
    public int absenceCount;
    public static ArrayList<Student> studentList = new ArrayList<Student>();
    public Student(String name, int absenceCount) {
        this.name = name;
        this.absenceCount = absenceCount;
    }

    public String getName(){
        return name;
    }
    public int getAbsenceCount(){
        return absenceCount;
    }

}