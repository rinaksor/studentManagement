package QuanLySV;
import java.util.ArrayList;

public class Student extends Person {
     private int studentId;
    //private String course;
    private Result result;
    private ArrayList <Student> students;


    

    public Student(int studentId,String name, String Dob,String address) {
        super(name, Dob,address);
        this.studentId =studentId;
    //    this.course = course;
        students = new ArrayList<>();
    }
   
    public void setResult(Result result) {
        this.result = result;
    }
    public Result getResult() {
        return result;
    }
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public  void displayGrate (){
        System.out.println("Grate of student : "+result.getAverageGrade());  


    }
   
    public  String toString(){
        return ( "Student ID :"+getStudentId()+", Student name :"+super.getName()+ ", Ngay sinh : "+super.getDob()+", Dia chi : "+super.getAddress());
    }
       
    // public void hienthi (){
    //     System.out.printf("%-5s | %-20s | %-10s | %-10s", "studentID ", "Student name ", "Date of birth ","Address");
    //     System.out.println();
    //     for (Student student : students ){
    //         System.out.printf("%-5d | %-20s| %-10s| %-10s|", student.getStudentId(),student.getName(),student.getDob(),student.getAddress());
    //     }
    // }

}