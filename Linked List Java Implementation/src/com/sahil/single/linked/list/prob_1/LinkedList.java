package com.sahil.single.linked.list.prob_1;

//https://www.geeksforgeeks.org/reverse-a-linked-list/

import java.util.Stack;

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
	
	public Stack<Integer> storeLinkedListInStack(Stack<Integer> stk,Node head) {
		while(head!=null) {
			stk.push(head.value);
			head = head.next;
		}
		return stk;
	}
	
	public void reverseLinkedList(Stack<Integer> res,Node head) {
		while(head!=null) {
			head.value = res.pop();
			head= head.next;
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
		System.out.println();
		Stack<Integer> stk = new Stack<Integer>();
		Stack<Integer> result = list.storeLinkedListInStack(stk,list.head);
		
		list.reverseLinkedList(result,list.head);
		list.traverseLinkedList(list.head);
	}
}
