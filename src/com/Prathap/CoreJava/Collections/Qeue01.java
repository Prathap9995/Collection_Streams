package com.Prathap.CoreJava.Collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Qeue01 {

	public static void main(String[] args) {
		PriorityQueue q = new PriorityQueue();
		q.add("A");
		q.add("A");
		q.add("b");
		q.add("c");
		q.offer("e");
		System.out.println(q);
	//To get head element[ready to process]	
	System.out.println(q.element());
	System.out.println(q.peek());
	
	//To return and remove the header element
	System.out.println(q.remove());
	System.out.println(q);
	System.out.println(q.poll());
	System.out.println(q);
	
	//By using iterator
	
	Iterator it = q.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	//We can use for each loop also
	
	
	
		

	}

}

//If we want refer a group of elements prior to processing then we go for Queue
//It follows FIFO concept
//Only homogeneous data can be stored
// By using add() and offer() :- We can add object to queue -> Add will throws exception and offer will return null
// Element() and peek() :- Used to return the elements which are ready to process--> Element throws exceptions and peek is null
// remove() and poll() :- used to remove the elements --> remove throws exceptions and poll throws null
//Queue Interface Child interfaces are :-
/* 1. Dequeue
 * 2. Blocking Queue
 * 3. Blocking dequeues
 */

//Queue Interface classes are :-
//1. Priority Queue :- Homogeneous data only
//2. LinkedList		:- Heterogeneous data