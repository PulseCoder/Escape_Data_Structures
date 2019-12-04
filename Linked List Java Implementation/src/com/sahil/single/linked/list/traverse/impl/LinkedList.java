package com.sahil.single.linked.list.traverse.impl;

class Node{
	int value;
	Node next;
	
	public Node(int value) {
		this.value = value;
		this.next = null;
	}
}

public class LinkedList {

	Node head;
	
	public LinkedList() {
		this.head = null;
	}
	
	public void traverseLinkedList(Node head){
		while(head!=null){
			System.out.print(head.value+",");
			head = head.next;
		}
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.head 	= 	new Node(1);
		Node second = 	new Node(2);
		Node third 	= 	new Node(3);
		Node fourth	= 	new Node(4);
		Node fifth	=	new Node(5);
		
		list.head.next	=	second;
		second.next		= third;
		third.next     = fourth;
		fourth.next 	= fifth;
		
		list.traverseLinkedList(list.head);
		
	}
}
