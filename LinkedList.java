public class LinkedList{
	public Node root = null;
	public Node tail = null;

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

	public void partition(int num){
		if(root == null || root.next == null){
			return;
		}
		Node maintain = root;
		for(Node n = root; n != null; n = n.next){
			if(n.payload < num){
				int temp = maintain.payload;
				maintain.payload = n.payload;
				n.payload = temp;
				maintain = maintain.next;
			}

		}
	}
	
	public LinkedList cloneLL(){
		LinkedList result = new LinkedList();
		for(Node n = root; n != null; n= n.next){
			result.append(n.payload);
		}
		return result;
	}

	public LinkedList reverse(){
		if(root == null){
			return new LinkedList();
		}
		LinkedList result = new LinkedList();
		Node n = root;

		while(n!= null){
			result.insert(n.payload);
			n = n.next;
		}
		return result;
	}

	public void inPlaceReverse(){
		if(root == null || root.next == null){
			return;
		}
		Node first = root;
		Node second = root.next;
		Node third = second.next;
		first.next = null;
		while(second != null){
			second.next = first;
			first = second;
			second = third;
			if(third != null){
				third = third.next;
			}
		}
		root = first;

	}

	public boolean isPalindrome(){
		LinkedList toCompare = this.reverse();
		Node n = root;
		Node n1 = toCompare.root;
		while(n != null){
			if(n.payload != n1.payload){
				return false;
			}
			n = n.next;
			n1 = n1.next;
		}
		return true;
	}
}


