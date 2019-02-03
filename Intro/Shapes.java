abstract class Figure{
    double dim1;
    double dim2;
    Figure(double d1, double d2){
        dim1 = d1;
        dim2 = d2;
    }
    abstract double calcArea();
}

class Rectangle extends Figure{
    Rectangle(double d1, double d2){
        super(d1, d2);
    }  
    double calcArea(){ 
        System.out.println("Inside Area For Rectangle.");      
        return dim1 * dim2;
    }
}

class Triangle extends Figure{
    Triangle(double d1, double d2){
        super(d1, d2);
    }
    double calcArea(){
        System.out.println("Inside Area for a Triangle.");
        return 0.5*dim1 * dim2;
    }
}

class Shapes{
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(20, 40);
        Triangle tri = new Triangle(30, 70);
        System.out.println("The area for a rectangle: " + rect.calcArea());
        System.out.println("The area for a rectangle: " + tri.calcArea());
    }
}

