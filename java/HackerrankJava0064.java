import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HackerrankJava0064 {

	public static void main(String[] args) throws Exception {
		// Java Visitor Pattern
		// https://www.hackerrank.com/challenges/java-vistor-pattern/problem?isFullScreen=true

		Tree root = solve();
		SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
		ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
		FancyVisitor vis3 = new FancyVisitor();

		root.accept(vis1);
		root.accept(vis2);
		root.accept(vis3);

		int res1 = vis1.getResult();
		int res2 = vis2.getResult();
		int res3 = vis3.getResult();

		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
	}

	private static List<Tree> nodes = new ArrayList<>();
	private static Map<Integer, List<Integer>> connectionMap = new HashMap<>();

	// --- You need to fill method below ---
	public static Tree solve() {
		Scanner scanner = new Scanner(System.in);

		int numberOfNodes = scanner.nextInt();

		for (int i = 0; i < numberOfNodes; i++) {
			nodes.add(new TreeNode(scanner.nextInt()));
		}

		for (int i = 0; i < numberOfNodes; i++) {
			nodes.get(i).setColor(scanner.nextInt() == 0 ? Color.RED : Color.GREEN);
		}

		for (int i = 1; i < numberOfNodes; i++) {
			int firstNodeInput = scanner.nextInt();
			int secondNodeInput = scanner.nextInt();

			if (connectionMap.containsKey(firstNodeInput)) {
				List<Integer> tmpList = new ArrayList<>(connectionMap.get(firstNodeInput));
				tmpList.add(secondNodeInput);
				connectionMap.put(firstNodeInput, tmpList);

			} else {
				connectionMap.put(firstNodeInput, Collections.singletonList(secondNodeInput));
			}

			if (connectionMap.containsKey(secondNodeInput)) {
				List<Integer> tmpList = new ArrayList<>(connectionMap.get(secondNodeInput));
				tmpList.add(firstNodeInput);
				connectionMap.put(secondNodeInput, tmpList);

			} else {
				connectionMap.put(secondNodeInput, Collections.singletonList(firstNodeInput));
			}
		}
		scanner.close();

		fillTreeAndReturnIfLeaf(nodes.get(0), 0);

		return nodes.get(0);
	}

	// --- You need to fill method below ---
	private static boolean fillTreeAndReturnIfLeaf(Tree currentNode, int currentDepth) {
		((TreeNode) currentNode).setDepth(currentDepth);

		boolean isLeaf = true;
		int currentNodeHumanIndex = nodes.indexOf(currentNode) + 1;
		for (int child : connectionMap.get(currentNodeHumanIndex)) {
			List<Integer> tmpList = new ArrayList<>(connectionMap.get(child));
			tmpList.remove(Integer.valueOf(currentNodeHumanIndex));
			connectionMap.put(child, tmpList);

			Tree childNode = nodes.get(child - 1);
			boolean isChildIsLeaf = fillTreeAndReturnIfLeaf(childNode, currentDepth + 1);
			if (isChildIsLeaf) {
				((TreeNode) currentNode).addChild(new TreeLeaf(childNode.getValue(), childNode.getColor(), childNode.getDepth()));
			} else {
				((TreeNode) currentNode).addChild(childNode);
			}
			isLeaf = false;
		}
		return isLeaf;

	}

}

enum Color {
	RED, GREEN
}

abstract class Tree {

	private int value;
	private Color color;
	private int depth;

	public Tree(int value) {
		this.value = value;
	}

	public Tree(int value, Color color, int depth) {
		this.value = value;
		this.color = color;
		this.depth = depth;
	}

	public int getValue() {
		return value;
	}

	public Color getColor() {
		return color;
	}

	public int getDepth() {
		return depth;
	}

	// --- You need to add method below ---
	public void setColor(Color color) {
		this.color = color;
	}

	// --- You need to add method below ---
	public void setDepth(int depth) {
		this.depth = depth;
	}

	public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {

	private ArrayList<Tree> children = new ArrayList<>();

	public TreeNode(int value) {
		super(value);
	}

	public TreeNode(int value, Color color, int depth) {
		super(value, color, depth);
	}

	public void accept(TreeVis visitor) {
		visitor.visitNode(this);

		for (Tree child : children) {
			child.accept(visitor);
		}
	}

	public void addChild(Tree child) {
		children.add(child);
	}
}

class TreeLeaf extends Tree {

	public TreeLeaf(int value, Color color, int depth) {
		super(value, color, depth);
	}

	public void accept(TreeVis visitor) {
		visitor.visitLeaf(this);
	}
}

abstract class TreeVis {
	public abstract int getResult();

	public abstract void visitNode(TreeNode node);

	public abstract void visitLeaf(TreeLeaf leaf);

}

class SumInLeavesVisitor extends TreeVis {

	// --- You need to add line below ---
	private int result = 0;

	public int getResult() {
		// --- You need to update line below ---
		return result;
	}

	public void visitNode(TreeNode node) {
	}

	public void visitLeaf(TreeLeaf leaf) {
		// --- You need to add line below ---
		result += leaf.getValue();
	}
}

class ProductOfRedNodesVisitor extends TreeVis {

	// --- You need to add line below ---
	private long result = 1;

	public int getResult() {
		// --- You need to update line below ---
		return (int) result;
	}

	public void visitNode(TreeNode node) {
		// --- You need to add line below ---
		result = (result * checkColorAndReturnNodeValue(node)) % 1000000007;
	}

	public void visitLeaf(TreeLeaf leaf) {
		// --- You need to add line below ---
		result = (result * checkColorAndReturnNodeValue(leaf)) % 1000000007;
	}

	// --- You need to add method below ---
	private int checkColorAndReturnNodeValue(Tree tree) {
		if (tree.getColor() == Color.RED) {
			return tree.getValue();
		}
		return 1;
	}
}

class FancyVisitor extends TreeVis {

	// --- You need to add line below ---
	private int result = 0;

	public int getResult() {
		// --- You need to update line below ---
		return result > 0 ? result : -result;
	}

	public void visitNode(TreeNode node) {
		// --- You need to add lines below ---
		if (node.getDepth() % 2 == 0) {
			result += node.getValue();
		}

	}

	public void visitLeaf(TreeLeaf leaf) {
		// --- You need to add lines below ---
		if (leaf.getColor() == Color.GREEN) {
			result -= leaf.getValue();
		}
	}
}