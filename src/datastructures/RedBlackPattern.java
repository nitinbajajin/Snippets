package datastructures;

/**
 * Created by nitlak on 08-06-2017.
 */
public class RedBlackPattern {

    public static void main(String[] args) {
        int intArray[] = { 17,34, 23,2, 6, 12, 18, 45, 9, 22, 28};
        Node root = new Node(18);
        for(int i : intArray){
            root.addNode(new Node(i));
        }


        root.display();
    }

}


class Node {
    private Node leftNode;
    private Node rightNode;

    int value;

    public Node(int value) {
        this.value = value;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    public void addNode(Node node) {
        if (node.value < this.value)
            addLeft(node);
        else
            addRight(node);
    }

    private void addRight(Node node) {
        if (this.getRightNode() == null) {
            this.setRightNode(node);
        } else {
            this.getRightNode().addNode(node);
        }

    }

    private void addLeft(Node node) {
        if (this.getLeftNode() == null) {
            this.setLeftNode(node);
        } else {
            this.getLeftNode().addNode(node);
        }
    }


    public void display() {
        if(this.getLeftNode() != null){
            this.getLeftNode().display();
        }
        System.out.println(" "+this.value);
        if(this.getRightNode() != null){
            this.getRightNode().display();
        }
    }
}