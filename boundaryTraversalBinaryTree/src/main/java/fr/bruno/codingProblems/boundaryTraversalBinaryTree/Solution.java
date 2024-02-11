package fr.bruno.codingProblems.boundaryTraversalBinaryTree;

import java.util.ArrayList;
import java.util.Optional;

public class Solution {
    public static <T> ArrayList<T> mainBoundaryTraversal(Optional<BinaryTree<T>> tree) {
        if (tree.isEmpty()) return new ArrayList<>();

        ArrayList<T> traversal = new ArrayList<>();

        traversal.add(tree.get().val);
        leftBoundaryTraversal(tree.get().leftSubTree, traversal);
        if (tree.get().rightSubTree.isPresent()) {
            rightBoundaryTraversal(tree.get().rightSubTree, traversal);
            traversal.add(tree.get().rightSubTree.get().val);
        }

        return traversal;
    }

    public static <T> void leftBoundaryTraversal(Optional<BinaryTree<T>> optionalTree, ArrayList<T> traversal) {
        if (optionalTree.isEmpty()) return;

        BinaryTree<T> tree = optionalTree.get();

        // leaf
        if (tree.leftSubTree.isEmpty() && tree.rightSubTree.isEmpty()) {
            traversal.add(tree.val);
            return;
        }
        // first: explore left side
        if (tree.leftSubTree.isPresent()) {
            traversal.add(tree.val);
            leftBoundaryTraversal(tree.leftSubTree, traversal);
        }
        // then explore right side
        if (tree.rightSubTree.isPresent()) {
            rightBoundaryTraversal(tree.rightSubTree, traversal);
        }
    }

    public static <T> void rightBoundaryTraversal(Optional<BinaryTree<T>> optionalTree, ArrayList<T> traversal) {
        if (optionalTree.isEmpty()) return;

        BinaryTree<T> tree = optionalTree.get();

        // leaf
        if (tree.leftSubTree.isEmpty() && tree.rightSubTree.isEmpty()) {
            traversal.add(tree.val);
            return;
        }
        // first: explore left side
        if (tree.leftSubTree.isPresent()) {
            leftBoundaryTraversal(tree.leftSubTree, traversal);
        }
        // then explore right side
        if (tree.rightSubTree.isPresent()) {
            rightBoundaryTraversal(tree.rightSubTree, traversal);
        }
    }
}
