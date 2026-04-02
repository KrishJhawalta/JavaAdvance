package Interfaces;
class Employee{
    int id;
    String name;

    // Constructor for initial value
    public Employee(int i, String n){
        id = i;
        name = n;
    }
     // function for setting value
    void setId(int i){
        id = i;
    }
    void setName(String n){
        name = n;
    }

    // function for getting value

    public int getId() {
        return id;
    }

    public String getName(){
        return name;
    }
}

public class HowToInterface{
    public static void main() {

        // Object creating
        Employee e = new Employee(0,null);
        // setter
        e.setId(55);
        e.setName("krish");
        // getter
        e.getName();
        e.getId();


    }
}