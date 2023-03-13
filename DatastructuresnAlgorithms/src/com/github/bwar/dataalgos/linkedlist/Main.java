package com.github.bwar.dataalgos.linkedlist;

public class Main {
	
	public static void main (String args[]) {
		
		LinkedList myLL = new LinkedList(1);
		
		myLL.getHead();
		myLL.getTail();
		myLL.getLength();
		
		myLL.append(2);
		//myLL.printlist();
		
		System.out.println(myLL.removeLast());
		System.out.println(myLL.removeLast());
		System.out.println(myLL.removeLast());
	}

	
	
}
