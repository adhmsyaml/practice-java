public class BSTreeIntApps 
{
    public static void main(String[] args) 
    {
        BSTreeInt bstree = new BSTreeInt();      
        bstree.addNode(5);
        bstree.addNode(2);
        bstree.addNode(8);
        bstree.addNode(6);
        bstree.addNode(3);
        bstree.addNode(9);
        bstree.addNode(7);
        bstree.addNode(4);
        bstree.addNode(1);
        
        System.out.print("Pre-Order Traversal: ");
        bstree.preOrderTraversal();
        System.out.println();
        System.out.print("In-Order Traversal: ");
        bstree.inOrderTraversal();
        System.out.println();
        System.out.print("Post-Order Traversal: ");
        bstree.postOrderTraversal();  
        System.out.println();
        System.out.print("Reverse-Order Traversal: ");
        bstree.reverseOrderTraversal();
      
        
                            
    }
}



   
 
