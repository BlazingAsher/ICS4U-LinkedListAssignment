public class LNode
{
    private int val;
    private LNode next;
    private LNode prev;
    
    public LNode (LNode prev, int n, LNode nxt){
        this.prev = prev;
		val = n;
		next = nxt;
    }


    public int getVal (){
		return val;
    }
    public void setNum (int v){
		val = v;
    }
    public LNode getNext (){
		return next;
    }
    public void setNext (LNode n){
		next = n;
    }
    public LNode getPrev() {
        return prev;
    }
    public void setPrev(LNode prev) {
        this.prev = prev;
    }

    public String address (){
		return ""+hashCode();
    }
    
    public String toString (){
    	String ans = ""+val;
    	if(next==null){
    		ans += ": null";
    	}
    	else{
    		ans += ": @"+next.address();
    	}
		return "<" + ans + ">";
    }

}
