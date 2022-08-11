public class TreeNodeInt {
    public int data;
    public TreeNodeInt left;
    public TreeNodeInt right;
    
    // Create node - constructor
    public TreeNodeInt(int data) {
        this.data = data;
        left = right = null;
    }
    
    // Insert node at the appropriate place  - mutator
    public void add (int data) {
        if(data < this.data) {
            if(left == null) {
                left = new TreeNodeInt(data);
            }
            else {
                left.add(data);
            }
        }
        else if (data >= this.data) {
            if (right == null) {
                right = new TreeNodeInt(data);
            }
            else {
                right.add(data);
            }
        }
    }
} //end of class definition
