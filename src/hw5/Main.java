package hw5;

public class Main {
    
    public static void printNodeKey(Node node){
        if(node == null)
            System.out.println("Node not found!!!");
        else
            System.out.println(node.key);
    }
    
    public static void main(String[] args) {

        Tree tree = new Tree();

        /*tree.printTree();
        int[] keyList = {5, 3, 1, 2, 7, 9, 10, 8};
        for (int i=0; i<keyList.length; i++)
            tree.insert(keyList[i]);
        tree.printTree();
        Node node = tree.find(3); printNodeKey(node);
        node = tree.find(4); printNodeKey(node);
        node = tree.findClosest(4); printNodeKey(node);
        node = tree.findClosest(3); printNodeKey(node);
        node = tree.findClosest(-999); printNodeKey(node);
        node = tree.findClosest(999); printNodeKey(node);*/

        /*int[] keyList = {6, 7, 9, 5, 3, 9, 10, 8, 1};
        for (int i=0; i<keyList.length; i++)
            tree.insert(keyList[i]);
        tree.printTree();
        List list = tree.rangeSearch(4, 8);
        list.printList();*/

        /*int[] keyList = {5, 3, 1, 2, 7, 9, 10, 8};
        for (int i=0; i<keyList.length; i++)
            tree.insert(keyList[i]);
        tree.printTree(); System.out.println("----------------");
        tree.delete(7);
        tree.printTree(); System.out.println("----------------");
        tree.delete(3);
        tree.printTree();
        tree.delete(9);
        tree.delete(1);
        tree.delete(5);
        tree.delete(5); System.out.println("----------------");
        tree.printTree();*/

        /*int[] keyList = {5, 3, 1, 2, 7, 9, 10, 8};
        for (int i=0; i<keyList.length; i++)
            tree.insert(keyList[i]);
        tree.printTree();
        Node node = tree.find(4);
        printNodeKey(node);
        node = tree.findClosest(4);
        printNodeKey(node);
        node = node.findNext();
        printNodeKey(node);
        node = node.findNext();
        printNodeKey(node);
        node = node.findNext();
        printNodeKey(node);*/

        /*int[] keyList = {5, 3, 1, 2, 7, 9, 10, 8};
        for (int i=0; i<keyList.length; i++)
            tree.insert(keyList[i]);
        tree.printTree();
        tree.printPreOrderDFT();
        tree.printInOrderDFT();
        tree.printPostOrderDFT();*/

        int[] keyList = {5, 2, 3, 9, 1, 10, 8, 7};
        for (int i=0; i<keyList.length; i++)
            tree.insert(keyList[i]);
        tree.printTree();
        System.out.println(tree.depth());
        System.out.println(tree.height());
        Node node = tree.find(9);
        System.out.println(node.depth(tree));
        System.out.println(node.height());
        node = tree.findMax();
        printNodeKey(node);
        node = tree.findMin();
        printNodeKey(node);
        node = tree.findKthSmallest(6);
        printNodeKey(node);
        node = tree.findKthSmallest(3);
        printNodeKey(node);
    }
}
