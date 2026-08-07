package services.linkedLists.doublyLinkedList;

public class DoublyLinkedList {
    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // add node no começo
    public void addToFront(int value){
        Node newNode = new Node(value);

        if(head == null){
            head = tail = newNode; // de modo que os dois apontem para o mesmo node
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // add node no final
    public void addToEnd(int value){
        Node newMode = new Node(value);

        if(tail == null){
            tail = head = newMode; // de modo que os dois apontem para o mesmo node
        }else{
            newMode.prev = tail;
            tail.next = newMode;
            tail = newMode;
        }
    }

    // remove node no começo
    public Integer removeFromFront(){
        if(head == null){
            return null;
        }

        int removeNodeValue = head.value;

        if(head == tail){
            head = tail = null;
        }else{
            head = head.next;
            head.prev = null;
        }

        return removeNodeValue;
    }

    // remove node no final
    public Integer removeFromEnd(){
        if(tail ==  null){
            return null;
        }

        int removeNodeValue = tail.value;

        if(tail == head){
            tail = head = null;
        }else{
            tail = tail.prev;
            tail.next = null;
        }

        return removeNodeValue;
    }

    // imprimir lista
    public void printForward(){
        Node current = head;
        while(current != null){
            System.out.println(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}