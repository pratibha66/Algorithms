public class TestPalindrome{
	public static void main(String[] args){
		LinkedList ll = new LinkedList();
		ll.append(1);
		ll.append(2);
		ll.append(3);
		ll.append(2);
		ll.append(1);
		System.out.println(ll.isPalindrome());
		ll.append(2);
		System.out.println(ll.isPalindrome());
	}
}

