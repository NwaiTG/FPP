package lesson10.prob10_1.employeebst;


public class EmployeeBTS{
	private Node root;
	private NameComparator nameComp;
	
	public EmployeeBTS(NameComparator nComp) {
		root = null;
		this.nameComp = nComp;
	}
	
	public void insert(Employee emp) {
		if(root == null) {
			root = new Node(emp, null, null);
		}
		else {
			Node n = root;
			boolean inserted = false;
			while(!inserted) {
				if(nameComp.compare(emp, n.employee) < 1) {
					if(n.left == null) {
						n.left = new Node(emp, null, null);
						inserted = true;
					}
					else {
						n = n.left;
					}
				}				
				else if(nameComp.compare(emp, n.employee) >= 0) {
					if(n.right == null) {
						n.right = new Node(emp, null, null);
						inserted = true;
					}
					else {
						n = n.right;
					}
				}
			}
		}
	}
	
	
	public void printTree() {
		if(root == null)
			System.out.println("Empty Employee");
		else
			printTree(root);
	}
	
	private void printTree(Node t) {
		if(t != null) {
			printTree(t.left);
			System.out.println(t.employee);
			printTree(t.right);
		}
	}
	
	private class Node {


		// Constructors
		@SuppressWarnings("unused")
		Node(Employee emp) {
			this(emp, null, null);
		}

		Node(Employee emp, Node left, Node right) {
			this.employee = emp;
			this.left = left;
			this.right = right;
		}
		private Employee employee; // The data in the node
		private Node left; // Left child
		private Node right; // Right child
	}
}
