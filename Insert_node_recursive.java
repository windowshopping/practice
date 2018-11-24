/*class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	LinkedListNode(T data) {
		this.data = data;
		next = null;
	}
}

public class Insert_node_recursive {
	public static void main(String[] args) {
		LinkedListNode<Integer> head = new LinkedListNode<>(0);
		head.next = new LinkedListNode<Integer>(1);
		head.next.next = new LinkedListNode<Integer>(2);
		head.next.next.next = new LinkedListNode<Integer>(3);
		
		insertR(head, 3, 0);
	}
	public static LinkedListNode<Integer> insertR(LinkedListNode<Integer> head, int data, int pos){
		if(head==null) {
			return head;
		}
		else {
			int len=leng(head);
			if(pos==0) {
				
			}else if(pos>0&&pos<len) {
				
			}else if(pos==len) {
				
			}
		}
		return head;
	}
	private static int leng(LinkedListNode<Integer> head) {
		int len=0;
		LinkedListNode<Integer> Temp=head;
		while(Temp.next!=null) {
			len++;
			Temp=Temp.next;
		}
		return len;
	}
}*/
