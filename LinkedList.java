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

	public void removeDups(){
		if(root == null){
			return;
		}
		for(Node temp = root; temp != null; temp = temp.next){
			for(Node temp2 = temp.next; temp2 != null;){
				Node nextNode = temp2.next;
				if(temp.payload == temp2.payload){
					temp2.prev.next = temp2.next;
					if(temp2.next != null){
						temp2.next.prev = temp2.prev;
					}
					temp2.prev = null;
					temp2.next = null;
				}
				temp2 = nextNode;
			} 
		}

	}

	public int kthToLst(int k){
		if(root == null){
			throw new RuntimeException("LinkedList is empty");
		}
		Node first = root;
		Node second = root;
		for(int i = 0; i < k; i++){
			second = second.next;
		}
		while(second.next != null){
			first= first.next;
			second = second.next;
		}
		return first.payload;
	}

	private Node find(int payload){
		for(Node n = root; n != null; n = n.next){
			if(n.payload == payload){
				return n;
			}
		}
		return null;
	}

	public void deleteMiddle(int payload){
		Node n = find(payload);
		if(n == null || n == root || n == tail){
			throw new RuntimeException("Not an appropriate payload, payload cannot be first and last and must be in the LinkedList");
		}
		Node prevNode = n;
		while(n.next != null){
			n.payload = n.next.payload;
			prevNode = n;
			n = n.next;
		}
		prevNode.next = null;
		n.prev = null;
		tail = prevNode;
	}

}