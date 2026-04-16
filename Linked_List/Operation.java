package Linked_List;
import java.util.Scanner;
public class Operation {
    Node head =null;
    Node tail =null;
    int size =0;
    int sizes(){
        Node temp = head;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        return size;
    }
    int  getIndx(int val){
        int indx =0;
        Node temp = head;
        while(temp!= null){
            if(temp.value==val) return indx;
            indx++;
            temp=temp.next;
        }
  
        return -1;
    }
    void delATindx(int indx){
        Node temp = head;
        for(int i = 0;i<indx-1;i++){
            temp=temp.next;

        }
        temp.next=temp.next.next;
        
    }
    void get(int indx){
        if(indx==0){ 
             
             System.out.println(head.value);
             return;}
        Node temp = head;
        for(int i=0;i<indx;i++){
            temp=temp.next;

        }
        System.out.println(temp.value);
        return;
    }
    void insertAtmid(int val,int indx){
        if(indx<2)
            {
                System.out.println("not be insert at mid:");
            return;
            }
        Node newnode = new Node(val);
        if(head==null){
         head=newnode;
         return;
        }
        else{
            Node temp = head;
            for(int i=1;i<indx;i++){
                temp = temp.next;
            }
            newnode.next=temp.next;
            temp.next=newnode;
            display();
        }
    }
    void delAtend(){
        if(head==null){
            System.out.println("linked list is empty:");
        }
        else{
            Node temp = head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
            tail=temp;
        }
        return;
    }
    void delFirst(){
        if(head==null){
            System.out.println("no present linked list");
        }else{
            head=head.next;
        }
        return;
    }
    void display(){
        Node temp = head;
        if(temp==null)return;
        while(temp!=null){
            System.out.print(temp.value + "->");
            temp=temp.next;
        }
        System.out.println();
        return;
    }
    void addAtend(int x){
        Node newnode = new Node(x);
        if(head==null)
            head=tail=newnode;
        else{
        tail.next = newnode;
        tail=newnode; 
        } 
        return;
    }
    void addAtbegine(int x){
        Node newnode = new Node(x);
        if(head==null){
            tail=head=newnode;
        }
        else{
        newnode.next=head;
        head=newnode;}
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node[] arr = new Node[5];
        System.out.println("create a linklist:");
        for(int i=0;i<5;i++){
             arr[i] =new Node(sc.nextInt());
        }
        for(int i=0;i<4;i++){
            arr[i].next=arr[i+1];

        }
        Operation obj = new Operation();
        
        for(int i=0;i<5;i++){
        obj.addAtbegine(arr[i].value);
        }
        obj.display();
        obj.addAtend(48);
        obj.display();
        obj.delFirst();
        obj.display();
        obj.delAtend();
        obj.display();
        obj.insertAtmid(40,3);
        obj.get(0);
        obj.delATindx(2);
        obj.display();
        System.out.println(obj.getIndx(54));
        System.out.println(obj.sizes());
        return;   
    }  
}
