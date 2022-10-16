//Question 3 LevelOrdr

import java.util.ArrayList;
import java.util.List;

public class LevelOrder {
	List<List<Integer>> levels = new ArrayList<List<Integer>>();
	
	public void levelorder(TreeNode node, int level) {
		// start the current level
		if (levels.size() == level)
			levels.add(new ArrayList<Integer>());
		
		// fulfil the current level
		levels.get(level).add(node.val);
		
		// process child nodes for the next level
		if (node.left != null)
			levelorder(node.left, level + 1);
		if (node.right != null)
			levelorder(node.right, level + 1);
	}
	
	public List<List<Integer>> levelOrder(TreeNode root) {
		if (root == null) return levels;
		levelorder(root, 0);
		return levels;
	}
}
