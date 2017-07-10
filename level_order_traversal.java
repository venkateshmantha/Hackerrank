 void levelOrder(Node root) {
       if(root==null)
           return;
       Queue<Node> q = new LinkedList();
       q.add(root);
       while(!q.isEmpty()){
           Node tmp = q.poll();
           System.out.print(tmp.data + " ");
           if(tmp.left!=null)
               q.add(tmp.left);
           if(tmp.right!=null)
               q.add(tmp.right);
       } 
    }