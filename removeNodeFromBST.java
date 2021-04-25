public static int max (Node node){
      if(node.right!=null){
          return max(node.right);
      }else return node.data;
  }

  public static Node remove(Node node, int data) {
    // write your code here
    if(data>node.data){
        node.right = remove(node.right, data);
        return node;
    }
    else if(data<node.data){
        node.left = remove(node.left, data);
        return node;
    }
    else{
        if(node.left!=null && node.right!= null){
            int max = max(node.left);
            node.data = max;
            node.left = remove(node.left, max);
            return node;
        }else if(node.left!=null){
            Node temp = node.left;
            node.left = null;
            return temp;
        }else if(node.right!=null){
            Node temp = node.right;
            node.right = null;
            return temp;
        }else{
            return null;
        }
    }
  }
