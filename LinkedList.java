package com.bridgelabz.linkedlist;

public class LinkedList {
	
	public Node head;
	public Node tail;

	// Adding new Node with values
	public void add(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}
	
	public void insertAtStart(int data) {
		
		Node newNode = new Node(data);
		
		newNode.next  = head;
		head = newNode;

		while (newNode != null) {
			System.out.println("After Adding element at first then the LinkedList is :");
		return;
		}
		
		 	
	}

	// Display the Node with value
	public void display() {
		Node current = head;
		if (head == null) {
			System.out.println("List is empty");
		}
		while (current != null) {
			System.out.println(current.data + " ");
			current = current.next;
		}
	}

	// Deleting the LastNode with Value
	public void pop() {

		// Checks if the list is empty
		if (head == null) {
			System.out.println("List is empty");
			return;
		} else {
			if (head != tail) {
				Node current = head;
				while (current.next != tail) {
					current = current.next;
				}
				tail = current;
				tail.next = null;
				System.out.println("After Delete the last element then the LinkedList is : ");
			} else {
				head = tail = null;
			}
		}
	}


}
