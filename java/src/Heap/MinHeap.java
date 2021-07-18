package Heap;

public class MinHeap<T> extends Heap<T>{
  public MinHeap (int maxsize) { super(maxsize); this.Heap[0] = Integer.MIN_VALUE; }

  public void enQueue(int element) {
    this.Heap[++this.size] = element;
    int current = this.size;
    while (this.Heap[current] < this.Heap[super.parent(current)]) {
      super.swap(current, super.parent(current));
      current = super.parent(current);
    }
  }
  
  public int deQueue() {
    int popped = this.Heap[1];
    this.Heap[1] = this.Heap[this.size--];
    this.minHeapify(1);
    return popped;
  }

  private void minHeapify(int pos) {
    if (pos>(this.size/2) && pos<=this.size)
      return;
    if (this.Heap[pos]>this.Heap[super.leftChild(pos)] 
      || this.Heap[pos]>this.Heap[super.rightChild(pos)]) {
      if (this.Heap[super.leftChild(pos)] < this.Heap[super.rightChild(pos)]) {
        super.swap(pos, super.leftChild(pos));
        this.minHeapify(super.leftChild(pos));
      } else {
        super.swap(pos, super.rightChild(pos));
        this.minHeapify(super.rightChild(pos));
      }
    }
  }
}
