package Linked_List;
import java.util.Scanner;
public class MidTerm {
    int k;
    Node head = null;
    void insert(int x){
        
        Node newnode = new Node(x);
        if(head==null){
        head = newnode;
        }else{
        newnode.next=head;
        head=newnode;}
        display();
        
        // while( temp!=null){
        //     System.out.print(temp.value+ "-> ");
        //     temp=temp.next;
        //     System.out.println();
        // }
        return;
    }
    void display(){
        Node temp = head;
          while( temp!=null){
            System.out.print(temp.value +"-> ");
            temp=temp.next;
            System.out.println();
        }
    }
    Node midTerm(){
        Node slow =head;
        Node fast = head;
        if(k%2!=0){
            while(fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            }
            System.out.println(slow.value);
        }
        else{
            while(fast.next.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            System.out.println(slow.value);
            System.out.println(slow.next.value);
        }
       
        return slow;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        MidTerm val =new MidTerm();
        System.out.print("No of creating node: ");
         val.k = sc.nextInt();
        for(int i=0;i<val.k;i++){
        System.out.print("enter  a value:");
        val.insert(sc.nextInt());
        }

         Node temp1=val.midTerm();
        //  System.out.println(temp1.value);
        return;

        
    }
    
}
