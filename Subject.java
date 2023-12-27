package QuanLySV;

class Subject {
    protected String subject_name;
    private int subjectID;
    

    public Subject(String subject_name, int subjectID) {
        this.subject_name = subject_name;
        this.subjectID =subjectID;
        
    }
    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }
    public int getSubjectID() {
        return subjectID;
    }
    public Object getSubjectName() {
        return null;
    }

    public Object getCredit() {
        return null;
    }
    public String toString (){
        return "Subject ID "+getSubjectID()+ " Subject name : "+getSubjectName();
    }
}
