package hw5;

// This Tree needs to inherit BTreePrinter
//n
public class Tree {
    Node root;
    
    public Tree(){
        // can be left blank
    }
    
    public Tree(Node root){
        // fix this
    }
    
    public void printTree(){
        //super.printTree(root);
    }

    public Node find(int search_key){
        // Fix this
        return null;
    }
    
    public static Node find(Node node, int search_key){
        // fix this
        return null;
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
        // fix this
        return null;
    }
    
    public static Node findMin(Node node){
        // fix this
        return null;
    }
    
    public Node findMax(){
        // fix this 
        return null;
    }
    
    public static Node findMax(Node node){
        // fix this
        return null;
    }
    
    public Node findKthSmallest(int k){
        // fix this
        return null;
    }
    
    public static Node findKthSmallest(Node node, int k){
        // fix this
        return null;
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
            // do something
        } else {
            // do something
            // or
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
        return -1; // fix this with a single line
    }
    
    public int depth(){// Tree depth is equal to tree height
        return -1; // fix this with a single line
    }
    
    public int size(){
        return -1; // fix this with a single line
    }
}
