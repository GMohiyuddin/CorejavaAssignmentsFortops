package coreJava;

class Member {
    // Data members
    private String name;
    private int age;
    private String phoneNumber;
    private String address;
    private double salary;

    // Constructor
    
public Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    // Method to print salary
    public void printSalary() {
        System.out.println("Salary: " + salary);
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}	    

public class MemberSalary_Assign {
	public static void main(String[] args) {
		
        Member member1 = new Member("John Doe", 30, "555-5555", "123 Main St", 50000.0);
        Member member2 = new Member("Jane Smith", 25, "444-4444", "456 Elm St", 60000.0);

        member1.printSalary(); // prints "Salary: 50000.0"
        member2.printSalary(); // prints "Salary: 60000.0"
    }
}
