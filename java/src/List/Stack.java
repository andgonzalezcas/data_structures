package List;

public class Stack <T> extends SimpleLinkedList <T> {
  public Stack () { super(); }
  public void push( T data ) { super.insertBegin(data); }
  public Node <T> pop () { return super.deleteBegin(); }
  public Node <T> peek () { return super.getRoot(); }
  public Integer size() { return super.getLength(); }
  @Override
  public boolean isEmpty() { return super.isEmpty(); }

  @Override
  public String toString () {
    if (this.isEmpty())
      return "TOP | Empty Stack ]";
    StringBuilder sb = new StringBuilder();
    sb.append("TOP | ");
    Node <T> aux = this.root;
    while (aux != null){
      sb.append(aux.data);
      sb.append(" | ");
      aux = aux.next;
    }
    String toReturn = sb.toString();
    toReturn = toReturn.substring(0, sb.length() - 3);
    return toReturn + " ]";
  }
}
