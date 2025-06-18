package Javalearning;

class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("writing");
    }

    public void printcolor(){
        System.out.println(this.color);
    }
}
class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(){
        System.out.println("constructor called");
    }
}
class Blote{

}
public class first {
    public static void main(String[] args) {

        Pen p1 = new Pen();
        p1.color = "Gel";
        p1.type = "hard";

        Pen p2 = new Pen();
        p2.color = "ball";
        p2.type = "soft";

        p1.write();
        System.out.println(p1.color);
        System.out.println(p2.color);

        p1.printcolor();
        p2.printcolor();

        Student s1 = new Student();
        s1.name = "abz";
        s1.age = 34;

        s1.printInfo();
    }
}
