package PracticeQuestions;

class Monkey{
    void jump(){
        System.out.println("Monkey jumping");
    }

    void bite(){
        System.out.println("Monkey biting");
    }
}

class Human extends Monkey{
    // Human inherits jump() and bite() methods from Monkey
    void bite1(){
        System.out.println("Human biting");
    }
}

public class Q3 {
    public static void main(String[] args) {

        // Q3: Create a monkey class with method jump() & bite(). Create a human class and inherit the monkey basic interfaces
        
        Human h = new Human();
        h.jump();
        h.bite();
        h.bite1();
        
        
    }
    
}
