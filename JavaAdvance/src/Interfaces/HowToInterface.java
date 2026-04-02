package Interfaces;
class Employee{
    int id;
    String name;

    // Constructor for initial value
    public Employee(int i, String n){
        id = i;
        name = n;
    }
     // function for giving value to employee
    void setId(int i){
        id = i;
    }
    void setName(String n){
        name = n;
    }

    public int getId() {
        return id;
    }

    public String getName(){
        return name;
    }
}

public class HowToInterface{
    public static void main() {

        Employee e = new Employee(0,null);
        e.setId(55);
        e.setName("krish");
        e.getName();
        e.getId()


    }
}