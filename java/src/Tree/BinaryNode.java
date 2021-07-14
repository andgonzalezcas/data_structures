package Tree;

public class BinaryNode <T> {
  T data;
  int key;
  BinaryNode<T> left;
  BinaryNode<T> right;

  public BinaryNode(int key, T data){
    this.key = key;
    this.data = data;
    this.left = null;
    this.right = null;
  }

  public T getData() { return this.data; }
  public int getKey() { return this.key; }
}