package mypack;

public class BinaryTree {
      
	static void preorder(BTreeNode node) {
		if (node==null) return;
		else {
			System.out.print(node.data+" ");
			preorder(node.left);
			preorder(node.right);
		}
	}
	
	static void postorder(BTreeNode node) {
		if (node==null) return;
		else {
			
			postorder(node.left);
			postorder(node.right);
			System.out.print(node.data+" ");
		}
	}
	
	static void inorder(BTreeNode node) {
		if (node==null) return;
		else {
			
		   inorder(node.left);
		   System.out.print(node.data+" ");
			inorder(node.right);
		}
	}
	
	public static void main(String[] args) {
		BTreeNode root = new BTreeNode(1);
		root.left = new BTreeNode(2);
		root.right = new BTreeNode(3);
		
		root.left.left = new BTreeNode(4);
		root.left.right = new BTreeNode(5);
		
		root.right.left = new BTreeNode(6);
		root.right.right = new BTreeNode(7);
		System.out.println("Pre Order");
		preorder(root);
		System.out.println("\nPost Order");
		postorder(root);
		System.out.println("\nIn Order");
		inorder(root);
	}
}
