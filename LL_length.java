
class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;
	LinkedListNode<T> add;

	LinkedListNode(T data) {
		this.data = data;
		next = null;
	}

}

public class LL_length {
	public static void main(String[] args) {
		LinkedListNode<Integer> head = new LinkedListNode<Integer>(0);
		LinkedListNode<Integer> temp = head;
		head.next = new LinkedListNode(1);
		head.next.next = new LinkedListNode(3);
		// int c = length_itr(head);
		// System.out.println(c);
		// int co=length(head);
		// System.out.println(co);
		insertR(head, 3, 2);
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public static int length_itr(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> temp = head;
		int count = 0;
		while (temp != null) {
			temp = temp.next;
			count++;
		}
		return count;
	}

	static int a = 0;

	public static int length(LinkedListNode<Integer> head) {
		if (head.next == null) {
			return a + 1;
		}
		a++;

		return length(head.next);
	}

	static int b = 0;
	//static LinkedListNode<Integer> temp;

	public static LinkedListNode<Integer> insertR(LinkedListNode<Integer> head, int data, int pos) {

		if (pos == 0) {
			LinkedListNode<Integer> n1 = new LinkedListNode<Integer>(data);
			return n1;
		}
		if (b == pos && head.next != null && pos != 0) {
			LinkedListNode<Integer> n1 = new LinkedListNode<>(data);
			n1.next = head.next;
			head.next = n1;
			return head;
		}

		b++;
		return insertR(head.next, data, pos);
	}
}
