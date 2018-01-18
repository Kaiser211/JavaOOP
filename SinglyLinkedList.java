package com.assignmentsjavaoop;

public class SinglyLinkedList {
	private Node head;
	
	public SinglyLinkedList() {
		this.head = null;
		
	}
	
    public Node add(int value){
     if(this.head == null) {
    		this.head = new Node(value);
    		return this.head;
    	}
     Node pointer = this.head;
     while(pointer.next != null) {
    	 pointer = pointer.next;
     }
     pointer.next = new Node(value);
    	 return this.head;
   	
    }
	public Node  remove() {
		Node pointer = this.head;
		while(pointer.next.next !=null) {
			pointer = pointer.next;
			
		}	
		pointer.next= null;
		return this.head;
		
		
	}
	 public Node removeAt(int n){
	        Node pointer = this.head;
	        Node temp = null;
	        int counter  = 0;

	        while(pointer.next != null){
	            if(counter == n){
	                temp.next = temp.next.next;
	                break;
	            }

	            temp = pointer;
	            pointer = pointer.next;
	            counter++;
	        }
	        return this.head;
	    }
	public void printValues() {
		Node pointer = this.head;
		while(pointer !=null) {
			System.out.println(pointer.value);
			pointer = pointer.next;
		}
		
	}
}