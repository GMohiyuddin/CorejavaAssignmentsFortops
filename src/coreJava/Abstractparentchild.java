package coreJava;
abstract class parent{
	public abstract void massage ();
}

class Firstsubclass extends parent{
	public void massage() {
		System.out.println("this is first sub class");
	}
	
}

class Secondsubclass extends parent {
	public void massage () {
		System.out.println("this is second sub class");
	}
}

public class Abstractparentchild {
	public static void main(String[] args) {
		parent obj1 = new Firstsubclass ();
		parent obj2 = new Secondsubclass ();
		
		obj1.massage();
		obj2.massage();
	}
}
