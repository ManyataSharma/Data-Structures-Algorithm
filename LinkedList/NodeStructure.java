


class LinkedList{
    private Node head;
    private Node tail;
    private int size;
    public LinkedList(){
        this.size=0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail==null){
            tail = head;
        }
        size +=1;
    }

    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size ++;
    }

    public void insert(int val,int index){
        if (index==0){
            insertFirst(val);
            return;
        }
        if(index ==size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i=0; i<index; i++){
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
            temp.next = node;
            size++;
    }

    public void insertRec(int val, int index){
        head = insertRecHelper(head, val, index);
    }
    public Node insertRecHelper(Node head, int val, int index){
        if(index==0){
            Node node = new Node(val);
            node.next=head;
            return node;
        }
        head.next = insertRecHelper(head.next,val, index-1);
        return head;
    }


public int DeleteFirst(){
    int val = head.value;
    head = head.next;
    if(head==null){
        tail=null;
    }
    size --;
    return val;
}
public int DeleteLast(){
    if(size<=1){
        return DeleteFirst();
    }
    Node secondLast = get(size-2);
    int val = tail.value;
    tail = secondLast;
    tail.next = null;
    size --;
    return val;
}

public int delete(int index){
    if(index==0){
        return DeleteFirst();
    }
    if(index == size-1){
        return DeleteLast();
    }
    Node prev = get(index - 1);
    int val = prev.next.value;

    prev.next = prev.next.next;
    size --;
    return val;
}

public Node get(int index){
    Node node = head;
    for(int i=0;i<index;i++){
        node = node.next;
    }
    return node;
}
public Node find(int value){
    Node node = head;
    while(node!=null){
        if(node.value == value){
            return node;
        }
        node = node.next;
    }
    return null;
}

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + " --> ");
            temp=temp.next;
        }
        System.out.println("END");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
            this.next=null;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }

    // QUESIONS ON LINKED LIST
    // QUESTION 1
 public void duplicates(){
    Node node = head;
    while(node.next!=null){
        if(node.value==node.next.value){
            node.next=node.next.next;
            size --;
        }else{
            node = node.next;
        }
    }
        tail=node;
        tail.next=null;
    }
    // QUESTION 2
    public static LinkedList merge (LinkedList first, LinkedList second){
        Node f = first.head;
        Node s = second.head;

        LinkedList ans = new LinkedList();
        while(f!=null && s!=null){
            if(f.value < s.value){
                ans.insertLast(f.value);
                f = f.next;
            }else{
                ans.insertLast(s.value);
                s = s.next;
            }
        }
        while(f!=null){
            ans.insertLast(f.value);
            f = f.next;
        }
        while(s!=null){
            ans.insertLast(s.value);
            s = s.next;
        }
        return ans;
    }
    //QUESTION 3
    public boolean hasCycle(Node head) {
         Node fast = head;
         Node slow = head;
         while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
         }
         return false;
    }
    // QUESTION 4
    public boolean isHappy(int n){
        int slow = n;
        int fast = n;
        do { 
            slow = FindSquare(slow);
            fast = FindSquare(FindSquare(fast));
        } while (slow!=fast);

        if(slow==1){
            return true;
        }
        return false;

    }
    private int FindSquare(int number){
        int ans = 0;
        while(number >0){
            int rem = number % 10;
            ans = ans + rem * rem;
            number = number /10;
        }
        return ans;
    }
     }

public class NodeStructure{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(4);
        list.insertLast(4);

        list.display();
        list.duplicates();
        list.display();
    }
}