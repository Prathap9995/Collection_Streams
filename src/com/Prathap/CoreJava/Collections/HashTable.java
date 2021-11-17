package com.Prathap.CoreJava.Collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTable {

	public static void main(String[] args) {
		Hashtable<Integer, String> hm = new Hashtable();
		hm.put(101, "Prathap");
		hm.put(102, "Shwetha");
		hm.put(103, "Barkur");
		hm.put(103, "Udupi");  
		hm.put(104, "Karnataka");
		hm.put(105, "Prathap");
		
	
//Same methods are applied as HashMap

Set s = hm.entrySet();

for (Map.Entry k: hm.entrySet()) {
	System.out.println(k.getKey());
	System.out.println(k.getValue());
	System.out.println(k);
}
//Iterator it =s.iterator();
//while(it.hasNext()) {
//	System.out.println(it.next());
//
//}


}}


//The difference btn HashMap & HashTable is :-
/* 
 * HashMap is not synchronized and not thread safe but HashTable is thread safe
 * HashTable does not allows null values&Keys
 */