package QuanLySV;

import java.util.Scanner;

// import javafx.beans.binding.When;

public class Main {
  public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        Teacher teacher = new Teacher("Thanh",  "01/01/1980", "123 Main St");
       
        // Tạo sinh viên
        Student student1 = new Student(1, "Hoang", "12/2/2002", "Da nang");
        Student student2 = new Student(2, "Trang", "20/2/2004", "Da nang");

        // Thêm sinh viên vào danh sách của giáo viên
        teacher.addStudent(student1);
        teacher.addStudent(student2);

        // Hiển thị menu lựa chọn chức vụ
        int role =0;
        String password =null;
        do {
            System.out.println("------------------------------------");
            System.out.println("|   STUDENT MANAGEMANT PROGRAM     |");
            System.out.println("------------------------------------");
            System.out.println("| Select role:                     |");
            System.out.println("| 1. Teacher                       |");
            System.out.println("| 2. Student                       |");
            System.out.println("| 0. Exit                          |");
            System.out.println("------------------------------------");
            System.out.println("Please choose role for the teacher or student : ");
            role = sc.nextInt();
            sc.nextLine();

            if (role == 1) {
               
                
                System.out.println("Enter a fixed password for the teacher");
                password =sc.nextLine();             
               
                if (password.equals("teacher123")){
                    int function = 0;
                do {
                    System.out.println("-----------------teacher--------------------");
                    System.out.println("| Select function:                         |");
                    System.out.println("| 1. Add student                           |");
                    System.out.println("| 2. Remove student                        |");
                    System.out.println("| 3. View all students                     |");
                    System.out.println("| 4. Edit student info                     |");
                    System.out.println("| 5. Input grades                          |");
                    System.out.println("| 6. View grate of student                 |");
                    System.out.println("| 0. Back                                  |");
                    System.out.println("--------------------------------------------");

                    System.out.println("Please choose number from 0 to 6 :  ");
                    function = sc.nextInt();
                    sc.nextLine();
                    while (function >7 || function <0){
                        System.out.println("Enter again  from 0 to 6 :  ");
                        function = sc.nextInt();
                    }
                    switch (function){
                        case 1 :
                            System.out.println("Enter student ID: ");
                            int studentId=sc.nextInt();
                            sc.nextLine();
                            System.out.println("Enter student name: "); 
                            String name = sc.nextLine();
                            System.out.println("Student date of birth : ");
                            String dob = sc.nextLine();
                            System.out.println("Enter student address: ");
                            String address = sc.nextLine();
                            Student newStudent = new Student(studentId,name, dob, address);
                            teacher.addStudent(newStudent);
                            System.out.println("Student added.");
                            break;
                        case 2 :
                            System.out.println("Enter student ID: ");
                            int Id =sc.nextInt();
                            boolean found = false;
                            for (Student student : teacher.getStudents()) {
                                if (student.getStudentId()==Id) {
                                    teacher.removeStudent(student);
                                    System.out.println("Student removed.");
                                    found = true;
                                    break;
                                }
                            }
                            if (!found) {
                                System.out.println("Student not found.");
                            }
                            break;
                        case 3 :
                            teacher.viewAllStudents();
                        // cập nhật thông tin sinh viên
                            break;
                        case 4 :
                            System.out.println("Update student information ");
                            System.out.println("Enter id of student to update : ");
                            int ID = sc.nextInt();
                            // tao bien check de kiem tra sinh vien cos ton tai
                            boolean check =false;
                            for (Student student : teacher.getStudents()){
                                if (student.getStudentId()==ID){// Kiểm tra sinh viên nay có tồn tại hay không
                                    teacher.editStudentInfo(student);
                                    check=true;
                                    System.out.println("Update successful student information");
                                }
                            }
                            if (!check){ // Trường họp không tồn tại thì hiện thị sinh viên đó không tôn tại
                                System.out.println("Student not exit ");
                            }
                            break;
                            // Nhập điểm cho sinh viên .
                        case 5 :
                            System.out.println("Enter id of student to  ");
                            int iD = sc.nextInt();
                            boolean find = false;
                            for ( Student student :teacher.getStudents()){
                                if (student.getStudentId()==iD){
                                    teacher.inputGrades(student);
                                    System.out.println("Student info input grade ");
                                    find=true;
                                }
                            }
                            if (find==false){
                                System.out.println("Student not exit ");
                            }
                            break ;
                            case 6 :
                                System.out.println("Enter id of student :");
                                int iid = sc.nextInt();


                                boolean checkk=false;
                                for (Student student : teacher.getStudents()){
                                    if (student.getStudentId()==iid){
                                        teacher.viewGrateStudent();
                                        checkk = true;
                                    }                                   
                                }
                                if (checkk==false){// Kiem tra sinh vien do khong ton 
                                    System.out.println("Student not exit ");
                                    System.out.println("------------------");
                                }
                            break;
                        default :
                            System.out.println("Invalid student ");
                    }
                 }while (function !=0);                  
                }                            
            }
            else if (role ==2){
                System.out.println("Enter a fixed password for the student ");
                password =sc.nextLine();
                if (password.equals("student123")){
                    // Sinh vien xem thông tin
                System.out.println("Enter Id of student : ");
                int idd = sc.nextInt();

                boolean findd =false;
                for(Student student : teacher.getStudents()){
                    if ( student.getStudentId()==idd){
                        System.out.println(student.toString());
                        findd =true;
                    }
                }
                if  (findd==false ){
                    System.out.println("Student not exit ");
                }  
            }
        }
    }while (role !=0);
    
    }
}