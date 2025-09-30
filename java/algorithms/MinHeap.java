package algorithms;

public class MinHeap {
    private int[] heap;
    private int size;

    public MinHeap(int capacity) {
        heap = new int[capacity];
        size = 0;
    }

    private int parent(int i) { return (i-1)/2; }
    private int left(int i) { return 2*i+1; }
    private int right(int i) { return 2*i+2; }

    public void insert(int val) {
        if (size == heap.length) return;
        heap[size] = val;
        int i = size;
        size++;
        while (i > 0 && heap[parent(i)] > heap[i]) {
            int tmp = heap[i];
            heap[i] = heap[parent(i)];
            heap[parent(i)] = tmp;
            i = parent(i);
        }
    }

    public int extractMin() {
        if (size <= 0) return Integer.MIN_VALUE;
        int root = heap[0];
        heap[0] = heap[size-1];
        size--;
        heapify(0);
        return root;
    }

    private void heapify(int i) {
        int l = left(i);
        int r = right(i);
        int smallest = i;
        if (l < size && heap[l] < heap[smallest]) smallest = l;
        if (r < size && heap[r] < heap[smallest]) smallest = r;
        if (smallest != i) {
            int tmp = heap[i];
            heap[i] = heap[smallest];
            heap[smallest] = tmp;
            heapify(smallest);
        }
    }
}
