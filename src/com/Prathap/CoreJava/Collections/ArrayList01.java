package com.Prathap.CoreJava.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ArrayList01 {

	public static void main(String[] args) {
		// ArrayList a = new ArrayList(); -> To store any kind of data
		// ArrayList<Integer> a = new Arrayist(); -> To store perticular data
		// List a =new ArrayList();

		List al = new ArrayList();
		al.add("Prathap");
		al.add("Shwetha");
		al.add(01);
		al.add(true);
		al.add("Barkur02");

		// Using for loop
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		// Using For each
		for (Object a : al) {
			System.out.println(a);
		}

		// using iterator

		Iterator it = al.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println(al.size()); // Size
		System.out.println(al);

		System.out.println(al.remove(2));
		System.out.println(al);

		al.add(2, 01);
		System.out.println(al);

		al.set(2, "Hello"); // To reset the data
		System.out.println(al);

		System.out.println(al.contains("Pr"));

		System.out.println(al.isEmpty());

		// To sort by using collections class
//		Collections.sort(al);
//		System.out.println(al);
		// Sort in revers order
//		Collections.sort(al, Collections.reverseOrder());
//		System.out.println(al);

		// Shuffling order
//		Collections.shuffle(al);
//		System.out.println(al);

		// In reverse order
		// Collections.shuffle(al, (Random) Collections.reverseOrder());
		
		
		//al.addAll(al)	->We used to add all elements to some other collection i,e
		// ArrayList ab = new ArrayList();
		// ab.addAll(al);
		// ab.removeall(al); -> It will remove all the elements
		
		//To convert array into arrayList
		String arr[] = {"Dog", "Cat", "Lion"};
		ArrayList a =new ArrayList(Arrays.asList(arr));
		System.out.println(a);
		
	}

}
