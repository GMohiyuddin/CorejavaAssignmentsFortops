package coreJava;


abstract class Marks {
    abstract double getPercentage();
}

class A extends Marks {
    private double subject1, subject2, subject3;

    public A(double s1, double s2, double s3) {
        subject1 = s1;
        subject2 = s2;
        subject3 = s3;
    }

    public double getPercentage() {
        return (subject1 + subject2 + subject3) / 3;
    }
}

class B extends Marks {
    private double subject1, subject2, subject3, subject4;

    public B(double s1, double s2, double s3, double s4) {
        subject1 = s1;
        subject2 = s2;
        subject3 = s3;
        subject4 = s4;
    }

    public double getPercentage() {
        return (subject1 + subject2 + subject3 + subject4) / 4;
    }
}

public class Percentage_using_Abstract {
    public static void main(String[] args) {
        A studentA = new A(80, 85, 90);
        B studentB = new B(70, 75, 80, 85);

        System.out.println("Percentage of marks obtained by student A: " + studentA.getPercentage() + "%");
        System.out.println("Percentage of marks obtained by student B: " + studentB.getPercentage() + "%");
    }
}

