class list<T> {
	T data;
	list<T> next;

	list(T data) {
		this.data = data;
		next = null;
	}
}

public class delete_LL_itr {
	public static void main(String[] args) {
		list<Integer> head = new list<>(0);
		head.next = new list<Integer>(1);
		head.next.next = new list<Integer>(2);
		head.next.next.next = new list<Integer>(3);

		deleteIthNode(head, 2);
	}

	public static list<Integer> deleteIthNode(list<Integer> head, int i) {
		list<Integer> temp = head;

		int c = 0, len = 0;
		while (temp != null) {
			temp = temp.next;
			len++;
		}
		temp = head;
		while (temp != null) {
			if(c==i-1) {
				break;
			}
			
			temp=temp.next;
			c++;
		}
		if(temp==null) {
			return head;
		}
		else if (temp.next!=null){
			temp.next=temp.next.next;
		}
		return head;
	}
}
