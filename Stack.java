public class Stack <T>{
	
	private Object[] elements;
	private int size;
	private int tos;


	public Stack(int size){
		this.size = size;
		elements = new Object[size];
		tos = -1;
	}

	public T pop(){

	if(tos == -1){
		return null;
	}

	T result = (T)elements[tos];
	tos--;

	return result;

	}

	public T peek(){

	if(tos == -1){
		return null;
	}

	return (T)elements[tos];

	}

	public void push(Object data){

		if(tos == size-1){
		 	throw new RuntimeException("Stack is full!");
		}

		tos++;
		elements[tos] = data;

	}

	public boolean isEmpty(){
		return (tos==-1);
	}

	

}