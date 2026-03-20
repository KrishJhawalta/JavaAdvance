package  Inheritance;

class A{
    public int meth(){
        System.out.println("I am method 1");
    }

    public int meth2(){
        System.out.println("I am method 2");
    }
}

class B extends A{

    public int meth3(){
        System.out.println("I am method 3");
    }
}
public class MethodOveriding{
    public class main(String[]args){
        B b = new B();


    }

}