public class ThingList {
    private Thing head;
    private Thing next;

    public ThingList(){
        head = null;
        next = null;
    }

    public void add(Thing n){
        Thing temp = head;
        if (head == null){
            head = n;
        }
        else{
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = n;
            n.next = null;
        }
    }

    public Node remove(){
        Node returnNode = head;
        if (head != null){
            head = head.next;
        }
        return returnNode;
    }
    public Node remove(Node n){
        if (head == null){
            return n;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = n;
            n.next = null;
            return returnNode;
        }


    }
}
