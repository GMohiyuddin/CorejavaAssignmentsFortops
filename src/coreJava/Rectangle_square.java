package coreJava;

class Rectangle {
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getArea() {
        return length * breadth;
    }

    public int getPerimeter() {
        return 2 * (length + breadth);
    }
}

class Square extends Rectangle {
    public Square(int side) {
        super(side, side);
    }
}


public class Rectangle_square {
	 public static void main(String[] args) {
	        Rectangle rectangle = new Rectangle(5, 10);
	        System.out.println("Area of rectangle: " + rectangle.getArea());
	        System.out.println("Perimeter of rectangle: " + rectangle.getPerimeter());

	        Square square = new Square(6);
	        System.out.println("Area of square: " + square.getArea());
	        System.out.println("Perimeter of square: " + square.getPerimeter());
	    }

}

