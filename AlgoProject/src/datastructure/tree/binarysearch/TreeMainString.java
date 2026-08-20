package datastructure.tree.binarysearch;

public class TreeMainString {

	public static void main(String[] args) {
		BinarySearchTree<String> tree = new BinarySearchTree<String>();
		
		tree.add("melon");
		tree.add("banana");
		tree.add("orange");
		tree.add("kiwi");
		tree.add("mango");
		tree.add("apple");
		tree.add("water melon");
		tree.add("purun");
		tree.add("peach");
		tree.add("pear");
		tree.add("persimon");
		
		System.out.print("전위 순회: ");
		tree.preorder();
		System.out.println();
		
		tree.remove("apple");
		
		System.out.print("중위 순회: ");
		tree.inorder();
		System.out.println();
		
		System.out.print("후위 순회: ");
		tree.postorder();
		System.out.println();

	}

}
