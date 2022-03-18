package com.spartaglobal.gm.Sorters.BinaryTree;

import com.spartaglobal.gm.Exceptionhandling.ChildNotFoundException;

public class BinaryTreeImplementation implements BinaryTreeInterface{
    private final Node rootNode;
    private int arrayPosition =0;
    private static int elementsAdded;

    private Node getRootNode() {
        return rootNode;
    }

    public BinaryTreeImplementation(Node rootNode) {
        this.rootNode = rootNode;
    }

    public static class Node {
        private final int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        public Node getLeftChild() {
            return leftChild;
        }

        public void setLeftChild(Node leftChild) {
            this.leftChild = leftChild;
        }

        public Node getRightChild() {
            return rightChild;
        }

        public void setRightChild(Node rightChild) {
            this.rightChild = rightChild;
        }

        public int getValue() {
            return value;
        }

        public boolean isLeftChildEmpty() {
            if (leftChild == null) {
                return true;
            } else {
                return false;
            }
        }

        public boolean isRightChildEmpty() {
            if (rightChild == null) {
                return true;
            } else {
                return false;
            }
        }
    }



    @Override
    public int getRootElement() {
        return this.rootNode.getValue();
    }


    @Override
    public void addElement(int element) {
        addNodeToTree(rootNode,element);
    }

    @Override
    public void addElements(int[] elements) {
        for(int element:elements){
            addElement(element);
        }
    }

    @Override
    public boolean findElement(int value) {
        Node node = findNode(value);
        if(node != null){
            return  true;
        }
        return false;
    }


    @Override
    public int getLeftChild(int element) throws ChildNotFoundException {
        Node node = findNode(element);
        if(node.isLeftChildEmpty()){
            throw new ChildNotFoundException();
        }else {
            return node.getLeftChild().getValue();
        }
    }

    @Override
    public int getRightChild(int element) throws ChildNotFoundException {
        Node node = findNode(element);
        if(node.isRightChildEmpty()){
            throw new ChildNotFoundException();
        }else {
            return node.getRightChild().getValue();
        }
    }

    @Override
    public int[] getSortedTreeAsc() {
        int[] sortedArray = new int[getNumberOfElements()];
        getSortedArrayInAsc(getRootNode(),sortedArray);
        return sortedArray;
    }

    @Override
    public int[] getSortedTreeDesc() {
        int[] sortedArray = new int[getNumberOfElements()];
        getSortedArrayInDesc(getRootNode(),sortedArray);
        return sortedArray;
    }


    private void addNodeToTree(Node node, int element){
        if(element <= node.getValue()){
            if(node.isLeftChildEmpty()){
                node.setLeftChild(new Node(element));
                elementsAdded = elementsAdded + 1;
            }else {
                addNodeToTree(node.getLeftChild(),element);
            }
        }else {
            if(node.isRightChildEmpty()){
                node.setRightChild(new Node(element));
                elementsAdded = elementsAdded + 1;
            }else {
                addNodeToTree(node.getRightChild(),element);
            }
        }
    }

    @Override
    public int getNumberOfElements() {
        return elementsAdded+1;
    }



    private Node findNode(int element){
        Node node = rootNode;
        while (node!=null){
            if(node.getValue()==element){
                return node;
            }
            if (element<=node.getValue()){
                node = node.getLeftChild();
            }else {
                node = node.getRightChild();
            }
        }
        return null;
    }

    private void getSortedArrayInAsc(Node node, int[] sortedArray) {
        if (node != null) {
            int nodeValue = node.getValue();
            getSortedArrayInAsc(node.getLeftChild(),sortedArray);
            sortedArray[arrayPosition] = node.getValue();
            arrayPosition++;
            getSortedArrayInAsc(node.getRightChild(),sortedArray);
        }
    }

    private void getSortedArrayInDesc(Node node, int[] sortedArray) {
        if (node != null) {
            int nodeValue = node.getValue();
            getSortedArrayInDesc(node.getRightChild(), sortedArray);
            sortedArray[arrayPosition] = node.getValue();
            arrayPosition++;
            getSortedArrayInDesc(node.getLeftChild(), sortedArray);
        }
    }

}
