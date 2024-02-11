package fr.bruno.codingProblems.boundaryTraversalBinaryTree;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution<>();

        BinaryTree<Integer> treeA = new BinaryTree<Integer>(20,
            Optional.of(new BinaryTree<>(8,
                Optional.of(new BinaryTree<>(4)),
                Optional.of(new BinaryTree<>(12,
                    Optional.of(new BinaryTree<>(10)),
                    Optional.of(new BinaryTree<>(14))
                ))
            )),
            Optional.of(new BinaryTree<>(22,
                Optional.empty(),
                Optional.of(new BinaryTree<>(25))
            ))
        );

        System.out.print("Solution A: ");
        System.out.println(solution.mainBoundaryTraversal(Optional.of(treeA)));

        BinaryTree<Integer> treeB = new BinaryTree<Integer>(1,
            Optional.of(new BinaryTree<>(2,
                Optional.of(new BinaryTree<>(4)),
                Optional.of(new BinaryTree<>(5,
                        Optional.of(new BinaryTree<>(8)),
                        Optional.of(new BinaryTree<>(9))
                ))
            )),
            Optional.of(new BinaryTree<>(3,
                Optional.of(new BinaryTree<>(6)),
                Optional.of(new BinaryTree<>(7))
            ))
        );

        System.out.print("Solution B: ");
        System.out.println(solution.mainBoundaryTraversal(Optional.of(treeB)));

        BinaryTree<Integer> treeC = new BinaryTree<Integer>(1,
            Optional.of(new BinaryTree<>(2,
                Optional.of(new BinaryTree<>(4,
                    Optional.of(new BinaryTree<>(6)),
                    Optional.of(new BinaryTree<>(5))
                )),
                Optional.of(new BinaryTree<>(9,
                    Optional.empty(),
                    Optional.of(new BinaryTree<>(3,
                        Optional.of(new BinaryTree<>(7)),
                        Optional.of(new BinaryTree<>(8))
                    ))
                ))
            )),
            Optional.empty()
        );
        System.out.print("Solution C: ");
        System.out.println(solution.mainBoundaryTraversal(Optional.of(treeC)));
    }

}