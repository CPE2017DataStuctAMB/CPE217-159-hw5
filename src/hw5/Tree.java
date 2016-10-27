package hw5;

// This Tree needs to inherit BTreePrinter
//n
public class Tree extends BTreePrinter{
    Node root;
    
    public Tree(){
        // can be left blank
    }
    
    public Tree(Node root){
        // fix this
    }
    
    public void printTree(){
        super.printTree(root);
    }

    public Node find(int search_key){
        return find(root, search_key;);
    }
    
    public static Node find(Node node, int search_key){
        while(node != null && node.key != search_key)
        {
            if(search_key > node.key)
                node = node.right;
            else
                node = node.left;
        }
        if(node == null)//return null if reach to leaf's child
            return null;
        return node;
    }
    
    public Node findClosest(int search_key){
        // fix this
        return null;
    }
    
    public static Node findClosest(Node node, int search_key){
        // fix this
        return null;
    }
    
    public Node findMin(){
        return findMin(root);
    }
    
    public static Node findMin(Node node){
        if(node == null)//return node if it's a null as it'll throw an exception in a while loop
            return node;
        while(node.left != null)//go to leftmost node
            node = node.left;
        return node;
    }
    
    public Node findMax(){
        return findMax(root);
    }
    
    public static Node findMax(Node node){
        if(node == null)//return node if it's a null
            return node;
        while(node.right != null)//go to rightmost node
            node = node.right;
        return node;
    }
    
    public Node findKthSmallest(int k){
        return findKthSmallest(root, k);
    }
    
    public static Node findKthSmallest(Node node, int k){
        //check if k is more than tree size
        if(k > node.size())
            return null;
        int size = node.left.size()+1;
        if(k == size)
            return node;
        else if(k < size)
            return findKthSmallest(node.left, k);
        else //k > size
            return findKthSmallest(node.right, k-size);
    }
    
    public List rangeSearch(int x, int y){
        List list = new List(100);
        // do something here
        return list;
    }
    
    public void printPreOrderDFT(){
        System.out.print("PreOrder DFT node sequence [ ");
        // something is missing here
        System.out.println("]");
    }
    
    public static void printPreOrderDFT(Node node){
        // fix this
    }
    
    public void printInOrderDFT(){
        System.out.print("InOrder DFT node sequence [ ");
        // something is missing here
        System.out.println("]");
    }
    
    public static void printInOrderDFT(Node node){
        // fix this
    }
    
    public void printPostOrderDFT(){
        System.out.print("PostOrder DFT node sequence [ ");
        // something is missing here
        System.out.println("]");
    }
    
    public static void printPostOrderDFT(Node node){
        // fix this
    }
    
    public void insert(int key) {
        if (root == null) {
            root = new Node(key);
            //place new node to root if tree is empty
        }
        else
        {
            //place new node to somewhere else in a tree, if key is not exists
            Node node = root;
            while(node.key != key)
            {
                if(node.key > key)
                    node = node.left;
                else
                    node = node.right;
            }
            if(node == null)
                node = new Node(key);
            else
                System.out.println("Duplicated key!!!");
        }
    }
    
    // You should include root node deletion in this function
    public void delete(int key) {
        if (root == null) {
            System.out.println("Empty Tree!!!");
        } else if (root.key == key) { // Delete root node
            // delete the root
        } else { 
            // Recursively delete non-root node
            // or
            System.out.println("Key not found!!!");
        }
    }
    
    // this function should delete only non-root node
    public static void delete(Node node){
        // There should be three cases
    }
    
    // Replace node1 with a new node2
    // node2 must be created using "new Node(key)" before calling this function
    // This function is optional, you do not have to use it
    public static void replace(Node node1, Node node2){ 
        if ((node1.left != null) && (node1.left != node2)){
            node2.left = node1.left;
            node1.left.parent = node2;
        }
        if ((node1.right != null) && (node1.right != node2)){
            node2.right = node1.right;
            node1.right.parent = node2;
        }
        if ((node1.parent != null) && (node1.parent != node2)){
            node2.parent = node1.parent;
            if (node1.parent.key > node1.key){
                node1.parent.left = node2;
            }else{
                node1.parent.right = node2;
            }
        }
    }
    
    public int height(){
        return root.height();
    }
    
    public int depth(){
        // Tree depth is equal to tree height
        return root.depth(this);
    }
    
    public int size(){
        return root.size();
    }
}
