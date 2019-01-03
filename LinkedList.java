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

	public int length(){
	if(root = null){
		return 0;
	}
	int result = 0;
	for(Node n = root; n != null; n = n.next){
		result++;
	}
	return result;
	}

	private Node getKthNode(int k){
		Node n = null;
		for(n = root; k != 0 ; n = n.next){
			k--;
		}
		return n;
	}

	public boolean intersects(LinkedList l1, LinkedList l2){
		if(l1 == null || l2 == null){
			return false;
		}
		int length1 = l1.length();
		int length2 = l2.length();
		if(length1 == 0 || length2 == 0){
			return false;
		}
		int diff = (length1 - length2);
		Node n1 = l1.root;
		Node n2 = l2.root;
		if(diff > 0){
			n1 = l1.getKthNode(diff);
		}else{
			n2 = l2.getKthNode(0-diff);
		}
		while(n1 != n2){
			n1 = n1.next;
			n2 = n2.next;
		}
		return (n1!=null);
	}
}


