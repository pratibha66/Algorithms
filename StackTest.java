public class StackTest{
	public static void main(String[] args){
		Stack <Integer> stack = new Stack <>(100);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		while(!stack.isEmpty()){
			System.out.println(stack.pop());
		}

		System.out.println(isValidParenthesis("((()))"));
		System.out.println(isValidParenthesis("()()()"));
		System.out.println(isValidParenthesis("()())"));
		System.out.println(isValidParenthesis("((()"));
		System.out.println(isValidParenthesis(")"));
		System.out.println(isValidParenthesis("("));
		System.out.println(isValidParenthesis(""));

		MinStack minStack = new MinStack(10);
		minStack.push(100);
		minStack.push(4);
		minStack.push(70);
		minStack.push(1);
		minStack.push(40);
		minStack.push(0);
		while(!minStack.isEmpty()){
			System.out.println(minStack.minElement());
			minStack.pop();
		}

	}

	public static boolean isValidParenthesis(final String str){
		Stack <Character> stack = new Stack <>(str.length());
		for(Character ch : str.toCharArray()){
			if(ch == '('){
				stack.push(ch);
			} else{
				if(stack.isEmpty()){
					return false;
				}
				stack.pop();
			}
		}
		return stack.isEmpty();
	}

}