import List.*;

public class App {

  public static void MySLL () {
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
    SimpleLinkedList <String> MyList2 = new SimpleLinkedList <> (fruits);
    System.out.println(MyList2.toString());
  }

  public static void MyDLL () {
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
  public static void main(String[] args) throws Exception {
    System.out.println("______________Simple Linked List______________");
    MySLL();
    System.out.println("______________Double Linked List______________");
    MyDLL();
  }
}
