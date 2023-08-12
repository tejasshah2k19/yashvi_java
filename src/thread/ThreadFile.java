package thread;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ThreadFile {

	public static void main(String[] args) throws Exception {
		File f = new File("C:\\Users\\tejas\\Downloads\\ril.csv");

		FileReader fr = new FileReader(f); // read character
		BufferedReader br = new BufferedReader(fr); // read entire line

		while (true) {
			String data = br.readLine();
			if (data == null) {
				break;
			}
			//System.out.println(data);
			String x[] = data.split(",");//0:date 1:EQ {date nd close price }
			System.out.println(x[0]);
		}
		br.close();

	}
}
