public class LinkedList{
	
	class Node{
		Node next;
		Node prev;
		int payload;
		public Node(int n, Node next, Node prev){
			this.payload= n;
			this.next = next;
			this.prev = prev;
		}
	}


	private Node root = null;
	private Node tail = null;

	public void insert(int n){
		if(root == null){
			root = new Node(n, null, null);
			tail = root;
			return;
		}
		Node newNode = new Node(n,root, null);
		root.prev = newNode;
		root = newNode;
	}

	public void append(int n){
		if(tail == null){
			root = new Node(n, null, null);
			tail = root;
			return;
		}
		Node newNode = new Node(n, null, tail);
		tail.next = newNode;
		tail = newNode;
	}

	public void printLL(){
		if(root == null){
		 return;
		}
		for(Node temp = root; temp != null; temp = temp.next){
			System.out.println(temp.payload);
		}
	}

}