package com.github.bwar.dataalgos.linkedlist;

public class LinkedList {
	
	private Node head;
	private Node tail;
	private int length;
	
	public LinkedList(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}
	
	class Node{
		int value;
		Node next;
		
		Node(int value){
			this.value = value;
		}
		
	}
	
	public void printlist() {
		Node temp = head;
		while (temp !=null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}
	
	public void getHead() {
		System.out.println("Head value= "+head.value);
	}
	
	public void getTail() {
		System.out.println("tail value= "+tail.value);
	}
	
	public void getLength() {
		System.out.println("Length value= "+length);
	}
	
	public void append(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		}else {
			tail.next = newNode;
			tail = newNode;			
		}
		length++;
		
	}
	
	public Node removeLast() {
	
	 // when linkedList does not contain any node
	 if (length == 0) return null;
	 
	 // when linkedList contains more than one element
	 Node temp = head;
	 Node pre = head;
	 while(temp.next != null) {
		 pre = temp;
		 temp = temp.next;
	 }
	 tail = pre;
	 tail.next = null;
	 length--;
	 
	 //when the linkedList has one node
	 if (length == 0) {
		 head = null;
		 tail = null;
	 }
	 
	 return temp;
	}
	
	


}
