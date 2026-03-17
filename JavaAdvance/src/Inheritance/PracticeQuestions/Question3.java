package Inheritance.PracticeQuestions;
// Create a class Rectangle and use inheritance to create another class cuboid. create method for area and volume

class Circle{
    private int radius;
    Circle(int radius){
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    double getArea(){
        return 3.14*radius*radius;
    }

    double getCircumference(){
        return 2*(3.14*radius);
    }

}
class Cylinder extends Circle{
    private int height;
    Cylinder(int r, int height){
        super(r);
        this.height = height;
    }

    public double getVolume(){
        return getArea()*height;
    }
}

public class Question3 {
    static void main(String[] args) {
        Circle c1 = new Circle(5);
        System.out.println("Circle area is: "+c1.getArea());
        System.out.println("Circle circumference is: "+c1.getCircumference());

        Cylinder cye = new Cylinder(5,5);
        System.out.println("Cylinder volume is: "+cye.getVolume());

    }
}
