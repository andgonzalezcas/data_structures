package Tree;

public class BinarySearchTree <T>{
  public BinaryNode<T> root;
  public BinarySearchTree() { this.root = null; }

  public void makeEmpty() { this.root = null; }
  public boolean isEmpty() { return this.root == null; }

  public void insert (int key, T data) { this.root = this.insert_recursive(this.root, key, data); }
  public BinaryNode<T> insert_recursive(BinaryNode<T> auxNode, int key, T data) {
    if (auxNode == null)
      return auxNode = new BinaryNode<T>(key, data);
    if (key < auxNode.getKey())
      auxNode.left = this.insert_recursive(auxNode.left, key, data); 
    else if (key > auxNode.getKey())
      auxNode.right = this.insert_recursive(auxNode.right, key, data); 
    return auxNode;
  }

  public void remove (int key) { this.remove_recursive(this.root, key); }
  public BinaryNode<T> remove_recursive(BinaryNode<T> auxNode, int key) {
    if (auxNode == null) return auxNode;
    if (key < auxNode.key)
      auxNode.left = this.remove_recursive(auxNode.left, key);
    else if (key > auxNode.key)
      auxNode.right = this.remove_recursive(auxNode.right, key);
    else {
      if (auxNode.left == null) 
        return auxNode.right;
      else if (auxNode.right == null) 
        return auxNode.left;
      BinaryNode<T> auxRemove = this.findMin_recursive(auxNode.right);
      auxNode.key = auxRemove.getKey();
      auxNode.data = auxRemove.getData();
      auxNode.right = this.remove_recursive(auxNode.right, auxNode.key); 
    } 
    return auxNode;
  }

  public BinaryNode<T> findMin(){ return this.findMin_recursive(this.root); }
  public BinaryNode<T> findMin_recursive(BinaryNode<T> auxNode){
    if(auxNode == null){
      System.out.println("Empty Tree");
      return null;
    }
    if(auxNode.left == null)
      return auxNode;
    return this.findMin_recursive(auxNode.left);
  }

  public BinaryNode<T> findMax(){ return this.findMax_recursive(this.root); }
  public BinaryNode<T> findMax_recursive(BinaryNode<T> auxNode){
    if(auxNode == null){
      System.out.println("Empty Tree");
      return null;
    }
    if(auxNode.right == null)
      return auxNode;
    return this.findMax_recursive(auxNode.right);
  }

  public int height(){ return this.height_recursive(this.root); }
  public int height_recursive(BinaryNode<T> auxNode){
    if(auxNode == null)
      return -1;
    else
      return 1 + Math.max(this.height_recursive(auxNode.left), this.height_recursive(auxNode.right));
  }

  public boolean contains(int key){ return contains_recursive(key, this.root); }
  private boolean contains_recursive(int key, BinaryNode<T> auxNode) {
    if(auxNode == null) return false;
    if(key < auxNode.getKey()) return this.contains_recursive(key, auxNode.left);
    else if (key > auxNode.getKey()) return this.contains_recursive(key, auxNode.right);
    else return true;
  }

  public void inorder() { System.out.print("inorder: "); inorder_recursive(root); } 
  public void inorder_recursive(BinaryNode<T> auxNode) { 
    if (auxNode != null) { 
      inorder_recursive(auxNode.left); 
      System.out.print(auxNode.key + " "); 
      inorder_recursive(auxNode.right); 
    } 
  }

  public void preorden() { System.out.print("preorder: "); preorden_recursive(root); } 
  public void preorden_recursive(BinaryNode<T> auxNode) { 
    if (auxNode != null) { 
      System.out.print(auxNode.key + " "); 
      preorden_recursive(auxNode.left); 
      preorden_recursive(auxNode.right); 
    } 
  }
}