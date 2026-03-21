
// Create methods for area & volume in question 2. Also create getters and setters
class Rectangle{
    private int length;
    private int width;

    Rectangle(int l, int w){
        length = l;
        width = w;
    }

    public int getLength(){
        return length;
    }
    public int getWidth(){
        return width;
    }

    public int getPerimeter(){
        return 2*(length+width);
    }

}
class cylinder extends Rectangle{
    private int hieght;
    cylinder(int w, int h){
        super(w,w);
       hieght = h;
    }

    public void setHeight(int h){  //method
        hieght = h;
    }

    public double getVolume(){
        return 3.14*(getWidth()*getWidth())*hieght;
    }

}
public class Question4 {
   public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10,20);
        System.out.println(" Perimeter is: "+r1.getPerimeter());

        cylinder c1 = new cylinder(10,20);

        System.out.println("Volume is: "+c1.getPerimeter()); // Output of program		

    }

}
