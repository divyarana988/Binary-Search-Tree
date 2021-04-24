  public static class Node {
    int data;
    Node left;
    Node right;

    Node(int data, Node left, Node right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }
 
 public static Node add(Node node, int data) {
    // write your code here
    if(node == null){
        Node temp = new Node(data, null, null);
        return temp;
    }
    
    if(data>node.data) node.right = add(node.right, data);
    else if(data<node.data) node.left = add(node.left, data);
    
    return node;
  }