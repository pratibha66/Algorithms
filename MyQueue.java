public class MyQueue{
	private Stack<Integer> firstStack;
	private Stack<Integer> secondStack;

	public MyQueue(int size){
		firstStack = new Stack<>(size);
		secondStack = new Stack<>(size);
	}

	public void enqueue(int data){
		firstStack.push(data);
	}

	public int dequeue(){
		if(!secondStack.isEmpty()){
			return secondStack.pop();
		}
		while(!firstStack.isEmpty()){
			secondStack.push(firstStack.pop());
		}
		return secondStack.pop();
	}

	public boolean isEmpty(){
		return (firstStack.isEmpty() && secondStack.isEmpty());
	}

	public static void main(String[] args){
		MyQueue myQueue = new MyQueue(6);
		myQueue.enqueue(1);
		myQueue.enqueue(2);
		myQueue.enqueue(3);
		myQueue.enqueue(4);
		myQueue.enqueue(5);
		myQueue.enqueue(6);
		while(!myQueue.isEmpty()){
			System.out.println(myQueue.dequeue());
		}
		
	}
}