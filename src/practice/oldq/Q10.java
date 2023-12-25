package practice.oldq;

public class Q10 {
	Node header;

	Q10() {
		this.header = new Node(null);
	}

	class Node {
		Object ob;
		Node previous;
		Node next;

		public Node(Object obj) {
			this.ob = obj;
		}

		public String toString() {
			return ob == null ? "null" : ob.toString();
		}
	}

	public void add(Object ob) {
		Node newNode = new Node(ob);
		if (header.next == null) {
			header.next = newNode;
		} else {
			Node temp = header.next;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.previous = temp;
		}
	}

	public boolean removeFirst(Object ob) {
		if (ob == null || header.next == null)
			return false;
		if (header.next.next != null) {
			header.next = header.next.next;
			header.next.previous = header;
		} else {
			header.next = null;
		}
		return true;
	}

	public boolean isEmpty() {
		if (header.next == null)
			return true;
		else
			return false;
	}

	public String toString() {
		var sb = new StringBuffer();
		Node next = header.next;
		while (next != null) {
			sb.append(next.toString() + ", ");
			next = next.next;
		}
		var result = sb.toString().trim();
		if (result.length() == 0)
			return "<empty list>";
		if (result.charAt(result.length() - 1) == ',') {
			return result.substring(0, result.length() - 1);
		}
		return result;
	}

	public Object get(int i) {
		if (i < 0)
			return null;
		Node temp = header;
		for (int j = 0; j <= i; j++) {
			if (temp.next != null) {
				temp = temp.next;
			}
		}
		return temp.ob;
	}

	public static void main(String[] args) {
		var list = new Q10();
		list.add("Rich");
		System.out.println(list);
		list.removeFirst("Rich");
		System.out.println(list);
		list.add("Bob");
		list.add("Harry");
		list.add("Steve");
		System.out.println(list);
		list.removeFirst("Steve");
		System.out.println(list);
		System.out.println(list.get(1));
		System.out.println(list.get(0));
		list.add("Tom");
		System.out.println(list);
	}
}
