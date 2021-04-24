 public static boolean find(Node node,int data){
      if(node == null) return false;
      if(node.data == data) return true;
      else if(node.data<data) return find(node.right, data);
      else return find(node.left, data);
  }

  public static void tsp(Node node, int target,Node root){
      if(node == null) return;
      
      tsp(node.left, target, root);
      int comp = target - node.data;
      if(comp >node.data && find(root, comp)){
          System.out.println(node.data + " " + comp);
      }
      tsp(node.right, target, root);
  }