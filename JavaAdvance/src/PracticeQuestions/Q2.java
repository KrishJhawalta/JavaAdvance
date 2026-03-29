package PracticeQuestions;

abstract class Pen{
    public abstract void write();
    public abstract void refill();
    
}
class FountainPen extends Pen{

    public void write(){
        System.out.println("Writing with fountain pen");
    }

    public void refill(){
        System.out.println("Refilling fountain pen");
    }

    public void changeNib(){
        System.out.println("Changing nib of fountain pen");
    }

}

public class Q2 {
    public static void main(String[]args){

        // Question 2: Create a pen class from Q1 to create concrete class FountainPen with additional method changeNib();

        FountainPen fp = new FountainPen();
        fp.write();
        fp.refill();
        fp.changeNib();
        
    }
    
}
