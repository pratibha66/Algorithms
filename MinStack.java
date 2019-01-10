public class MinStack{
	private Stack <Integer> stack;
	private Stack <Integer> minStack;

	public MinStack(int size){
		stack = new Stack<>(size);
		minStack = new Stack<>(size);
	}

	public void push(int data){
		stack.push(data);
		if(minStack.isEmpty()){
			minStack.push(data);
		} else {
			int min = minStack.peek() > data ? data : minStack.peek();
			minStack.push(min);
		}

		
	}

	public int pop(){
		minStack.pop();
		return stack.pop();
	}

	public int peek(){
	return stack.peek();
	}

	public boolean isEmpty(){
		return stack.isEmpty();
	}

	public int minElement(){
		if(stack.isEmpty()){
			throw new RuntimeException("Stack is empty!");
		}
		return minStack.peek();
	}

}