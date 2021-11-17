package com.Prathap.CoreJava.Collections;

import java.util.HashSet;

public class HashSet01 {

	public static void main(String[] args) {
	//	HashSet sh = new HashSet(100, (float) 0.75); --> ).75 is a load factor and capacity value
		//Default capacity is 16
  HashSet hs = new HashSet();
  hs.add("Doggy");
  hs.add("Cat");
  hs.add("Tiger");
  hs.add("sd");
  hs.add(10);
  hs.add(true);
  //Methods are same arrayList...except index 
  //Sorting and shuffling is not possible as index concept not allowed
  for(Object e : hs) {
	  System.out.println(e);
  }
  //By using iterator also
  
  //addAll		--> Union				--> removes duplicate and unique value
  //retainAll 	--> Intersection 		--> Print common elements
  //removeAll 	--> Difference		 	--> Deletes all the elements and gives diffence value
  //containsAll	--> Subset				---> Gives subset of set1
	}

}


/*Elements arragend in random order hence index not allowed
 * Stored in hashcode format
 * Heterogeneous data stored
 * Duplicates not allowed
 * Nulls supported*/

//Load factor --> Whenever it fills 75% with elements then it will creates new node 


//In LnkedHashSet --> Here insertion order is preserved