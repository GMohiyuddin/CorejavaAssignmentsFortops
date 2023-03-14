package coreJava;

abstract class shapearea{
	abstract void recarea (int length , int width);
	abstract void squarearea (int sides);
	abstract void circlearea (int radius); 
}

class area extends shapearea{
	void recarea (int length , int width) {
		int area = length * width;
		System.out.println("Area of Rectangle is " + area);
	}
	void squarearea (int sides) {
		int area = sides*sides;
		System.out.println("Area of square is " + area);
	}
	void circlearea (int radius) {
		double area = Math.PI * radius * radius ;
		System.out.println("Area of circle is "+ area);
	}
}


public class abstract_area_triangle_rectangle_assign {
	public static void main(String[] args) {
		area area = new area();
		area.recarea(5, 10);
		area.squarearea(2);
		area.circlearea(20);
	}
}
