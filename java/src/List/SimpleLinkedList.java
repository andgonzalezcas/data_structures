package List;

import java.util.Arrays;

public class SimpleLinkedList <T> {
  Node<T> root;
  Node<T> tail;
  Integer length;

  public SimpleLinkedList () {
    this.makeEmpty();
  }
  
  public SimpleLinkedList (T[] array) {
    this.makeEmpty();
    for (int i = 0; i < array.length; i++) {
      this.insertEnd(array[i]);
    }
  }

  void makeEmpty () {
    this.length = 0;
    this.root = null;
    this.tail = null;
  }
  
  public Integer getLength () {
    return this.length;
  }

  public boolean isEmpty () {
    return (this.root == null);
  }

  public void insertBegin (T data) {
    this.insert(data, 0);
  }

  public void insertEnd (T data) {
    this.insert(data, this.length);
  }

  public void insert (T data, Integer index) {
    if (index < 0 || index > this.length)
      System.out.println("index out of range, it'll be modified to the nearest value");
    Node <T> newNode = new Node <> (data);
    if (this.isEmpty()) {
      this.root = newNode;
      this.tail = this.root;
    } else if (index <= 0) {
      newNode.next = this.root;
      this.root = newNode;
    } else if (index >= this.length) {
      this.tail.next = newNode;
      this.tail = newNode;
    } else {
      Node <T> currentNode = this.root;
      for (int i = 1; i < index; i++)
        currentNode = currentNode.next;
      newNode.next = currentNode.next;
      currentNode.next = newNode;
    }
    this.length++;
  }

  public Node <T> deleteBegin () {
    return this.delete (0);
  }

  public Node <T> deleteEnd () {
    return this.delete (this.length - 1);
  }
  
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
      } else if (index >= this.length) {
        index = this.length - 1;
      } else {
        Node <T> currentNode = this.root;
        for (int i = 1; i < index; i++)
          currentNode = currentNode.next;
        returnNode = currentNode.next;
        currentNode.next = currentNode.next.next;
      }
      this.length--;
      if (this.length == 0)
        this.makeEmpty();
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
      sb.append(" --> ");
      aux = aux.next;
    }
    String toReturn = sb.toString();
    toReturn = toReturn.substring(0, sb.length() - 5);
    return toReturn + "]";
  }

  public Integer[] find (T data) {
    Integer[] indexArray = {};
    if (this.isEmpty()) {
      System.err.println("Error, empty List");
    } else {
      Node <T> currentNode = this.root;
      if (currentNode.data == data){
        indexArray = Arrays.copyOf(indexArray, indexArray.length + 1);
        indexArray[indexArray.length - 1] = 0;
      }
      for (int i = 1; i < this.length; i++) {
        currentNode = currentNode.next;
        if (currentNode.data == data){
          indexArray = Arrays.copyOf(indexArray, indexArray.length + 1);
          indexArray[indexArray.length - 1] = i;
        }
      }
    }
    return indexArray;
  }

  public Node <T> getRoot () {
    return this.root;
  }

  public Node <T> getTail () {
    return this.tail;
  }

  public Node <T> readNode (int index) { 
    if (index < 0 || index >= this.length) {
      System.err.println("Search out of range");
      return null;
    }
    Node <T> currentNode = this.root;
    for (int i = 0; i < index; i++)
    currentNode = currentNode.next;
    return currentNode;
  }

  public T readData (int index) {
    return this.readNode(index).data;
  }
}
