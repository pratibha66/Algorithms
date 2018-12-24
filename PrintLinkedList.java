public class PrintLinkedList{
	
	public static void main(String[] args){
		LinkedList ll = new LinkedList();
		ll.insert(14);
		ll.insert(9);
		ll.insert(4);
		ll.append(2);
		ll.printLL();
		ll.append(10);
		ll.printLL();
	}
}