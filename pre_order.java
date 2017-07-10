void preOrder(Node root) {
    
    if(root.left == null && root.right == null){
        System.out.print(root.data + " ");
    }
    else{
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

}
