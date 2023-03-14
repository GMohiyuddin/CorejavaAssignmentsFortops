package coreJava;

class AgeNotWithinRangeException extends Exception {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AgeNotWithinRangeException(String message) {
	     super(message);
	 }
	}

	//NameNotValidException class
	class NameNotValidException extends Exception {
	 /**
		 * 
		 */
		private static final long serialVersionUID = 6725949746978155305L;

	public NameNotValidException(String message) {
	     super(message);
	 }
	}

   	class Student {
	 private int rollNo;
	 private String name;
	 private int age;
	 private String course;

	 public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
	     if(age < 15 || age > 21) {
	         throw new AgeNotWithinRangeException("Age is not within the valid range (15-21)");
	     }

	     if(name.matches(".*\\d.*") || !name.matches("[a-zA-Z ]+")) {
	         throw new NameNotValidException("Name contains numbers or special symbols");
	     }

	     this.rollNo = rollNo;
	     this.name = name;
	     this.age = age;
	     this.course = course;
	 }

	 public int getRollNo() {
	     return rollNo;
	 }

	 public String getName() {
	     return name;
	 }

	 public int getAge() {
	     return age;
	 }

	 public String getCourse() {
	     return course;
	 }
	}

	//Driver class
	public class Name_not_valid_exception {
	 public static void main(String[] args) {
	     try {
	         Student student = new Student(1, "John Doe", 22, "Engineering");
	         System.out.println("Student details: ");
	         System.out.println("Roll No: " + student.getRollNo());
	         System.out.println("Name: " + student.getName());
	         System.out.println("Age: " + student.getAge());
	         System.out.println("Course: " + student.getCourse());
	     } catch (AgeNotWithinRangeException e) {
	         System.out.println("Error: " + e.getMessage());
	     } catch (NameNotValidException e) {
	         System.out.println("Error: " + e.getMessage());
	     }
	 }
	}
