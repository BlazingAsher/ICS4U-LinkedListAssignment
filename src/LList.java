public class LList
{
    private LNode head;
    private LNode tail;
    
    public LList (){
		head = null;
    }
	
    public void add (int n){
		LNode tmp = new LNode (null, n, head);
		if(head == null){
			tail = tmp;
		}
		else{
			head.setPrev(tmp);
		}
		head = tmp;
    }

    public void push(int n){
    	add(n);
	}

	public int pop(){
    	int returnInt = head.getVal();
    	head = head.getNext();
    	if(head != null){
			head.setPrev(null);
		}
    	else{
    		head = null;
    		tail = null;
		}
    	return returnInt;
	}

	public void enqueue(int n) {
		LNode tmp = new LNode (tail, n, null);
		if(tail != null){
			tail.setNext(tmp);
		}
		tail = tmp;
		if(head == null){
			head = tmp;
		}
	}

	public int dequeue(){
    	return pop();
	}

	public void delete(LNode node) {
    	if(node.getPrev() != null){
			node.getPrev().setNext(node.getNext());
		}
    	else{
    		// it's the head
			head = node.getNext();
		}

    	if(node.getNext() != null){
			node.getNext().setPrev(node.getPrev());
		}
    	else{
    		// it's the tail
			tail = node.getPrev();
		}

	}

	public void delete(int n){
		for(LNode c = head; c != null; c = c.getNext()){
			if(c.getVal() == n){
				delete(c);
				break;
			}
		}
	}

	public void deleteAt(int ind){
    	int i = 0;
		for(LNode c = head; c != null; c = c.getNext()){
			if(i == ind){
				delete(c);
				break;
			}
			i++;
		}
	}

	public void sortedInsert(int n){
    	// need to handle add at head
		// add at tail
		LNode prev = null;
		LNode next = null;

		for(LNode c = head; c != null; c = c.getNext()){
			if(c.getVal() <= n && (c.getNext() == null || c.getNext().getVal() >= n)){
				// insert into the list
				prev = c;
				next = c.getNext();
				break;
			}
		}

		LNode tmp = new LNode(prev, n, next);
    	if(prev == null){
    		head = tmp;
		}
    	else{
    		prev.setNext(tmp);
		}

    	if(next == null){
    		tail = tmp;
		}
    	else{
    		next.setPrev(tmp);
		}
		System.out.println("insert");
	}

	public void removeDuplicates() {
    	for(LNode c = head; c != null; c = c.getNext()){
    		for(LNode l = c.getNext(); l != null; l = l.getNext()){
    			if(c.getVal() == l.getVal()){
    				delete(l);
				}
			}
		}
	}
	
	public void reverse() {
		LNode c = tail;
		LNode oldTail = tail;
		LNode oldPrev = null;
		while(c != null){
			System.out.println(c);
			if(c == head){
				tail = head;
				head = oldTail;
			}
			LNode l = c.getPrev();
			c.setNext(l);
			c.setPrev(oldPrev);
			if(l != null){
				oldPrev = l.getPrev();
			}
			c = l;
		}
	}
	
	@Override
	public LList clone() {
		LList ret = new LList();
		for(LNode c = head; c != null; c = c.getNext()){
			int val = c.getVal();
			ret.enqueue(val);	
		}
		return ret;
	}

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


