public class AddLinkedList{
	
	public static LinkedList add(LinkedList l1, LinkedList l2){
		if(l1 == null && l2 == null){
			return null;
		}

		if(l1 == null){
			return l2.cloneLL();
		}

		if(l2 == null){
			return l1.cloneLL();
		}

		int carryOver = 0;
		Node n1 = l1.root;
		Node n2 = l2.root;
		LinkedList result = new LinkedList();
		while(n1 != null && n2 != null){
			 int sum = n1.payload + n2.payload + carryOver;
			 if(sum > 9){
			 	carryOver = 1;
			 	result.append(sum-10);
			 }else{
			 	carryOver = 0;
			 	result.append(sum);
			 }
			 n1 = n1.next;
			 n2 = n2.next;
		}
		while(n1 != null ){
			 int sum = n1.payload + carryOver;
			 if(sum > 9){
			 	carryOver = 1;
			 	result.append(sum-10);
			 }else{
			 	carryOver = 0;
			 	result.append(sum);
			 }
			n1 = n1.next;
		}
		while(n2 != null){
			 int sum = n2.payload + carryOver;
			 if(sum > 9){
			 	carryOver = 1;
			 	result.append(sum-10);
			 }else{
			 	carryOver = 0;
			 	result.append(sum);
			 }
			 n2 = n2.next;
		}
		if(carryOver == 1){
			result.append(carryOver);
		}
		return result;
	}

	public static LinkedList addBackward(LinkedList l1, LinkedList l2){
		l1.inPlaceReverse();
		l2.inPlaceReverse();
		LinkedList result = add(l1,l2);
		l1.inPlaceReverse();
		l2.inPlaceReverse();
		result.inPlaceReverse();
		return result;
	}

	public static void main(String [] args){
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		l1.append(7);
		l1.append(1);
		l1.append(6);
		l2.append(5);
		l2.append(9);
		l2.append(2);
		LinkedList result = add(l1,l2);
		System.out.println("Equal length");
		result.printLL();
		l1.append(7);
		result = add(l1,l2);
		System.out.println("Unequal length");
		result.printLL();
		// 7 1 6 7  + 5 9 2 9
		l2.append(9);
		result = add(l1,l2);
		System.out.println("Carryover on last node");
		result.printLL();

		LinkedList l3 = new LinkedList();
		LinkedList l4 = new LinkedList();
		l3.append(7);
		l3.append(8);
		l3.append(9);
		l3.append(9);
		l4.append(2);
		l4.append(3);
		l4.append(4);
		l4.append(1);
		result = addBackward(l3,l4);
		System.out.println("addBackward");
		result.printLL();
 	}
}


