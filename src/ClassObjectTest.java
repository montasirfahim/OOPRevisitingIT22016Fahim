class Teacher{
    String name, dept, university, designation;
    public Teacher(String name, String university, String dept, String designation){
        this.name = name;
        this.university = university;
        this.dept = dept;
        this.designation = designation;
    }

    public void printInfo(){
        System.out.println("Name: " + name + " University: " + university + " Dept: " + dept + " Designation: " + designation);
    }
}

public class ClassObjectTest {
    public static void main(String[] args){
        Teacher teacher1 = new Teacher("Dr. Ziaur Rahman", "MBSTU", "ICT", "Associate Professor");
        teacher1.printInfo();
    }
}
