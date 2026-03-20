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
@Override
    public void meth2(){           // Using method overriding: meth2 of class A is changed in meth2 of class B
        System.out.println("I am method 2 of class B");
    }

    public void meth3(){
        System.out.println("I am method 3");
    }
}
public class MethodOveriding{
    public static void main(String[] args) {
         A a = new A();
         a.meth();
         a.meth2();

         B b = new B();
         b.meth2();
         b.meth3();


    }

}