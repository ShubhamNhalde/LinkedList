package com.bridgelabz.linkedlist;

public class Runner {
	

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list.add(70);
		list.add(30);
		list.add(56);
		list.display();
		
		list.insertAtStart(25);
		list.display();
		
		list.pop();
		list.display();
	}

}
