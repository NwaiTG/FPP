package finalp;

import java.util.NoSuchElementException;

/**
 * Implements the Queue interface using a single-linked list.
 * @author Koffman & Wolfgang
 **/
public class ListQueue<E>  {

    // Data Fields
    /** Reference to front of queue. */
    private Node<E> front;
    /** Reference to rear of queue. */
    private Node<E> rear;
    /** Size of queue. */
    private int size;

    // Insert inner class Node<E> here (see Listing 2.1)
    /** A Node is the building block for a single-linked list. */
    private static class Node<E> {
        // Data Fields

        /** The reference to the data. */
        private E data;
        /** The reference to the next node. */
        private Node<E> next;

        // Constructors
        /**
         * Creates a new node with a null next field.
         * @param dataItem The data stored
         */
        private Node(E dataItem) {
            data = dataItem;
            next = null;
        }

        /**
         * Creates a new node that references another node.
         * @param dataItem The data stored
         * @param nodeRef The node referenced by new node
         */
        private Node(E dataItem, Node<E> nodeRef) {
            data = dataItem;
            next = nodeRef;
        }
    } //end class Node

    // Methods
    /**
     * Insert an item at the rear of the queue.
     * @post item is added to the rear of the queue.
     * @param item The element to add
     * @return true (always successful)
     */
   
    public boolean offer(E item) {
		Node<E> newNode = new Node<E>(item);
        if(front == null){
			rear = newNode;
			front = rear;
		}
		else{
			rear.next = newNode;
			rear = rear.next;			
		}
		size++;
        return true;
    }
    
    public void add(E item) {
    	if(item == null) {
    		throw new IllegalStateException();
    	}
    	
    	Node<E> newNode = new Node<E>(item);
    	if(front == null) {
    		front = newNode;
    		rear = front;
    	}
    	else
    	{
    		rear.next = newNode;
    		rear = newNode;
    	}
    	size++;
    }

    /**
     * Remove the entry at the front of the queue and return it
     * if the queue is not empty.
     * @post front references item that was second in the queue.
     * @return The item removed if successful, or null if not
     */
    
    public E poll() {
        E item = peek();
		if(item == null){
			return null;
		}
		front = front.next;
		size--;
        return item; // Return data at front of queue.
    }

    /**
     * Return the item at the front of the queue without removing it.
     * @return The item at the front of the queue if successful;
     * return null if the queue is empty
     */
    
    public E peek() {
        if(size == 0) return null;
		
		return front.data;
    }

    /*<exercise chapter="4" section="3" type="programming" number="1">*/
    /**
     * Returns the size of the queue
     * @return the size of the queue
     */
   
    public int size() {
        return size;
    }
    
    public E maxVal() {
    	if(front == null) return null;
    	
    	E max = front.data;
    	Node<E> tempNode = front.next;
    	while(tempNode != null) {
    		if(((Comparable<E>)max).compareTo(tempNode.data) < 0) {
    			max = tempNode.data;
    		}
    		tempNode = tempNode.next;
    	}
    	
    	return max;
    }

    @Override
	public String toString() {
		if(front == null) return "";		
		Node<E> temp = front.next;
		StringBuilder sb = new StringBuilder("[" + front.data);
		while(temp != null){
			sb.append(" ==> ");
			sb.append(temp.data);			
			temp = temp.next;
		}
		sb.append("]");
		return sb.toString();
    	
//    	StringBuilder sb = new StringBuilder("[");
//		Node p = front;
//		if (p != null) {
//			while (p.next != null) {
//				sb.append(p.data.toString());
//				sb.append(" ==> ");
//				p = p.next;
//			}
//			sb.append(p.data.toString());
//		}
//		sb.append("]");
//		return sb.toString();
	}
      
    public static void main(String args[]){
    	ListQueue<Integer> lq = new ListQueue<>();
    	lq.offer(10);
    	lq.offer(50);
    	lq.offer(70);
    	lq.offer(40);
    	lq.add(60);
    	System.out.println(lq.size());
    	System.out.println("Peek Element : " + lq.peek());
    	System.out.println("Size : " + lq.size());
    	System.out.println("Poll : " + lq.poll());
    	System.out.println(lq);
    	System.out.println("Max Value : " + lq.maxVal());
    	    	
    }
}
/*</listing>*/
