package com.Prathap.CoreJava.Collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {

	public static void main(String[] args) {
		List ls = new LinkedList();
		ls.add("Dog");
		ls.add("Cat");
		ls.add(1, "Tiger");
		//Operations same as ArrayList
		//Special operations available in LinkedList
		

	}

}



//Linked list is a class which implements methods from List and Deque interfaces
/*Here elements stored in a node which have three nodes..If we used to retrieve data ,
->It will always starts from 1st node, hence it is not prefered */

//In insertion/deletion --> need not to shift every element it will create a seperate node here 
/*Most of the times we used in stack and queues.
Stack -->FILO theory
Queue -->FIFO
*/


/* Special Operations compares to ArrayList
addFisrt() 	->To add first
addLast()	
removeFist()
removeLast()
getFirst()
getLast()
*/