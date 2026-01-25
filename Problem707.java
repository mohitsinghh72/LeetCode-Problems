class MyLinkedList {
    private Node head;
    private Node tail;
    int size;

    class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }
    }

    public MyLinkedList() {
        this.size = 0;

    }

    public int get(int index) {
        if(index < 0 || index >= size) return -1;
        int i = 0;
        Node temp = head;
        while(i<index){
            temp = temp.next;
            i++;
        }
        return temp.val;

    }

    public void addAtHead(int val) {
        if(head == null){
            Node node = new Node(val);
            head = node;
            tail = node;
            size++;
            return;
        }
        Node node = new Node(val);
        node.next = head;
        head = node;
        size++;

    }

    public void addAtTail(int val) {
        if(head == null){
            Node node = new Node(val);
            head = node;
            tail = node;
            size++;
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if(index < 0 || index > size) return ;
        Node node = new Node(val);

        if(index == 0){
            addAtHead(val);
            return;
        }
        if(index == size){
            addAtTail(val);
            return;
        }
        Node temp = head;
        int i = 0;
        while(i<index-1){
            temp = temp.next;
            i++;

        }
        node.next = temp.next;
        temp.next = node;

        size++;
    }

    public void deleteAtIndex(int index) {
        if(index<0 || index >= size) return;
        if(index == 0){
            head = head.next;
            if(size == 1){
                tail = null;
            }
            size--;
            return;
        }
        Node temp = head;
        int i = 0;
        while(i<index-1){
            temp = temp.next;
            i++;
        }
        if(temp.next == tail){
            tail = temp;
        }
        temp.next = temp.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */