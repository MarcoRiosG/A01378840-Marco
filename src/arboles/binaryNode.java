/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

/**
 *
 * @author marki
 */
public class binaryNode {
    public int value;
    
    public binaryNode leftChild;
    public binaryNode rightchild;
    
    public binaryNode(int value){
        this.value=value;
        leftChild=null;
        rightchild=null;
    }
    
    
    public void preorderTraversal(){
        preorder(this);
    }
    
    public void inorderTraversal(){
        inorder(this);
    }
    
    public void postorderTraversal(){
        postorder(this);
    }
    
    public void depthfirstTraversal(){
        Queue<binaryNode> fila = new Queue<binaryNode>();
        fila.offer(this);
        
        while(!fila.isEmpty()){
            if(fila.element().leftChild==null){
                if(fila.element().rightchild==null){
                    System.out.print(fila.remove().value);
                } else{
                    fila.offer(fila.element().rightchild);
                    System.out.print(fila.remove().value);
                }
            } else{
                fila.offer(fila.element().leftChild);
                if(fila.element().rightchild==null){
                    System.out.print(fila.remove().value);
                } else{
                    fila.offer(fila.element().rightchild);
                    System.out.print(fila.remove().value);
                }
            }
            /*fila.offer(fila.element().leftChild);
            fila.offer(fila.element().rightchild);
            System.out.print(fila.remove().value);*/
            
        }
        
    }
    
    private void preorder(binaryNode node){
        System.out.print(node.value);
        if(node.leftChild==null){
            if(node.rightchild==null){
                return;
            } else {
                preorder(node.rightchild);
            }
        } else {
            preorder(node.leftChild);
            if(node.rightchild==null){
                return;
            } else {
                preorder(node.rightchild);
            }
        }
        
    }
    
    private void inorder(binaryNode node){
        if(node.leftChild==null){
            System.out.print(node.value);
            if(node.rightchild==null){
                return;
            } else{
                inorder(node.rightchild);
            }
        } else {
            inorder(node.leftChild);
            System.out.print(node.value);
            if(node.rightchild==null){
                return;
            } else {
                inorder(node.rightchild);
            }
        }
    }
    
    private void postorder(binaryNode node){
        if(node.leftChild==null){
            if(node.rightchild==null){
                System.out.print(node.value);
                return;
            } else{
                postorder(node.rightchild);
                System.out.print(node.value);
            }
        } else {
            postorder(node.leftChild);
            if(node.rightchild==null){
                System.out.print(node.value);
                return;
            } else{
                postorder(node.rightchild);
                System.out.print(node.value);
            }
        }
        
    }
    
    public static void main(String args[]){
        binaryNode root=new binaryNode(4);
        binaryNode node1=new binaryNode(1);
        binaryNode node2=new binaryNode(2);
        binaryNode node3=new binaryNode(3);
        binaryNode node5=new binaryNode(5);
        binaryNode node6=new binaryNode(6);
        binaryNode node7=new binaryNode(7);
        binaryNode node8=new binaryNode(8);
        
        root.leftChild=node2;
        root.rightchild=node5;
        node2.leftChild=node1;
        node2.rightchild=node3;
        node5.rightchild=node7;
        node7.leftChild=node6;
        node7.rightchild=node8;
        
        root.preorderTraversal();
        System.out.println();
        root.inorderTraversal();
        System.out.println();
        root.postorderTraversal();
        System.out.println();
        root.depthfirstTraversal();
        System.out.println();
    }
}
