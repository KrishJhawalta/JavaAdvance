// {extends} keyword is use to inherit the superclass
package Inheritance;
class Animal{
    private String name;

    Animal(){
        System.out.print(" I am animal");
    }
}
class Dog extends Animal{     // class Dog
    Dog(){
        System.out.println(" I am dog");
    }
}

class cat extends Animal{     // class Cat
    cat(){
        System.out.print(" I am cat");
    }
}
public class Inheritance {
    static void main(String[] args) {
        Dog d = new Dog();      // d object contains all functions of Animal class
        cat c = new cat();


    }
}
