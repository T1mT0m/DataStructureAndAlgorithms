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
		
		myLL.append(1);
		myLL.append(2);
		myLL.append(3);
		myLL.append(4);
		myLL.prepend(0);
		myLL.printlist();
		myLL.getHead();
		
		myLL.removeFirst();
		myLL.printlist();
		//myLL.getHead();
		
		//System.out.println(myLL.get(3).value);
		//myLL.getHead();
		myLL.insert(2, 340);
		myLL.printlist();
		
	}

	
	
}
