package Abstraction;

abstract class base {             // abstract class due to abstract method necessary
    public base() {
        System.out.println("I am constructor of class base");
    }

    public void sayHello() {
        System.out.println("hello man");
    }

    abstract void greet();   // abstract method
    abstract void greet1();
}
abstract class funk extends base{
    @Override
    public void greet() {
        System.out.println("I am funk");
    }
}

class classy extends base{
    public void greet1(){
        System.out.println("I am greet");
    }
}
public class HowToAbs {
    static void main(String[] args) {


    }

}
