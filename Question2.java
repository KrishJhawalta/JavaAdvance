package Inheritance.PracticeQuestions;

// Create a class Rectangle and use inheritance to create another class cuboid. Try to keep it as close to real world scenario as possible...
class rectangle{
   private int length;
    private int breadth;

    public rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int getArea(){
        return length*breadth;
    }

    public int getPerimeter(){
        return 2*(length+breadth);
    }

    public int getBreadth(){
        return breadth;
    }

    public int getLength(){
        return length;
    }
}

// new class
class cuboid extends rectangle {
    private int height;

    public cuboid(int length, int breadth, int height) {
        super(length, breadth); // constructor call
        this.height = length;
    }

    public int getVolume(){
        return getArea() * getBreadth() * getLength();
    }
}

public class Question2 {
   public static void main(String[] args) {

        rectangle r = new rectangle(10,20);
       System.out.println("Rectangle area is: "+r.getArea());
       System.out.println("Rectangle perimeter is: "+r.getPerimeter());

       cuboid c = new cuboid(4,1,5);
       System.out.println("Cuboid volume is: "+c.getVolume());




    }
}
