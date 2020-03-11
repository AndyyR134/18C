public class HighScoreLinkedList {

    int size;
    LinkedListNode head;
    LinkedListNode tail;

    public class LinkedListNode {
        public LinkedListNode next;
        public HighScore data;
    }

    public HighScoreLinkedList() {
        this.head = null;
        this.tail = this.head;
        this.size = 0;
    }

    public void add(HighScore newScore) {
        //loop through all nodes until we find a null "next" and then insert it there
        LinkedListNode current = head;
        if (head == null) {
            head = new LinkedListNode();
            head.data = newScore;
            head.next = null;
            tail = head;
        } else {
            while (current != null) {
                //loop while current != null
                //Follow the linked list chain
                current = current.next;
            }
            current.next = new LinkedListNode();
            current.next.data = newScore;
            current.next.next = null;
            this.tail = current.next;
        }
        size++;
    }

    public void remove(int index) {
        if (index >= this.size) {
            throw new IndexOutOfBoundsException();
        } else {
            int counter = 0;
            LinkedListNode current = head;
            if (index ==0) {
                //remove the head and make the next the new head.
                head = head.next;
            }else{
                while(counter<index -1){
                    counter++;
                    current = current.next;
                }
                //current.next is the node we want to delete
                if(current.next.next == null){
                    tail = current.next;
                }
                current.next = current.next.next;
            }
        }
    }

    public HighScore search(String name) {
        LinkedListNode current = head;
        HighScore found  = null;
        while(current != null && found == null){
            if(current.data.getName().equals(name)){
                found = current.data;
            }else{
                current = current.next;
            }
        }
        return found;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        LinkedListNode current = head;
        while(current != null){
            sb.append(current.data);
            current = current.next;
        }
        return sb.toString();
    }
}


