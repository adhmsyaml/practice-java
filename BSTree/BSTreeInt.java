public class BSTreeInt {
    private TreeNodeInt root;
    
    //Create an empty tree
    public BSTreeInt() {
        root = null;
    }
    
    //insert new node into BST. If the tree is empty, create the root here, 
    //otherwise call the add method to insert the node   
    public void addNode(int data) {
        if (root == null) {
            root = new TreeNodeInt(data);
        }
        else {
            root.add(data);
        }   
    }
    
    //Pre-Order Traversal
    public void preOrderTraversal() {
        preOrderHelper(root);
    }
    
    //In-Order Traversal
    public void inOrderTraversal() {
        inOrderHelper(root);
    }
    
    //Post-Order Traversal
    public void postOrderTraversal() {
        postOrderHelper(root);
    }
    
    //Revers-Order Traversal
    public void reverseOrderTraversal() {
        reverseOrderHelper(root);
    }
    
    /**Recursive method to perform pre-order traversal (N-L-R)**/
    private void preOrderHelper(TreeNodeInt node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrderHelper(node.left);
        preOrderHelper(node.right);
    }
    
    /***Recursive method to perform in-order traversal (L-N-R)**/
    private void inOrderHelper(TreeNodeInt node) {
        if (node == null) {
            return;
        }
        inOrderHelper(node.left);
        System.out.print(node.data + " ");
        inOrderHelper(node.right);
    }
    
    /***Recursive method to perform post-order traversal (L-R-N)**/
    private void postOrderHelper(TreeNodeInt node) {
        if (node == null) {
            return;
        }
        postOrderHelper(node.left);
        postOrderHelper(node.right);
        System.out.print(node.data + " ");
    }   
    
    /***Recursive method to produce descending order(R-N-L)**/
    private void reverseOrderHelper(TreeNodeInt node) {
        if (node == null) {
            return;
        }
        reverseOrderHelper(node.right);
        System.out.print(node.data + " ");
        reverseOrderHelper(node.left);
    }  
    
    
     /***Count all nodes in the tree**/
    public int countAllNode() {
        return countNode(root);
    }
    
    /***Recursive method to count all nodes**/
    private int countNode(TreeNodeInt node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNode(node.left) + countNode(node.right);       
        
    }    
    
    /***Count odd nodes in the tree**/
    public int countOdd() {
        return countAllOdd(root);
    }
    
    /***Recursive method to count odd nodes*/
    public int countAllOdd(TreeNodeInt node) {
        if (node == null) { return 0; }
        if (node.data % 2 != 0) {
            return 1 + countAllOdd(node.left) + countAllOdd(node.right);
        }
        else {
            return countAllOdd(node.left) + countAllOdd(node.right);
        }        
    }    
    
    /***Calculate sum of values in tree**/
    public int calcAllSum() {
        return calcSum(root);
    }
    
    /***Recursive method to calculate sum**/
    private int calcSum(TreeNodeInt node) {
        
        if (node == null) {
            return 0;
        }      
        return node.data + calcSum(node.left) + calcSum(node.right);
    }
    
    /***Count all even number in tree***/
    public int countAllEven() {
        return countEven(root);
    }
    
    /***Recursive method to count all even node**/
    private int countEven(TreeNodeInt node) {
        if (node == null) {
            return 0;
        }
        if (node.data % 2 == 0) {
            return 1 + countEven(node.left) + countEven(node.right);
        }
        else {
           return countEven(node.left) + countEven(node.right);
        }
    }
    
    /***Print even number**/
    public void displayEven() {
        displayEvenNumber(root);
    }
    
    /***Recursive method to print all even number**/
    private void displayEvenNumber(TreeNodeInt node) {
        if (node == null) 
            return;        
        displayEvenNumber(node.left);
        if (node.data % 2 == 0) {
            System.out.print(node.data + " ");            
        }
        displayEvenNumber(node.right);
    }   
    
    /***Print all nodes of multiple n**/
    public void displayAllMultiple(int n) {
        displayMultiple(root, n);
    }

    /***Recursive method to print all nodes of multiple n**/
    private void displayMultiple(TreeNodeInt node, int n) {
        if (node == null) {
            return;
        }
        displayMultiple(node.left, n);
        if (node.data % n == 0) {
            System.out.print(node.data + " ");
        }
        displayMultiple(node.right, n);        
    }
    
    /***Search biggest integer**/
    public int biggestInt() {
        int max = root.data;
        return biggest(root, max);
    }
    
    /***Recursive method to search biggest integer in the Tree**/
    private int biggest(TreeNodeInt node, int max) {       
        if(node == null) return max;
        if(node.data > max) 
            max = node.data;
        return biggest(node.right, max);

    } 
         
    /***Search smallest integer**/
    public int smallestInt() {
        int min = root.data;
        return smallest(root, min);
    }
    
    /***Recursive method to search smallest integer in the Tree**/
    private int smallest(TreeNodeInt node, int min) {
        if(node == null) return min;
        if(node.data < min) 
            min = node.data;
        return smallest(node.left, min);  
    }  
    
    /***Print odd number**/
    public void displayOdd() {
        displayOddNumber(root);
    }
    
    /***Recursive method to print all odd number**/
    private void displayOddNumber(TreeNodeInt node) {
        if (node == null) 
            return;        
        displayOddNumber(node.left);
        if (node.data % 2 != 0) {
            System.out.print(node.data + " ");            
        }
        displayOddNumber(node.right);
    }   
    
    /***Sum even number**/
    public int sumEven() {
        return sumAllEven(root);
    }
    
    /***Recursive method to sum all even number**/
    private int sumAllEven(TreeNodeInt node) {
        if (node == null)
            return 0;
        if (node.data % 2 == 0)
            return node.data + sumAllEven(node.left) +  sumAllEven(node.right);
        else
            return sumAllEven(node.left) +  sumAllEven(node.right);            
    }
}