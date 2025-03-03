import java.util.Random;

public class ThingList {
    private class Node{
        private Thing data;
        private Node next;

        public Node(Thing t){
            data = t;
            next = null;
        }

        public Thing returnThing(){
            return data;
        }

        public String getData(){
            return data.toString();
        }
    }

    private Node head;
    private Node next;

    public ThingList(){
        head = null;
        next = null;
    }

    public ThingList(Thing t){
        head = new Node(t);
        next = null;
    }

    public void addThing(Thing n){
        Node insertNode = new Node(n);
        Node temp = head;
        if (head == null){
            head = insertNode;
        }
        else{
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = insertNode;
        }
    }

    public void printAll(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.getData());
            temp = temp.next;
        }
    }

    public void moveAll(Random r){
        Node temp = head;
        while (temp != null){
            temp.returnThing().maybeTurn(r);
            temp.returnThing().step();
            temp = temp.next;
        }
    }

}
