package ru.structures.tree.binary;

import ru.util.Util;
import ru.structures.tree.Tree;

public class BinaryTree implements Tree {
    private Node root;

    @Override
    public void find(int key) {
        if(root == null) {
            System.out.println("Tree is empty!");
            return;
        }

        Node current = root;
        int data;
        while ((data = current.data) != key) {
            current = key < data ? current.leftChild : current.rightChild;
            if(current == null) {
                System.out.println("key not found!");
                return;
            }
        }

        System.out.println("key found in node with id = " + current.id);
    }

    @Override
    public void insert(int key) {
        if(root == null) {
            root = new Node(key);
        } else {
            Node current = root;

            while (true) {
                int data = current.data;
                if(key < data) {
                    if(current.leftChild == null) {
                        current.leftChild = new Node(key);
                        break;
                    } else {
                        current = current.leftChild;
                    }

                } else if(key > data) {
                    if(current.rightChild == null) {
                        current.rightChild = new Node(key);
                        break;
                    } else {
                        current = current.rightChild;
                    }

                } else {
                    System.out.println("Node with key = " + key + " already exists");
                    break;
                }
            }
        }
    }

    @Override
    public void delete(int key) {
        if(root == null) {
            System.out.println("Tree is empty!");
            return;
        }

        Node current = root;
        Node parent = root;
        int data;
        while ((data = current.data) != key) {
            parent = current;
            current = key < data ? current.leftChild : current.rightChild;
            if(current == null) {
                System.out.println("key not found!");
                return;
            }
        }

        System.out.println("key found in node with id = " + current.id);
        boolean leftIsNull = current.leftChild == null;
        boolean rightIsNull = current.rightChild == null;
        boolean isLeftChild = parent.leftChild == current;

        if(leftIsNull && rightIsNull) {
            setParentChild(parent, isLeftChild, null);

        } else if(!leftIsNull && rightIsNull) {
            setParentChild(parent, isLeftChild, current.leftChild);

        } else if(leftIsNull && !rightIsNull) {
            setParentChild(parent, isLeftChild, current.rightChild);

        //Both not null
        } else {

        }
    }

    private void setParentChild(Node parent, boolean isLeftChild, Node newChild) {
        if(isLeftChild) parent.leftChild = newChild;
        else parent.rightChild = newChild;
    }

    @Override
    public void print() {
        if(root != null) {
            root.print(0);
        } else {
            System.out.println("Empty tree!");
        }
    }

    private static class Node {
        private static int count;

        private int id = ++count;
        private int data;

        private Node leftChild;
        private Node rightChild;

        public Node(Integer data) {
            this.data = data;
        }

        public void print(int level) {
            int nextLevel = level + 1;

            printNotNull(leftChild, nextLevel);

            for (int i = 0; i < level * 4; i++) {
                System.out.print(" ");
            }

            System.out.println(data);
            printNotNull(rightChild, nextLevel);
        }

        private void printNotNull(Node node, int level) {
            if(node != null) {
                node.print(level);
            }
        }
    }

    public static void main(String[] args) {
        Tree tree = new BinaryTree();
        int[] array = Util.generateRandomArray(16, 99);
        for (int el: array) {
            tree.insert(el);
        }
        tree.print();
    }
}
