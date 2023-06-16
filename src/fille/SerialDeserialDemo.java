package fille;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialDeserialDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		User u1 = new User();
		u1.name = "ram";
		u1.salary = 12345;
		u1.email = "ram@gmail.com";
		u1.password = "secret";

		File f = new File("d:\\temp\\user.txt");
		f.createNewFile();

		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(u1);// only instance variable -> name salary email password
		oos.close();

		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);

		User u2 = (User) ois.readObject();
		System.out.println(u2.name);
		System.out.println(u2.email);
		System.out.println(u2.salary);
		System.out.println(u2.password);

		ois.close();
	}
}

class User implements Serializable {
	int salary;
	String name;
	String email;
	String password;
	static int game = 100;

}
