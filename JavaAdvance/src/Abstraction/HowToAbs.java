package Abstraction;

abstract class base {             // abstract class due to abstract method necessary
    public base() {
        System.out.println("I am constructor of class base");
    }

    public void sayHello() {
        System.out.println("hello man");
    }

    abstract void greet();   // abstract method
}
class funk extends base{
    @Override
    public void greet(){
        System.out.println("I am funk");
    }
}

clas classy extends funk(){
    public classy(){
        System.out.println("I am classy");
    }
}
public class HowToAbs {
    static void main(String[] args) {


    }

}
