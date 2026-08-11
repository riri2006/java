 public class Shape{
    public void findarea(){
        System.out.println("Area of shape...");
    }
}
 class Circle extends Shape{
    public void findarea(){
        int radius =10;
        System.out.println("Area of circle:"+ 3.14*radius*radius );
    }
}
class Rectangle extends Shape{
    public void findarea(){
        int length = 10;
        int breadth = 5;
        System.out.println("Area of rectangle:"+ length*breadth);
    }
}
class Triangle extends Shape{
    public void findarea(){
        int base = 10;
        int height = 5;
        System.out.println("Area of triangle:"+ 0.5*base*height);
    }
}

class Main{
    public static void main(String[] args) {
        Shape s = new Shape();
        s.findarea();
        Circle c = new Circle();
        c.findarea();
        Rectangle r = new Rectangle();
        r.findarea();
        Triangle t = new Triangle();
        t.findarea();
    }
}



