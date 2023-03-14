package coreJava;

public class Area_calculator_assign {

	public void calculateArea(int length, int width) {
		int  area = length * width;
		System.out.println("area of rectangle " + area);
	}
	
	public void calculateArea(int sides) {
		int area = sides * sides;
		System.out.println("area of square is " + area);
	}
	public static void main(String[] args) {
	Area_calculator_assign aca = new Area_calculator_assign();
	aca.calculateArea(10, 5);
	aca.calculateArea(20);
	}
}
