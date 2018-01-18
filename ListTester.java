package com.assignmentsjavaoop;


public class ListTester {
	
	public static void main(String[] args) {
		
	SinglyLinkedList list = new SinglyLinkedList();
	list.add(10);
    list.add(15);
    list.add(20);
    list.add(25);

    list.removeAt(1);
    list.printValues();
}
}
