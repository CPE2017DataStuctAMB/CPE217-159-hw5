package hw5;

public class Node{
    //n
    Node left;
    Node right;
    Node parent;
    int key;
    
    public Node(int data){
        key = data;
        left = null;
        right = null;
        parent = null;
    }
    
    public int height(){
        return height(this);
    }
    
    public static int height(Node node){
        if(node == null)
            return -1;//return -1 if this current node is null
        else
            return 1 + Integer.max(height(node.left), height(node.right));
        //comparing its left and right children and return the child's height which is more value
        //then +1 to refer to the node that comparing its children
    }

    public int size(){
        return size(this);
    }
    
    public static int size(Node node){
        if(node == null)
            return 0;
        else
            return size(node.left) + 1 + size(node.right);//go finding its children, if exist.
    }
    
    public Node findNext(){
        if(this.right == null)//go up finding next larger node
            return rightAncestor(this);
        return leftDescendant(this.right);//find leftmost of right subtree
    }
    
    public static Node leftDescendant(Node node){// Case 1
        Node loopNode = node;
        //the first operate node cannot be null, we already check it from findNext() method.
        while(loopNode.left != null)
            loopNode = loopNode.left;
        return loopNode;
    }
    
    public static Node rightAncestor(Node node) {// Case 2
        Node loopNode = node;
        while(loopNode.parent != null || loopNode.key > loopNode.parent.key)
        {
            //check if loopNode is not a root
            //and if loopNode's key is less than its parent's key, if so, return that node
            loopNode = loopNode.parent;
        }
        if(loopNode.parent == null)//cannot find right ancestor, then, return null
            return null;
        return loopNode.parent;
    }
    
    public int depth(Tree tree){
        Node node = tree.root;
        int depth = 0;
        while(node != null && node.key != this.key)
        {
            if(node.key > this.key)
                node = node.left;
            else
                node = node.right;
            depth++;
            //increases depth as we go deeper
        }
        if(node == null)//at the child of a leaf but still cannot find a node in this tree
            return -1;
        return depth;
    }
 
}
