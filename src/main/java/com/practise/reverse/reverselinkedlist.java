package com.practise.reverse;



public class reverselinkedlist {

	
	public void display(ListNode head) {
		if(head == null) {
			return;
		}
		ListNode current = head;
		while(current != null) {
			System.out.print(current.data + " -----> ");
			current = current.next;
		}
		System.out.println(current);
		
	}
	
	public ListNode insertAtBeginning (ListNode head, int data) {
		ListNode newNode = new ListNode(data);
		if(head == null) {
			return newNode;
		}
		newNode.next = head;
		head = newNode;
		return head;
	}
	
	public int length(ListNode head) {
		if(head == null) {
			return 0;
		}
		int count =0;
		ListNode current = head;
		while(current != null) {
			count ++;
			current = current.next;
			
		}
		return count;
	}
	
	private static class ListNode{
		
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public ListNode reverse(ListNode head) {
		if(head == null) {
			return head;
		}
		
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;
		
		while(current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}
	
	public static void main(String[] args) {
		
		ListNode head = new ListNode(55);
		ListNode second = new ListNode(18);
		ListNode third = new ListNode(20);
		ListNode fourth = new ListNode(35);
		
		head.next = second;
		second.next = third;
		third.next = fourth;
		
		System.out.println("The linked list elements are: ");
		reverselinkedlist rev = new reverselinkedlist();
		rev.display(head);
		
		//System.out.println("the length of a linkedlist is " + rev.length(head));
		
//		ListNode newHead = rev.insertAtBeginning(head, 15);
//		rev.dispaly(newHead);
		
		System.out.println("The reverse of a linked list is: ");
		ListNode reverseList = rev.reverse(head);
		rev.display(reverseList);
	}

}
