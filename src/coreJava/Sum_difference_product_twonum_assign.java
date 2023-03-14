package coreJava;

import java.util.Scanner;

class Complex {
    private double real, imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex() {
        this(0, 0);
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public Complex add(Complex other) {
        double realPart = this.real + other.real;
        double imaginaryPart = this.imaginary + other.imaginary;
        return new Complex(realPart, imaginaryPart);
    }

    public Complex subtract(Complex other) {
        double realPart = this.real - other.real;
        double imaginaryPart = this.imaginary - other.imaginary;
        return new Complex(realPart, imaginaryPart);
    }

    public Complex multiply(Complex other) {
        double realPart = this.real * other.real - this.imaginary * other.imaginary;
        double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(realPart, imaginaryPart);
    }

    public void print() {
        if (imaginary >= 0) {
            System.out.println(real + " + " + imaginary + "i");
        } else {
            System.out.println(real + " - " + (-imaginary) + "i");
        }
    }
}

public class Sum_difference_product_twonum_assign {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first complex number:");
        System.out.print("Real part: ");
        double real1 = input.nextDouble();
        System.out.print("Imaginary part: ");
        double imaginary1 = input.nextDouble();

        System.out.println("Enter the second complex number:");
        System.out.print("Real part: ");
        double real2 = input.nextDouble();
        System.out.print("Imaginary part: ");
        double imaginary2 = input.nextDouble();

        Complex num1 = new Complex(real1, imaginary1);
        Complex num2 = new Complex(real2, imaginary2);

        Complex sum = num1.add(num2);
        Complex difference = num1.subtract(num2);
        Complex product = num1.multiply(num2);

        System.out.println("Sum: ");
        sum.print();
        System.out.println("Difference: ");
        difference.print();
        System.out.println("Product: ");
        product.print();
    }
}
