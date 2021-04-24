static int sum = 0;
  public static void rwsol(Node node){
    // write your code here
    if(node ==null) return;
    rwsol(node.right);
    int val = node.data;
    node.data = sum;
    sum+=val;
    
    rwsol(node.left);
  }