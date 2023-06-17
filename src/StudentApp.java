import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		Student s = new Student(1, "ram", "ayodhya",1111);

		// array of object
		Student st[] = new Student[5];

		for (int i = 0; i < 2; i++) {
			System.out.println("Enter id name and city");
			int studentId = scr.nextInt();
			String name = scr.next();
			String city = scr.next();
			st[i] = new Student(studentId, name, city,2000); //NullPointerException 

		}

		for (int i = 0; i < 2; i++) {
 			System.out.println(st[i].getStudentId() + " " + st[i].getName());

		}

	}
}

class Student {
	private int studentId;
	private String name;
	String city;
	int fees; 
	public Student(int studentId, String name, String city,int fees) {
		this.studentId = studentId;
		this.name = name;
		this.city = city;
		this.fees=fees; 

	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	
	
}
