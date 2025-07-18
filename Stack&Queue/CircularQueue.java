public class CircularQueue{
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    protected int front=0;
    protected int end=0;
    protected int size=0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size){
        this.data = new int[size];
    }
    public boolean isFull(){
        return size == data.length;
    }
    public boolean isEmpty(){
        return size ==0;
    }
    public boolean insert(int item){
        if(isFull()){
            System.out.println("Queue is full");
        }
        data[end] = item;
        end ++;
        end = end%data.length;
        size++;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        int removed = data[front ++];
        front = front%data.length;
        size--;
        return removed;
    }
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[front];
    }
    public void display(){
        if(isEmpty()){
            System.out.println("EMPTY");
            return;
        }
        int i=front;
        do { 
            System.out.print(data[i] + " --> ");
            i++;
            i%= data.length;
        } while (i!=end);
        System.out.println("END");
    }

    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue(6);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.display();
        System.out.println(queue.remove());
        queue.insert(99);
        queue.display();
    }
}