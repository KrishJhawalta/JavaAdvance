package Inheritance;
class employee{
    int id;

    employee(int id){
        this.id=id;       // {this.} keyword reference the variable in constructor
    }

    public int getId() {
        return id;
    }
}
class user extends employee{
    int id;
    user(int id){
        super(id);      // {super} keyword uses parent keyword
    }
}
public class this_super {
    public static void main(String[] args) {
        user u1 = new user(5);
        System.out.println("Id is: "+u1.getId()); //printing the 

    }
}
/* 1️⃣ Parent constructor call
super(id);
2️⃣ Parent variable use
super.id
3️⃣ Parent method call
super.show();
*/

