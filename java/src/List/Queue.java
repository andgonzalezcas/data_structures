package List;

public class Queue <T> extends DoubleLinkedList <T> {
  public Queue () { super(); }
  public void enQueue ( T data ) { super.insertEnd(data); }
  public Node<T> deQueue() { return super.deleteBegin(); }
  public Node<T> peek() { return super.getRoot(); }
  public Integer size() { return super.getLength(); }
  @Override
  public boolean isEmpty() { return super.isEmpty(); }
  @Override
  public String toString () {
    if (this.isEmpty())
      return "FRONT <-- Empty Queue <-- REAR";
    StringBuilder sb = new StringBuilder();
    sb.append("FRONT <-- ");
    Node <T> aux = this.root;
    while (aux != null){
      sb.append(aux.data);
      sb.append(" <-- ");
      aux = aux.next;
    }
    String toReturn = sb.toString();
    toReturn = toReturn.substring(0, sb.length() - 5);
    return toReturn + " <-- REAR";
  }
}
