 public class Node{
	Node next;
	Node prev;
	int payload;
	public Node(int n, Node next, Node prev){
		this.payload= n;
		this.next = next;
		this.prev = prev;
	}
}
