import java.util.Random;

public class ThingList {
    private class Node{
       // private Thing head;
        private Thing data;
        private Node next;

        public Node(Thing t){
            data = t;
            next = null;
        }
//        public void setNext(Thing t){
  //          next = t;
    //    }
        public Thing returnThing(){
            return data;
        }

        public String getData(){
            return data.toString();
        }
    }

    //private Thing head;
    //private Thing next;
    private Node head;
    private Node next;
    //private Node next;

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
          //  insertNode.next = null;
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
       // Random rand = new Random(3);
        Node temp = head;
        while (temp != null){
            temp.returnThing().maybeTurn(r);
            temp = temp.next;
        }
    }
/* 
    //removes node at head
    public Node remove(){
        Node returnNode = head;
        if (head != null){
            head = head.next;
        }
        return returnNode;
    }
    //removes node n in list, otherwise returns null
    public Node remove(Node n){
        if (head == null){
            return n;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = n;2
            n.next = null;
            return returnNode;
        }

    
    }

    public Thing getTail(){
        Thing temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        return temp;
    }*/
//}


}
