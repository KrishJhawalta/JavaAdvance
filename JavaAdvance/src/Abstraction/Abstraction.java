package Abstraction;

abstract class mobiles{



    mobiles(){
        System.out.println("Constructor of mobiles");
    }

    abstract void call();   // abstract method
    abstract void message();

}

abstract class Samsung extends mobiles{

    @Override
    void call(){
        System.out.println("Calling samsung");
    }

    @Override
    void message(){
        System.out.println("Messaging from samsung");
    }
}


public class Abstraction{
    public static void main(String[] args) {
        Samsung s1 = new Samsung();
        s1.message();
        
        d;
        
    }

}