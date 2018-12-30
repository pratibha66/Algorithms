public class DeleteMiddleTest{
	
	public static void main(String[] args){
		LinkedList ll = new LinkedList();
		ll.append(1);
		ll.append(2);
		ll.append(3);
		ll.append(4);
		ll.append(5);
		ll.deleteMiddle(3);
		ll.deleteMiddle(2);
		ll.deleteMiddle(4);
		ll.printLL();
	}
}