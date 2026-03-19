package Inheritance.PracticeQuestions;

// create a class circle and user inheritance to create another class cylinder in it
class circle{
    circle(){
        System.out.println("I am circle class");
    }
}
class cylinder extends circle{
    cylinder(){
        System.out.println("I am cylinder class");
    }
}
public class Question1 {
    static void main(String[] args) {
        cylinder c = new cylinder();
    }
}
