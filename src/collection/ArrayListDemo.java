package collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		// array -> collection of same type of data
		// index 0 end size -1
		// access index
		// static -> 5 { 0 1 2 3 4 }
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(200);
		list.add(400);

		System.out.println(list);

		// take 3 numbers from user and add into list

		Integer g = list.get(0);
		System.out.println(g);
		System.out.println(list.get(1));

		System.out.println("elements in array list");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));// 0 1 2
		}

		// find the sum of all the values in list

		// find the min and max values from list

		// search x is in list or not

		// sort your list -> bubble / selection sort

		// remove
		System.out.println("Remove");
		System.out.println(list);
		list.remove(0); // 12
		System.out.println(list);

		//contains -> inside list or not 
		
		System.out.println(list.contains(12)); // search 12 in list if present you get true else false 
		
		
		
		
	}
}
