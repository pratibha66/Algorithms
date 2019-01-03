public class InplaceReverse{

	public static void main(String[] args){
		LinkedList ll = new LinkedList();
		ll.append(1);
		ll.append(2);
		ll.append(3);
		ll.append(4);
		ll.append(5);
		System.out.println("before");
		ll.printLL();
		ll.inPlaceReverse();
		System.out.println("after");
		ll.printLL();
	}
}