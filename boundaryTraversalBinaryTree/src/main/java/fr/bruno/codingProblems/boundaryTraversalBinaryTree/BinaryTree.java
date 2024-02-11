package fr.bruno.codingProblems.boundaryTraversalBinaryTree;

import java.util.Optional;

public class BinaryTree<T> {
    T val;
    Optional<BinaryTree<T>> leftSubTree, rightSubTree; // maybe it seems over-the-top but I am pretty fond of optional types

    BinaryTree() {}
    BinaryTree(T val){
        this.val = val;
        this.leftSubTree = Optional.empty();
        this.rightSubTree = Optional.empty();
    }
    BinaryTree(T val, Optional<BinaryTree<T>> leftSubTree, Optional<BinaryTree<T>> rightSubTree){
        this.val = val;
        this.leftSubTree = leftSubTree;
        this.rightSubTree = rightSubTree;
    }

}
