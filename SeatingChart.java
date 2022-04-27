import java.util.List;
import java.util.ArrayList;
public class SeatingChart {
    public static List<Student> StudentList = new ArrayList<Student>();
    public static int rows;
    public static int cols;

    public Student[][] seats;

    public SeatingChart(List<Student> studentList, int rows, int cols){
        this.StudentList = studentList;
        this.rows = rows;
        this.cols = cols;
        this.seats = new Student[rows][cols];
        int index = 0;
            for (int i = 0; i < seats.length; i++) {
                for (int j = 0; j < seats[i].length; j++) {
                    seats[i][j] = studentList.get(index);
                    index++;
            }
        }
    }
    public List<Student> getStudentList(){
        return StudentList;
    }
    public int getRows(){
        return rows;
    }
    public int getCols(){
        return cols;
    }


//    seats = new Student[rows][cols];
//    int index = 0;
//        for (int i = 0; i < seats.length; i++) {
//        for (int j = 0; j < seats[i].length; j++) {
//            seats[i][j] = studentList.get(index);
//            index++;
//        }
//    }

    public int removeAbsentStudent(int givenAbs){
        int count = 0;
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                int abs = seats[i][j].getAbsenceCount();
                if (abs > givenAbs) {
                    seats[i][j] = null;
                    count++;
                }
            }
        } return count;
    }

    public void printStuff(){
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j]);
            }
        }
    }
}