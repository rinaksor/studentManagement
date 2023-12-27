package QuanLySV;
import java.util.ArrayList;
import java.util.Scanner;
public class Teacher extends Person {
   private ArrayList<Student> students;




    public Teacher(String name,  String dob, String address) {
        super(name, dob, address);
        this.students = new ArrayList<Student>();
    }


    // Xóa sinh viên ra khỏi danh sách
    public void addStudent(Student student) {
        students.add(student);
    }


    // Xóa sinh viên ra khỏi danh sách
    public void removeStudent(Student student) {
        students.remove(student);
    }


    // Xem thông tin tất cả sinh viên có trong danh sách
    public void viewAllStudents() {
        for (Student student : students) {
            System.out.println(student.toString());
      //  student.hienthi();
        }
    }  
    Student student;    
    public void viewStudent (){
        
        System.out.println(student.toString());
    }
    // Xem điểm của sinh viên
    public void viewGrateStudent(){
        for ( Student student : students){
            student.displayGrate();
        }
    }
    public ArrayList<Student> getStudents() {
        return students;
    }
   
    public void editStudentInfo(Student student) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new name: ");
        String name = sc.nextLine();
        System.out.println("Enter new DOB: ");
        String dob = sc.nextLine();
        System.out.println("Enter new address: ");
        String address = sc.nextLine();
        student.setName(name);
        student.setDob(dob);
        student.setAddress(address);
    }
   


    public void inputGrades(Student student) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Math grade: ");
        double mathGrade = sc.nextDouble();
        System.out.println("Enter Literature grade: ");
        double litGrade = sc.nextDouble();
        System.out.println("Enter English grade: ");
        double engGrade = sc.nextDouble();
        Result result = new Result(student, mathGrade, litGrade, engGrade);
        student.setResult(result);
    }
   


  @Override
  public String toString(){
    return "Teacher name : "+super.getName()+"Date of birth : "+ super.getDob()+"Address : "+super.getAddress();
  }

}
