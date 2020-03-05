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
		/*
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
*/

//		coolist.sortedInsert(1);
//		coolist.sortedInsert(5);
//		coolist.sortedInsert(3);
//		coolist.sortedInsert(4);
//		coolist.sortedInsert(8);
//		coolist.sortedInsert(10);
//		coolist.sortedInsert(6);
//		coolist.sortedInsert(2);
//		coolist.sortedInsert(1);


//		coolist.sortedInsert(1);
//		coolist.sortedInsert(2);
//		coolist.sortedInsert(3);
//		coolist.sortedInsert(4);
//		coolist.sortedInsert(5);
//		coolist.sortedInsert(6);
//		coolist.sortedInsert(7);
//		coolist.sortedInsert(8);
//		coolist.sortedInsert(9);

//		coolist.sortedInsert(9);
//		coolist.sortedInsert(8);
//		coolist.sortedInsert(7);
//		coolist.sortedInsert(6);
//		coolist.sortedInsert(5);
//		coolist.sortedInsert(4);
//		coolist.sortedInsert(3);
//		coolist.sortedInsert(2);
//		coolist.sortedInsert(1);




//		coolist.sortedInsert(5);
//		coolist.sortedInsert(3);
//		coolist.sortedInsert(1);
//		coolist.sortedInsert(2);
//		coolist.sortedInsert(7);
//		coolist.sortedInsert(6);
//		coolist.sortedInsert(8);
//		coolist.sortedInsert(9);
//		coolist.sortedInsert(4);



//		coolist.sortedInsert(4);
//		coolist.sortedInsert(4);
//		coolist.sortedInsert(4);
//		coolist.sortedInsert(4);
//		coolist.sortedInsert(4);
//		coolist.sortedInsert(4);
//		coolist.sortedInsert(4);
//		coolist.sortedInsert(4);
//
//		coolist.sortedInsert(5);
//		coolist.sortedInsert(5);
//		coolist.sortedInsert(5);
//		coolist.sortedInsert(5);
//		coolist.sortedInsert(5);
//		coolist.sortedInsert(5);
//		coolist.sortedInsert(5);
//		coolist.sortedInsert(5);
//
//		coolist.sortedInsert(10);
//		coolist.sortedInsert(10);
//		coolist.sortedInsert(10);
//		coolist.sortedInsert(10);
//		coolist.sortedInsert(10);
//		coolist.sortedInsert(10);
//		coolist.sortedInsert(10);
//		coolist.sortedInsert(10);
		
//
//		coolist.push(3);
//		coolist.push(6);
//		coolist.push(1);
//		coolist.push(5);
//
//		coolist.pop();
//		coolist.pop();
//		coolist.pop();
//		coolist.pop();

//		coolist.enqueue(3);
//		coolist.enqueue(6);
//		coolist.enqueue(1);
//		coolist.enqueue(5);
//
//
//		coolist.dequeue();
//		coolist.dequeue();
//		coolist.dequeue();
//		coolist.dequeue();


//		coolist.push(3);
//		coolist.push(6);
//		coolist.push(1);
//		coolist.push(5);
//
//		coolist.delete(3);
//		coolist.delete(6);
//		coolist.delete(1);
//		coolist.delete(5);
		coolist.push(1);

		System.out.println("Orig:");
		System.out.println(coolist);
		System.out.println(coolist.reverseString());

		coolist.removeDuplicates();
		System.out.println("Rem dup");
		System.out.println(coolist);
		System.out.println(coolist.reverseString());

		LList g = coolist.clone();
		System.out.println("clone");
		System.out.println(g);
		System.out.println(g.reverseString());

		coolist.reverse();
		System.out.println("rev");
		System.out.println(coolist);
		System.out.println(coolist.reverseString());
		/*
		coolist.reverse();
		coolist.removeDuplicates();
		coolist.add(1);
		coolist.add(1);
		coolist.add(1);
		coolist.add(1);
		coolist.add(1);
		coolist.add(1);
		coolist.add(1);
		coolist.add(1);
		coolist.add(1);
		coolist.add(1);
		coolist.add(1);
		coolist.add(1);
		coolist.add(1);
		coolist.add(1);
		coolist.add(1);
		coolist.add(1);
		coolist.add(1);
		coolist.add(1);
		coolist.add(1);
		coolist.add(1);
		coolist.add(1);
		coolist.add(1);
		coolist.add(1);
		coolist.add(1);
		coolist.add(1);
		coolist.add(1);
		coolist.removeDuplicates();
		coolist.pop();
		coolist.add(1);
		coolist.removeDuplicates();
		System.out.println(coolist);*/
		/*
		coolist.add(1);
		coolist.add(4);
		coolist.add(3);
		coolist.add(5);
		coolist.add(2);
		coolist.add(17);
		coolist.add(1);
		coolist.add(4);
		coolist.add(3);
		coolist.add(5);
		coolist.add(2);
		coolist.add(17);
		coolist.add(1);
		coolist.add(4);
		coolist.add(3);
		coolist.add(5);
		coolist.add(2);
		coolist.add(17);
		coolist.add(1);
		coolist.add(4);
		coolist.add(3);
		coolist.add(5);
		coolist.add(2);
		coolist.add(17);
		coolist.add(1);
		coolist.add(4);
		coolist.add(3);
		coolist.add(5);
		coolist.add(2);
		coolist.add(17);
		System.out.println(coolist);
		coolist.removeDuplicates();
		System.out.println(coolist);*/
    }
}
