package Interfaces;

class Interface{
    Interface(){
        System.out.println("I am an constructor of Interface class");

    }
    void calle(String c){
        c = "Hello I am an function of interface";
        System.out.println(c);
    }

}
public class HowToInterface {
    public static void main(String[]args) {

        Interface In = new Interface();






    }
}
