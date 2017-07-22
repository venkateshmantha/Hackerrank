boolean checkBST(Node root) {
        if(root==null)
            return true;
        return helper(root.left,Integer.MIN_VALUE,root.data-1) && helper(root.right,root.data+1,Integer.MAX_VALUE);
    }

    public boolean helper(Node node, int min, int max){
        if(node==null)
            return true;
        if(node.data<min || node.data>max)
            return false;
        return helper(node.left,min,node.data-1) && helper(node.right,node.data+1,max);
    }