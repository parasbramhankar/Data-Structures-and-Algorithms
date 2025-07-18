package LinkedList.SinglyLinkedList.Implementation;

class LinkedList{
    Node head;
      LinkedList insert(LinkedList list,int value){
        Node node=new Node(value);

        if(list.head==null) {
            list.head = node;
        }
        else{
            Node temp=list.head;
            while(temp.next!=null){
                temp=temp.next;
            }

            temp.next=node;
        }
        return list;
    }

    static void display(LinkedList list){
        Node temp=list.head;
        while(temp!=null){
            System.out.println(temp.data+" "+temp.next);
            temp=temp.next;
        }
    }
}


public class AddingOneByOneNodeInTheLinkedList {

    public static void main(String[] args) {
        LinkedList list=new LinkedList();

        list=list.insert(list,10);
        list=list.insert(list,20);
        list=list.insert(list,30);
        list=list.insert(list,40);
        list=list.insert(list,10);
        list=list.insert(list,60);
        list=list.insert(list,70);
        list=list.insert(list,20);

        System.out.println("Linked List: ");
        LinkedList.display(list);
    }
}
