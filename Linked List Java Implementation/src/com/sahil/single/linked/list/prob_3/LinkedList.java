package com.sahil.single.linked.list.prob_3;

// Try a way out using the Recursive method.

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
	
	public void delNnodeAfterMNode(int m,int n,Node head){
		Node curr = head;
		Node temp =head;
		
		while(curr!=null){
			
			// To skip m nodes
			for(int count=1;count<m && curr!=null ; count++){
				curr=curr.next;
			}
			
			temp=curr.next;
			//To delete n nodes
			for(int count=1;count<n && temp!=null ; count++){
				temp=temp.next;
			}
			
			curr.next = temp.next;
			curr=curr.next;
			
		}
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.head 	= 	new Node(1);
		Node second = 	new Node(2);
		Node third 	= 	new Node(3);
		Node fourth	= 	new Node(4);
		Node fifth	=	new Node(5);
		Node sixth  = 	new Node(6);
		Node seventh =	new Node(7);
		Node eighth  = 	new Node(8);
		Node ninth  = 	new Node(9);
		Node tenth  = 	new Node(10);
		
		
		list.head.next	=		second;
		second.next		= 		third;
		third.next      = 		fourth;
		fourth.next 	= 		fifth;
		fifth.next 		= 		sixth;
		sixth.next 		= 		seventh;
		seventh.next 	= 		eighth;
		eighth.next 	= 		ninth;
		ninth.next 		= 		tenth;
		
		
		list.traverseLinkedList(list.head);
		System.out.println();
		list.delNnodeAfterMNode(3, 2, list.head);
		list.traverseLinkedList(list.head);
	}
}
