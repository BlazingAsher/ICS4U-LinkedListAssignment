public class LLTest
{
    public static void main (String [] args)
    {
		LList coolist = new LList ();
		/*
		coolist.add (92);
		System.out.println (coolist);
		coolist.add (5);
		System.out.println (coolist);
		coolist.add (75);
		System.out.println (coolist);
		coolist.add (44);
		System.out.println (coolist);

		for(int i=0;i<4;i++){
			coolist.pop();
			System.out.println (coolist);
		}
		coolist.pop();*/
    	coolist.enqueue(92);
		System.out.println (coolist);
    	coolist.enqueue(5);
		System.out.println (coolist);
    	coolist.enqueue(75);
		System.out.println (coolist);
    	coolist.enqueue(44);
		System.out.println (coolist);

		for(int i=0;i<4;i++){
			coolist.dequeue();
			System.out.println (coolist);
		}
		System.out.println("ell");

		coolist.sortedInsert(1);
		coolist.sortedInsert(5);
		coolist.sortedInsert(3);
		coolist.sortedInsert(4);
		coolist.sortedInsert(8);
		coolist.sortedInsert(10);
		coolist.sortedInsert(6);
		coolist.sortedInsert(2);
		coolist.sortedInsert(1);
		System.out.println(coolist);
		System.out.println(coolist.reverse());
		coolist.removeDuplicates();
		System.out.println(coolist);
    }
}
