package lesson9.prob9_3;

public class ArrayQueueImpl {
	private int[] arr = new int[10];
	private int size = 0;
	private int front = -1;
	private int rear = 0;
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void enqueue(int n) {
		
		if(isEmpty()) {
			front = 0;
		}
		if(rear < arr.length) {
			arr[rear] = n;
			rear++;
			size++;
		}
		else
		{
			resize();
			enqueue(n);
		}
	}
	
	public int dequeue() {
//		size();
		if(isEmpty()) throw new IllegalStateException("Cannot remove because Queue is empty!");
		int val = arr[front];
		front++;
		size--;
		return val;
	}
	
	public int peek() {
//		size();
		if(isEmpty()) throw new IllegalStateException("Cannot peek because Queue is empty!");
		int val = arr[front];
		return val;
	}
	
	private void resize() {
		int[] temp = new int[arr.length + 5];
		System.arraycopy(arr, 0, temp, 0, arr.length);
		arr = temp;
	}
	
	public int size() {
		return size;
	}
	
	public static void main(String[] args) {
		ArrayQueueImpl q = new ArrayQueueImpl();
		
		//uncomment when ready
		for(int i = 0; i < 15; i ++)
			q.enqueue(i);
		for(int i = 0; i < 14; i ++)
			q.dequeue();
		System.out.println(q.size());
		System.out.println(q.peek());
	}
}

