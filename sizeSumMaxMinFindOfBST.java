
public static int size(Node node) {
    // write your code here
    if(node == null) return 0;
    
    int lsize = size(node.left);
    int rsize = size(node.right);
    
    return lsize+rsize+1;
  }

  public static int sum(Node node) {
    // write your code here
    if(node == null) return 0;
    
    int lsum = sum(node.left);
    int rsum = sum(node.right);
    
    return lsum+rsum+node.data;
  }

  public static int max(Node node) {
    // write your code here
    if(node.right!=null){
        return max(node.right);
    }else{
        return node.data;
    }
  }

  public static int min(Node node) {
    // write your code here
     if(node.left!=null){
        return min(node.left);
    }else{
        return node.data;
    }
  }

  public static boolean find(Node node, int data){
    // write your code here
    if(node == null) return false;
    
    if(node.data==data) return true;
    
    else if(node.data < data) return find(node.right, data);
    else return find(node.left, data);
   }  