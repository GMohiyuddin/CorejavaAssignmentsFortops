package coreJava;
class Parent1 {
	  public void printMessage() {
	    System.out.println("This is a parent class");
	  }
	}

class Child extends Parent1 {
	  public void printMessage() {
	    System.out.println("This is a child class");
	  }
	}


public class Parent_child_subclass {
	public static void main(String[] args) {
	    Parent1 parent = new Parent1();
	    Child child = new Child();
	    
	    

	    // calling method of parent class by object of parent class
	    parent.printMessage();

	    // calling method of child class by object of child class
	    child.printMessage();

	    // calling method of parent class by object of child class
	    Parent1 childAsParent = new Child();
	    childAsParent.printMessage();
	  }
}

