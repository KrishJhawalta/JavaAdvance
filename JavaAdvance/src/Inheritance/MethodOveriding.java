package Inheritance;

class A{
    public void meth(){
        System.out.println("I am method 1");
    }

    public void meth2(){
        System.out.println("I am method 2");
    }
}

class B extends A{

    public void meth3(){
        System.out.println("I am method 3");
    }
}
public class MethodOveriding{
    public static void main(String[] args) {
         A a = new A();
         a.meth();


    }

}