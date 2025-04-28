abstract class Employee{
    String name, company;
    public Employee(String name, String company){
        this.name = name;
        this.company = company;
    }
    abstract void printDesignation();
    public void printName(){
        System.out.println("Name: " + name);
    }

}

class Banker extends Employee{
    String designation;
    public Banker(String name, String company, String designation){
        super(name, company);
        this.designation = designation;
    }

    public void printDesignation(){
        System.out.println("Designation: " + designation);
    }
}

public class AbstractTest {
    public static void main(String[] args){
        Employee obj = new Banker("Mr. Mamun", "MTB", "Assistant Vice President");
        obj.printName();
        obj.printDesignation();

    }
}
