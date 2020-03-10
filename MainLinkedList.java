import java.util.ArrayList;

public class MainLinkedList{
    public static void main(String[] args) {

        ArrayList<HighScore> score = new ArrayList<>();
        LinkedList list = new LinkedList();

        for(int i = 0; i < 2; i++) {

            list.add(score.add(new HighScore("David", 4590)));
            list.add(score.add(new HighScore("Angel", 4590)));
            list.add(score.add(new HighScore("Andrew", 4590)));
        }

        String name = "Andrew";
        for(int i = 0; i < score.size(); i++) {
            if (name.equals(score.get(i).getName()));
                list.search(list.head, score.get(i).getName());
        }


    }
}

class LinkedList{
    Node head;

    public void add(boolean new_data){

    }

    public void search(Node head, String key){
        Node current = head;
        while(current != null){
            for(int i = 0; i < 5; i++) {
                if (current.data.equals(key))
                    System.out.println("Key has been found:" + key);
                current = current.next;
            }
        }
       // System.out.println("Name not found.");
    }

    public void add(ArrayList<HighScore> score) {
        Node new_node = new Node(score);
        new_node.next = head;
        head = new_node;
    }
}

class Node{
    ArrayList<HighScore> data;
    Node next;
    Node(ArrayList<HighScore> d){
        data = d;
        next = null;
    }
}