package QuanLySV;

public abstract class Person {
    private String name;
    private String dob;
    private String address;


    public Person(String name, String dob, String address) {
        this.name = name;
      //  this.id = id;
        this.dob = dob;
        this.address = address;
    }
   
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
   
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public void setAddress(String address) {
        this.address = address;
    }


    public String getAddress() {
        return address;
    }
   
    public abstract String toString () ;
}