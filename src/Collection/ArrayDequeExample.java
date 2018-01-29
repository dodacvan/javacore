package Collection;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeExample {
	public static void main(String[] args) {
		ArrayDeque<String> aq = new ArrayDeque<String>();
		aq.add("A");
		aq.add("C");
		aq.add("B");

		// add - them vao cuoi
		// addFirst them vao phia dau
		aq.addFirst("C");

		// addLast

		// clone
		ArrayDeque<String> copy = aq.clone();

		// contains same collection

		// descendingIterator dao nguoc thu tu
		Iterator<String> it = copy.descendingIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// element lay element nhung ko remove o phia dau
		String elementValue = copy.element();
		System.out.println(elementValue);
		// result C

		// element tuong tu getFirst va peek() peekFirst()( not throw
		// Exception), element() and
		// peek() la tu Queue thực hiện ở 1 đầu, còn getFirst() và peekFirst()
		// là của DeQueue thực hiện ở hai đầu.

		// tuong tự có getLast, peekLast

		// offer
		copy.offer("Z");
		System.out.println(copy);
		// offerFirst() and offerLast

		// poll lấy và remove phía đầu , pollFirst() và pollLast()

		// pop tuong tu pull nhưng nó throws exception
		String popValue = copy.pop();
		System.out.println(popValue);

		// push tuong tu add nhưng khác giá trị trả về, thêm vào đầu
		copy.push("V");
		System.out.println(copy);
	}
}
