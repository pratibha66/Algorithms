public class KthtoLastTest{
	
	public static void main(String [] args){
		LinkedList test1 = new LinkedList();
		test1.append(1);
		test1.append(2);
		test1.append(3);
		test1.append(4);
		test1.append(5);
		test1.append(6);
		test1.append(7);

		for(int i = 0; i <= 6; i++){
			System.out.println(test1.kthToLst(i));
		}
	}
}