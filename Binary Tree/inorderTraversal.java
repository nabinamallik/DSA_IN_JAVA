import Java.util.ArrayList;

class Node{
    int data;
    Node left, right;

    Node(int item){
        data = item;
        left = right = null;
    }
}

class Solution{
    ArrayList<Interger> inOrder(Node root){
        ArrayList<Interger> list = new ArrayList<>();
        if(root != null){
            inOrderHelper(root, list);
        }
        return list;

    }

    private void inOrderHelper(Node node, ArrayList<Interger> list){
        if(node != null){    
            inOrderHelper(node.left, list);    
            list.add(node.data);    
            inOrderHelper(node.right, list);    
        }    
    }        
}

public class inOrder{
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Solution solution = new Solution();

        ArrayList<Interger> inorderlist = solution.inOrder(root);

        System.out.println("Inorder Traversal: ");
        for(int i : inorderlist){
            System.out.print(i + "");
        }
    }
}