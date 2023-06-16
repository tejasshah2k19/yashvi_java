package yashvi_java_23;

public class StringDemo {

	public static void main(String[] args) {
		String s =new String("royal");
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.charAt(2));

	
		String s1 = "royal";
		String s2 = "Royal";
		
		System.out.println(s1.equals(s2));//false 
		System.out.println(s1.equalsIgnoreCase(s2));//true 
		
		System.out.println(s1.indexOf('l')); // 4  0:r 1:o 2:y 3:a 4:l 
		System.out.println(s1.indexOf('z')); // 4  0:r 1:o 2:y 3:a 4:l 
		
		System.out.println(s1.startsWith("ro"));//true 
		System.out.println(s1.endsWith("ro"));//false
		
		//take 1 email from user -> String
		//now validate that email 
		//it must be valid gmail account 
		
		
	}
}
