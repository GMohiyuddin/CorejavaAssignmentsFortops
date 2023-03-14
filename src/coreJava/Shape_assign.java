package coreJava;
class Shape_demo{
	  
    public void printShape() {
        System.out.println("This is shape");
    }
}

class Rectangleeo extends Shape_demo {
    public void printShape() {
        System.out.println("This is rectangular shape");
    }
}

class Circle extends Shape_demo {
    public void printShape() {
        System.out.println("This is circular shape");
    }
}

class Squareeo extends Rectangleeo {
    public void printSquare() {
        System.out.println("Square is a rectangle");
    }
}
public class Shape_assign {
	public static void main(String[] args) {
        Squareeo square = new Squareeo();
        Rectangleeo  rt=new  Rectangleeo();
        rt.printShape();
        Circle cr=new Circle();
        cr.printShape();
        square.printShape();
        square.printSquare();
    } 
}
