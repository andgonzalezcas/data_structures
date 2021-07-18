package Heap;
//se utilizo al guia de geek for geeks para realizar esta estructura de datos c:

public class Heap<T> {
  public int[] Heap;
  public int size;
  public int maxsize;

  public Heap(int maxsize) {
    this.maxsize = maxsize;
    this.size = 0;
    this.Heap = new int[this.maxsize + 1];
  }

  public int parent(int pos) { return pos / 2; }
  public int leftChild(int pos) { return (2 * pos); }
  public int rightChild(int pos) { return (2 * pos) + 1; }

  public void swap(int fpos, int spos) {
    int tmp = this.Heap[fpos];
    this.Heap[fpos] = this.Heap[spos];
    this.Heap[spos] = tmp;
  }

  public void print() {
    for (int i = 1; i <= this.size / 2; i++){
      System.out.print(" Node : " + this.Heap[i]);
      if(this.size >= 2*i)
        System.out.print(" left : " + this.Heap[2*i]);
      if(this.size >= 2*i+1)
        System.out.print(" right :" + this.Heap[2*i+1]);
      System.out.println();
    }
  }
}
