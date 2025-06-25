public class CustomQueue{
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int end=0;

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size){
        this.data = new int [size];
    }
    public boolean isFull(){
        if(end==data.length){
            System.out.println("Queue is full");
        }
        return false;
    }
    public boolean isEmpty(){
        if(end==0){
            System.out.println("Stack is empty");
        }
        return false;
    }
    public boolean insert(int item){
        if(isFull()){
            System.out.println("Stack is full");
        }
        data[end] = item;
        end ++;
        return true;
    }
    public int delete() throws Exception{
        if(isEmpty()){
            throw new Exception("queue is empty");
        }
        int removed = data[0];

        for(int i=1;i<end;i++){
            data[i-1]=data[i];
        }
        end --;
        return removed;
    }
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("queue is empty");
        }
        return data[0];
    }
    public void display(){
        for(int i=0;i<data.length;i++){
            System.out.print(data[i] + " <-- ");
        }
        System.out.println("END");
    }

    public static void main(String[] args) throws Exception{
        CustomQueue queue = new CustomQueue(6);
        queue.insert(6);
        queue.insert(7);
        queue.insert(8);
        queue.insert(9);
        queue.insert(10);
        queue.insert(11);
        queue.display();
        System.out.println(queue.delete());
        queue.display();
    }
}