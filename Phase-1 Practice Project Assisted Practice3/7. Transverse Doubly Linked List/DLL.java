import java.util.Iterator;
import java.util.LinkedList;

public class DLL {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();

		// adding elements to linked list
		linkedList.add("Horse");
		linkedList.add("Dog");
		linkedList.add("Cat");
		linkedList.add("Giraffe");
		linkedList.add("Cow");

		// getting an iterator which points at the
		// end of the linkedlist
		Iterator iterator = linkedList.descendingIterator();
		Iterator it = linkedList.iterator();

		// Inside the while loop we check if the next element
		// exists or not if the next element exists then we print
		// the next element and move to it otherwise we come out
		// of the loop

		// hasNext() method return boolean value
		// It returns true when the next element
		// exists otherwise returns false
		System.out.println("Elements in forward direction: ");
		while (it.hasNext()) {

			// next() return the next element in the iteration
			System.out.print(it.next()+" "+ "\n");
		}

		// traversing the linkedlist
		// hasNext() will tell if previous element is
		// available or not
		// next() with descending iterator will return the
		// previous element
		// and after getting the previous element
		// is moves the cursor to next previous element.
		System.out.println("Elements in backward direction: ");
		while (iterator.hasNext()) {
			System.out.print(iterator.next() +" "+"\n");
		}
	}
}