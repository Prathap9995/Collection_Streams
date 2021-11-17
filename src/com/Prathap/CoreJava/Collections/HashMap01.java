package com.Prathap.CoreJava.Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

public class HashMap01 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap();
		hm.put(101, "Prathap");
		hm.put(102, "Shwetha");
		hm.put(103, "Barkur");
		hm.put(103, "Udupi");   //--> With same key it will update with new value---> Key should be unique
		hm.put(104, "Karnataka");
		hm.put(105, "Prathap");
		System.out.println(hm);
		
	System.out.println(hm.get(103));
	System.out.println(hm.keySet());
	for(Object i : hm.keySet()) {
		System.out.println(i);
	}
	
	
	System.out.println(hm.values());
	for(Object m : hm.values()) {
		System.out.println(m);
	}
	
	System.out.println(hm.remove(103));
	System.out.println(hm);
		
	System.out.println(hm.containsKey(107));
	System.out.println(hm.containsValue("Barkur"));
	
	//Using Entry Interface methods
	System.out.println("**********************************");
	Set s = hm.entrySet();
	System.out.println(s);
	for(Map.Entry k : hm.entrySet()) {   //The type of variable should be Map.Entry
		System.out.println(k);
		System.out.println(k.getKey());
		System.out.println(k.getValue());
		
	}
	//Using Iterator also we can do that
	
	

	}

}


//Map interface is a independent interface which is not derived from collection. Map is a collection of entry
//Two classes are
//1. HashMap
//2. HashTable

/* If we want store data in key value pair then we can go for Map
 * We can have multiple null value and only one null key
 * Key must be unique
 * value can be duplicate
 * Entry --> Comination of key and Value
 * isEmpty() --> check for empty or not
 * clear() --> To clear all */

//keySet()		-> Return all the keys as a set[key object]
//values()		-> return all the values
//entrySet()	-> Returns each entry from the hashmap.
 
//HashMap :- Whenever we have search operation we can go for HashMap
/* Underlying data structure is HashTable 
 * Insertion order is not preserved*/

//Some of the methods:-
/* put() :- To add the data
 * get(key) :- To get the value of particular key
 * addAll() :- To add data to another collection
 * containsKey() :- To check for key returns true/false
 * containsValue() :- To check for value returns true/false
 * m.removr(key) :- To remove the value of particular key
 */
 

//Map contains multiple entries
//Every entry we can represents by "Entry Interface"
/* Entry Interface is subInterface of HashMap :- Some methods are only work in entry set
 * getKey()
 * getValue()
 * setValue()	-> Update the value*/
 