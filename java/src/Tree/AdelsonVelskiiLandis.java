package Tree;

public class AdelsonVelskiiLandis<T> extends BinarySearchTree<T>{
  public AdelsonVelskiiLandis () { super(); }

  public int getBalance(BinaryNode<T> auxNode) {
    return (auxNode == null) ? 0 : super.height_recursive(auxNode.right) - super.height_recursive(auxNode.left);
  }

  @Override
  public void insert (int key, T data) { this.root = this.insert_recursive(this.root, key, data); }
  @Override
  public BinaryNode<T> insert_recursive(BinaryNode<T> auxNode, int key, T data) {
    if (auxNode == null)
      return auxNode = new BinaryNode<T>(key, data);
    if (key < auxNode.getKey())
      auxNode.left = this.insert_recursive(auxNode.left, key, data); 
    else if (key > auxNode.getKey())
      auxNode.right = this.insert_recursive(auxNode.right, key, data); 
    return this.balance(auxNode);
  }

  @Override
  public void remove (int key) { this.root = this.remove_recursive(this.root, key); }
  @Override
  public BinaryNode<T> remove_recursive(BinaryNode<T> auxNode, int key) {
    if (auxNode == null) return auxNode;
    if (key < auxNode.key)
      auxNode.left = this.remove_recursive(auxNode.left, key);
    else if (key > auxNode.key)
      auxNode.right = this.remove_recursive(auxNode.right, key);
    else {
      if (auxNode.left == null) 
        return this.balance(auxNode.right);
      else if (auxNode.right == null) 
        return this.balance(auxNode.left);
      BinaryNode<T> auxRemove = super.findMin_recursive(auxNode.right);
      auxNode.key = auxRemove.getKey();
      auxNode.data = auxRemove.getData();
      auxNode.right = this.remove_recursive(auxNode.right, auxNode.key); 
    } 
    return this.balance(auxNode);
  }

  public BinaryNode<T> balance(BinaryNode<T> auxNode) {
    int balance = getBalance(auxNode);
    if (balance > 1) {
      if (this.height_recursive(auxNode.right.right) > this.height_recursive(auxNode.right.left))
        auxNode = leftSingleRotate(auxNode);
      else
        auxNode = lrDoubleRotation(auxNode);
    } else if (balance < -1) {
      if (this.height_recursive(auxNode.left.left) > this.height_recursive(auxNode.left.right))
        auxNode = rightSingleRotate(auxNode);
      else
        auxNode = rlDoubleRotation(auxNode);
    }
    return auxNode;
  }

  public BinaryNode<T> rightSingleRotate(BinaryNode<T> auxNode) {
    BinaryNode<T> auxLeft = auxNode.left;
    BinaryNode<T> auxRight = auxLeft.right;
    auxNode.left = auxRight;
    auxLeft.right = auxNode;
    return auxLeft;
  }

  public BinaryNode<T> leftSingleRotate(BinaryNode<T> auxNode) {
    BinaryNode<T> auxRight = auxNode.right;
    BinaryNode<T> auxLeft = auxRight.left;
    auxNode.right = auxLeft;
    auxRight.left = auxNode;
    return auxRight;
  }

  public BinaryNode<T> rlDoubleRotation(BinaryNode<T> auxNode) {
    auxNode.left = this.leftSingleRotate(auxNode.left);
    return auxNode = this.rightSingleRotate(auxNode);
  }

  public BinaryNode<T> lrDoubleRotation(BinaryNode<T> auxNode) {
    auxNode.right = this.rightSingleRotate(auxNode.right);
    return auxNode = this.leftSingleRotate(auxNode);
  }
}