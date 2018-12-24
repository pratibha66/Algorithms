// 1 2 3 4 1 2 1
// 1 2 3 4
public class RemoveDupsTest{

	public static void main(String [] args){
		LinkedList ll = new LinkedList();
		ll.append(1);
		ll.append(1);
		ll.append(1);
		ll.append(1);
		ll.append(1);
		ll.append(1);
		ll.append(1);
		ll.append(1);
		System.out.println("Before removeDups");
		ll.printLL();
		ll.removeDups();
		System.out.println("After removeDups");
		ll.printLL();


		LinkedList test1 = new LinkedList();
		test1.append(1);
		test1.append(2);
		test1.append(3);
		test1.append(4);
		test1.append(1);
		test1.append(2);
		test1.append(1);
		test1.append(2);
		System.out.println("Before removeDups");
		test1.printLL();
		test1.removeDups();
		System.out.println("After removeDups");
		test1.printLL();
	}

}



