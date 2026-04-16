package Linked_List;

public class Createlink_list{
    
    // Createlink_list(int val){
    //     super(val);
    // }

    void rev_method(Node head){
        if(head==null)return;
        System.out.print(head.value + "->");
        head=head.next;
        rev_method(head);
    }
    // void display(Node head){
    //     if(head==null)return;
    //     while(head!=null){
    //     System.out.print(head.value + "->");
    //     head = head.next;
    //     }
    // }
    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(8);
        Node d = new Node(8);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=null;
        Createlink_list obj = new Createlink_list();
        // obj.display(a); 
        obj.rev_method(a);       
    }   
}
