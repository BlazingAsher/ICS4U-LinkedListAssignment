/*
 * File: LList.java
 * Author: David Hui
 * Description: Allows a user to push, pop, enqueue, dequeue, delete from, deduplicate, and reverse a doubly-linked list.
 */
public class LList
{
    private LNode head; // Head of the list
    private LNode tail; // Tail of the list
    
    public LList (){
    	// Initialize the list with nothing
		head = null;
		tail = null;
    }

	/**
	 * Adds a node to the front of the LList
	 * @param n the value of the node to add
	 */
	public void add (int n){
		LNode tmp = new LNode (null, n, head);
		// If the head is null (empty list) also make the node the tail
		if(head == null){
			tail = tmp;
		}
		else{
			// Refer the one head to the new node
			head.setPrev(tmp);
		}
		head = tmp;
    }

	/**
	 * @see this.add()
	 * @param n the value of the node to add
	 */
	public void push(int n){
    	add(n);
	}

	/**
	 * Returns the value of the head node and removes it from the list
	 * @return the value of the head node
	 */
	public int pop(){
		// First get the value, since we'll be playing with head
    	int returnInt = head.getVal();

    	// Get the next node (will be the new head)
    	head = head.getNext();
    	if(head != null){
			head.setPrev(null);
		}
    	else{
    		// If there was no next node, also remove it from the tail
    		tail = null;
		}
    	return returnInt;
	}

	/**
	 * Adds the value to the tail of the LList
	 * @param n the value to add
	 */
	public void enqueue(int n) {
		LNode tmp = new LNode (tail, n, null);
		// Point the old tail to the new one
		if(tail != null){
			tail.setNext(tmp);
		}

		// Set the new tail
		tail = tmp;

		// If it's an empty LList, also set the head to the new node
		if(head == null){
			head = tmp;
		}
	}

	/**
	 * @see this.pop()
	 * @return the value of the head node
	 */
	public int dequeue(){
    	return pop();
	}

	/**
	 * Deletes a node from the LLNode
	 * @param node the LLNode to delete
	 */
	private void delete(LNode node) {
		// Set the next node of the previous node to the next node
    	if(node.getPrev() != null){
			node.getPrev().setNext(node.getNext());
		}
    	else{
    		// it's the head
			head = node.getNext();
		}

    	// Set the previous node of the next node to the previous node
    	if(node.getNext() != null){
			node.getNext().setPrev(node.getPrev());
		}
    	else{
    		// it's the tail
			tail = node.getPrev();
		}

	}

	/**
	 * Deletes the first occcurance from the head of a value
	 * @param n the value to delete
	 */
	public void delete(int n){
		// Find the value in the LList
		for(LNode c = head; c != null; c = c.getNext()){
			// If it matches, delete it
			if(c.getVal() == n){
				delete(c);
				break;
			}
		}
	}

	/**
	 * Deletes the LNode at the given index
	 * @param ind the index of the LNode to delete
	 */
	public void deleteAt(int ind){
    	int i = 0;
    	// Loop through the LList until we reach the index
		for(LNode c = head; c != null; c = c.getNext()){
			if(i == ind){
				delete(c);
				break;
			}
			i++;
		}
	}

	/**
	 * Inserts a value while maintaining the a sorted LList
	 * @param n the value to insert
	 */
	public void sortedInsert(int n){
		LNode prev = null;
		LNode next = null;

		// Start from the tail since we are ascending from it
		for(LNode c = tail; c != null; c = c.getPrev()) {
			// Value fits between c and the previous OR we are at the head
			if(c.getVal() <= n && (c.getPrev() == null || c.getPrev().getVal() >= n)){
				prev = c.getPrev();
				next = c;
				break;
			}
			// Value is smaller than c (will be put at tail)
			else if(c.getVal() > n){
				prev = c;
				next = null;
				break;
			}
		}

		LNode tmp = new LNode(prev, n, next);
		// If the new node will be the head, set it as so
		if(prev == null){
			head = tmp;
		}
		else {
			prev.setNext(tmp);
		}

		// If the new node will be the tail, set it as so
		if(next == null){
			tail = tmp;
		}
		else {
			next.setPrev(tmp);
		}
	}

	/**
	 * Removes all duplicates in the LList
	 */
	public void removeDuplicates() {
		// Loop through the LList
    	for(LNode c = head; c != null; c = c.getNext()){
    		// Loop though the remaining and delete any LNodes with the same value
    		for(LNode l = c.getNext(); l != null; l = l.getNext()){
    			if(c.getVal() == l.getVal()){
    				delete(l);
				}
			}
		}
	}

	/**
	 * Reverses the LList
	 */
	public void reverse() {
		LNode c = tail;
		// Store the old tail of the LList to be the head
		LNode oldTail = tail;
		LNode newPrev = null;

		while(c != null){
			/// We've reached the other side, so flip the head and tail pointers
			if(c == head){
				tail = head;
				head = oldTail;
			}
			// Get the previous node and set it as the next one now
			LNode l = c.getPrev();
			c.setNext(l);
			// Get the next node of the old previous node and set it as the previous one now
			c.setPrev(newPrev);
			newPrev = c;
			c = l;
		}
	}
	
	@Override
	public LList clone() {
		LList ret = new LList();

		// Fill the new LList with new LNodes
		for(LNode c = head; c != null; c = c.getNext()){
			int val = c.getVal();
			ret.enqueue(val);	
		}
		return ret;
	}

	/**
	 * Returns the LList as a string backwards. Courtesy of Mr. Mckenzie
	 * @return the LList as a string backwards
	 */
	public String reverseString (){
		LNode tmp = tail;
		String ans = "[";
		while (tmp != null){
			ans += tmp+", ";
			tmp = tmp.getPrev();
		}
		return ans.substring(0,ans.length()-2)+"]";
	}

	@Override
    public String toString (){
		LNode tmp = head;
		String ans = "";
		while (tmp != null){
		    ans += tmp+", ";
		    tmp = tmp.getNext ();
		}
		if(head != null){
			ans = ans.substring(0,ans.length()-2);
		}
		return "["+ans+"]";
    }
}


