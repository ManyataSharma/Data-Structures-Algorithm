public class CustomStack{
      protected int[] data;
      private static final int DEFAULT_SIZE = 10;
      int ptr = -1;

      public CustomStack(){
        this(DEFAULT_SIZE);
      }
      public CustomStack(int size){
        this.data = new int[size];
      }

      public boolean push(int item){
        if(isFull()){
            System.out.println("cannot push stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
      }

      public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("cannot pop stack is empty");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
      }

      public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("cannot return the top most element stack is empty");
        }
        return data[ptr];
      }

      public boolean isFull(){
        return ptr == data.length-1;
      }

      public boolean isEmpty(){
        return ptr == -1;
      }

    public static void main(String[] args) throws StackException {
        CustomStack stack = new CustomStack(8);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.pop());
        System.out.println(stack.pop());

}
}