package com.compit.programming.basics.datastructure.linkedlist;

/**
 * @author: chaudharimehul
 * @date:	Jun 10, 2017
 * Reverse the linked list
 */
public class LinkedListv3 {

	public static Node ReverseList(Node head){
		if(head == null || head.next == null){
			return head;
		}
		
		Node a = head;
		Node b = null;
		Node c = null;
		Node d = null;
		
		while(true){
			b = a.next;
			
			if(b == null)
			{
				a.next = d;
				head = a;
				break;
			}
			
			c = a.next.next;
			a.next.next = a;

			a.next = d;
			
			if(c == null){
				head = b;
				break;
			}
			
			a = c;
			d = b;
		}
		
		return head;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String separator = "--------------";
		
		LinkedListv1 list1 = new LinkedListv1(); // empty list, null 
		LinkedListv1 list2 = new LinkedListv1(); // one node, 	1 --> null
		LinkedListv1 list3 = new LinkedListv1(); // two node,	1 --> 2 --> null
		LinkedListv1 list4 = new LinkedListv1(); // three node, 1 --> 2 --> 3 --> null
		LinkedListv1 list5 = new LinkedListv1(); // four node, 	1 --> 2 --> 3 --> 4 --> null
		LinkedListv1 list6 = new LinkedListv1(); // five node, 	1 --> 2 --> 3 --> 4 --> 5 -->  null

		System.out.println("List 1 traverese "); 
		list1.traverse();
		list1.setHeadNode( ReverseList(list1.getHeadNode() ) );
		list1.traverse();
		System.out.println(separator);
		
		list2.add(1);
		System.out.println("\nList 2 traverse");
		list2.traverse();
		list2.setHeadNode( ReverseList(list2.getHeadNode()) );
		list2.traverse();
		System.out.println(separator);
		
		list3.add(1);
		list3.add(2);
		System.out.println("\nList 3 traverese");
		list3.traverse();
		list3.setHeadNode( ReverseList( list3.getHeadNode() ) );
		list3.traverse();
		System.out.println(separator);
		
		list4.add(1);
		list4.add(2);
		list4.add(3);
		System.out.println("\nList 4 traverse");
		list4.traverse();
		list4.setHeadNode( ReverseList( list4.getHeadNode() ) );
		list4.traverse();
		System.out.println(separator);
		
		list5.add(1);
		list5.add(2);
		list5.add(3);
		list5.add(4);
		System.out.println("\nList 5 traverse");
		list5.traverse();
		list5.setHeadNode( ReverseList(list5.getHeadNode() ) );
		list5.traverse();
		System.out.println(separator);
		
		list6.add(1);
		list6.add(2);
		list6.add(3);
		list6.add(4);
		list6.add(5);
		System.out.println("\nList 6 traverse");
		list6.traverse();
		list6.setHeadNode( ReverseList(list6.getHeadNode()) );
		list6.traverse();
		System.out.println(separator);

	}

}
