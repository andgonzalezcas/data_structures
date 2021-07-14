import List.*;
import Tree.*;

public class App {
  public static void MySLL () { // Este es el ejemplo de la Simple Linked List
    SimpleLinkedList <Integer> MyList = new SimpleLinkedList <> ();
    System.out.println(MyList.isEmpty());
    MyList.insertBegin(1);
    System.out.println(MyList.isEmpty());
    System.out.println(MyList.toString());
    MyList.insertEnd(3);
    System.out.println(MyList.isEmpty());
    System.out.println(MyList.toString());
    MyList.insert(2, 1);
    System.out.println(MyList.isEmpty());
    System.out.println(MyList.toString());
    MyList.insertBegin(0);
    System.out.println(MyList.isEmpty());
    System.out.println(MyList.toString());

    System.out.println("Length: " + MyList.getLength());
    System.out.println("Root: " + MyList.getRoot());
    System.out.println("Root_data: " + MyList.getRoot().getData());
    System.out.println("Tail: " + MyList.getTail());
    System.out.println("Tail_data: " + MyList.getTail().getData());

    MyList.insert(3, 2);
    System.out.println(MyList.toString());
    Integer[] indexArray = MyList.find(3);
    for (int i = 0; i < indexArray.length; i++)
      System.out.println(indexArray[i]);
    
    MyList.delete(2);
    System.out.println(MyList.toString());

    System.out.println("Data index 2: " + MyList.readData(2));

    MyList.deleteEnd();
    System.out.println(MyList.isEmpty());
    System.out.println(MyList.toString());
    MyList.delete(1);
    System.out.println(MyList.isEmpty());
    System.out.println(MyList.toString());
    MyList.deleteBegin();
    System.out.println(MyList.isEmpty());
    System.out.println(MyList.toString());
    MyList.deleteBegin();
    System.out.println(MyList.isEmpty());
    System.out.println(MyList.toString());

    String[] fruits = {"apple", "Banana", "Pineapple"};
    SimpleLinkedList <String> MyList2 = new SimpleLinkedList <> (fruits);
    System.out.println(MyList2.toString());
  }

  public static void MyDLL () {// Este es el ejemplo de la Double Linked List
    DoubleLinkedList <Integer> MyList = new DoubleLinkedList <> ();
    System.out.println(MyList.toString());
    System.out.println(MyList.isEmpty());
    MyList.insertBegin(1);
    System.out.println(MyList.isEmpty());
    System.out.println(MyList.toString());
    MyList.insertEnd(3);
    System.out.println(MyList.isEmpty());
    System.out.println(MyList.toString());
    MyList.insert(2, 1);
    System.out.println(MyList.isEmpty());
    System.out.println(MyList.toString());
    MyList.insertBegin(0);
    System.out.println(MyList.isEmpty());
    System.out.println(MyList.toString());

    System.out.println("Length: " + MyList.getLength());
    System.out.println("Root: " + MyList.getRoot());
    System.out.println("Root_data: " + MyList.getRoot().getData());
    System.out.println("Tail: " + MyList.getTail());
    System.out.println("Tail_data: " + MyList.getTail().getData());

    MyList.insert(3, 2);
    System.out.println(MyList.toString());
    Integer[] indexArray = MyList.find(3);
    for (int i = 0; i < indexArray.length; i++) {
      System.out.println(indexArray[i]);
    }
    MyList.delete(2);
    System.out.println(MyList.toString());

    System.out.println("Data index 2: " + MyList.readData(2));

    MyList.deleteEnd();
    System.out.println(MyList.isEmpty());
    System.out.println(MyList.toString());
    MyList.delete(1);
    System.out.println(MyList.isEmpty());
    System.out.println(MyList.toString());
    MyList.deleteBegin();
    System.out.println(MyList.isEmpty());
    System.out.println(MyList.toString());
    MyList.deleteBegin();
    System.out.println(MyList.isEmpty());
    System.out.println(MyList.toString());

    String[] fruits = {"apple", "Banana", "Pineapple"};
    DoubleLinkedList <String> MyList2 = new DoubleLinkedList <> (fruits);
    System.out.println(MyList2.toString());
  }

  public static void MyStk () { // Este es el ejemplo de la Stack
    Stack <Integer> myStack = new Stack <> ();
    System.out.println(myStack.isEmpty());
    myStack.push(3);
    System.out.println(myStack.toString());
    System.out.println(myStack.isEmpty());
    myStack.push(2);
    System.out.println(myStack.toString());
    System.out.println(myStack.isEmpty());
    myStack.push(1);
    System.out.println(myStack.toString());
    System.out.println(myStack.isEmpty());
    System.out.println("Length --> "+myStack.size());
    System.out.println("Peek --> "+myStack.peek());
    System.out.println("Peek.data --> "+myStack.peek().getData());
    myStack.pop();
    System.out.println(myStack.toString());
    System.out.println(myStack.isEmpty());
    myStack.pop();
    System.out.println(myStack.toString());
    System.out.println(myStack.isEmpty());
    myStack.pop();
    System.out.println(myStack.toString());
    System.out.println(myStack.isEmpty());
  }

  public static void MyQue () { // Este es el ejemplo de la Queue
    Queue <Integer> myQueue = new Queue <> ();
    System.out.println(myQueue.isEmpty());
    myQueue.enQueue(1);
    System.out.println(myQueue.toString());
    System.out.println(myQueue.isEmpty());
    myQueue.enQueue(2);
    System.out.println(myQueue.toString());
    System.out.println(myQueue.isEmpty());
    myQueue.enQueue(3);
    System.out.println(myQueue.toString());
    System.out.println(myQueue.isEmpty());
    System.out.println("Length --> "+myQueue.size());
    System.out.println("Peek --> "+myQueue.peek());
    System.out.println("Peek.data --> "+myQueue.peek().getData());
    myQueue.deQueue();
    System.out.println(myQueue.toString());
    System.out.println(myQueue.isEmpty());
    myQueue.deQueue();
    System.out.println(myQueue.toString());
    System.out.println(myQueue.isEmpty());
    myQueue.deQueue();
    System.out.println(myQueue.toString());
    System.out.println(myQueue.isEmpty());
  }

  public static void MyBts () {
    BinarySearchTree<String> myBts = new BinarySearchTree<>();
    myBts.insert(15, "");
    myBts.insert(9, "");
    myBts.insert(6, "");
    myBts.insert(14, "");
    myBts.insert(13, "");
    myBts.insert(20, "");
    myBts.insert(17, "");
    myBts.insert(64, "");
    myBts.insert(26, "");
    myBts.insert(72, "");
    myBts.remove(20);
    myBts.inorder();
    System.out.println();
    myBts.preorden();
    System.out.println();
  }

  public static void MyAvl () {
    AdelsonVelskiiLandis<String> myAvl = new AdelsonVelskiiLandis<>();
    myAvl.insert(1, "");
    myAvl.preorden();
    System.out.println();
    myAvl.insert(2, "");
    myAvl.preorden();
    System.out.println();
    myAvl.insert(3, "");
    myAvl.preorden();
    System.out.println();
    myAvl.insert(4, "");
    myAvl.preorden();
    System.out.println();
    myAvl.insert(5, "");
    myAvl.preorden();
    System.out.println();
    myAvl.insert(6, "");
    myAvl.preorden();
    System.out.println();
    myAvl.insert(7, "");
    myAvl.preorden();
    System.out.println();
    myAvl.insert(8, "");
    myAvl.preorden();
    System.out.println();
    myAvl.insert(9, "");
    myAvl.preorden();
    System.out.println();
    myAvl.insert(10, "");
    myAvl.preorden();
    System.out.println();
    myAvl.insert(11, "");
    myAvl.preorden();
    System.out.println();
    myAvl.insert(12, "");
    myAvl.preorden();
    System.out.println();
    myAvl.insert(13, "");
    myAvl.preorden();
    System.out.println();
    myAvl.inorder();
    System.out.println();
    myAvl.remove(8);
    myAvl.remove(6);
    myAvl.preorden();
    System.out.println();
    myAvl.inorder();
    System.out.println();
  }

  public static void main(String[] args) throws Exception {
    /* System.out.println("______________Simple Linked List______________");
    MySLL();
    System.out.println("______________Double Linked List______________");
    MyDLL(); */
    /* System.out.println("____________________Stack_____________________");
    MyStk();
    System.out.println("____________________Queue_____________________");
    MyQue(); */
    System.out.println("___________________BST-Tree___________________");
    MyBts();
    System.out.println("___________________AVL-Tree___________________");
    MyAvl();
  }
}
