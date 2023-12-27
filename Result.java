package QuanLySV;

public class Result {
    private Student student;
   
    private double mathGrade;
    private double litGrade;
    private double engGrade;


    public Result(Student student, double mathGrade, double litGrade, double engGrade) {
        this.student = student;
        this.mathGrade = mathGrade;
        this.litGrade = litGrade;
        this.engGrade = engGrade;
    }


    public Student getStudent() {
        return student;
    }
    public double getMathGrade() {
        return mathGrade;
    }


    public double getLitGrade() {
        return litGrade;
    }


    public double getEngGrade() {
        return engGrade;
    }


    public double getAverageGrade() {
        return (mathGrade + litGrade + engGrade) / 3.0;
    }
   
    public void display() {
        System.out.println(student.toString()+"Math grade: " + mathGrade + ", Literature grade: " + litGrade + ", English grade: " + engGrade + ", Average grade: " + getAverageGrade());
    }
}
