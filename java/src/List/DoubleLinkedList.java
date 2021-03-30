package List;

public class DoubleLinkedList <T> extends SimpleLinkedList <T> {
  public DoubleLinkedList () {
    super();
  }

  public DoubleLinkedList (T[] array) {
    super();
    for (int i = 0; i < array.length; i++) {
      this.insertEnd(array[i]);
    }
  }

  @Override
  public void insertBegin (T data) {
    this.insert(data, 0);
  }

  @Override
  public void insertEnd (T data) {
    this.insert(data, this.length);
  }

  @Override
  public void insert (T data, Integer index) {
    if (index < 0 || index > this.length)
      System.out.println("index out of range, it'll be modified to the nearest value");
    Node <T> newNode = new Node <> (data);
    if (this.isEmpty()) {
      this.root = newNode;
      this.tail = this.root;
    } else if (index <= 0) {
      this.root.previous = newNode;
      newNode.next = this.root;
      this.root = newNode;
    } else if (index >= this.length) {
      newNode.previous = this.tail;
      this.tail.next = newNode;
      this.tail = newNode;
    } else {
      Node <T> currentNode = this.root;
      for (int i = 1; i < index; i++)
        currentNode = currentNode.next;
      newNode.next = currentNode.next;
      newNode.previous = currentNode;
      currentNode.next.previous = newNode;
      currentNode.next = newNode;
    }
    this.length++;
  }

  @Override
  public Node <T> deleteBegin () {
    return this.delete (0);
  }

  @Override
  public Node <T> deleteEnd () {
    return this.delete (this.length - 1);
  }
  
  @Override
  public Node <T> delete (Integer index) {
    Node <T> returnNode = null;
    if (this.isEmpty()) {
      System.err.println("Error, empty List");
    } else {
      if (index < 0 || index >= this.length)
        System.out.println("index out of range, it'll be modified to the nearest value");
      if (index <= 0) {
        returnNode = this.root;
        this.root = this.root.next;
        if (this.length > 1)
          this.root.previous = null;
      } else if (index >= this.length - 1) {
        this.tail.previous.next = null;
      } else {
        Node <T> currentNode = this.root;
        for (int i = 1; i < index; i++)
          currentNode = currentNode.next;
        returnNode = currentNode.next;
        currentNode.next = currentNode.next.next;
        currentNode.next.previous = currentNode;
      }
      this.length--;
      if (this.length == 0)
        makeEmpty();
    }
    return returnNode;
  }

  @Override
  public String toString () {
    if (this.isEmpty())
      return "Empty List";
    StringBuilder sb = new StringBuilder();
    sb.append("[");
    Node <T> aux = this.root;
    while (aux != null){
      sb.append(aux.data);
      sb.append(" <--> ");
      aux = aux.next;
    }
    String toReturn = sb.toString();
    toReturn = toReturn.substring(0, sb.length() - 6);
    return toReturn + "]";
  }
}