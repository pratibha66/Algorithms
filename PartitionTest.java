public class PartitionTest{
	public static void main(String[] args){
		LinkedList ll = new LinkedList();
		ll.append(3);
		ll.append(5);
		ll.append(8);
		ll.append(5);
		ll.append(10);
		ll.append(2);
		ll.append(1);
		System.out.println("Before partition");
		ll.printLL();
		ll.partition(5);
		System.out.println("After partition");
		ll.printLL();
	}
}