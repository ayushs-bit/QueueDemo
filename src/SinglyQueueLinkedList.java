import java.util.Scanner;

class Node
{
    int data;
    Node next;
}

public class SinglyQueueLinkedList 
{
    Node Front,Rear;
    SinglyQueueLinkedList()
    {
        Front = null;
        Rear = null;
    }
    
    void insert()
    {
        System.out.println("Enter data");
        Scanner sc2 = new Scanner(System.in);
        int item = sc2.nextInt();
        
        Node newnode = new Node();
        newnode.data = item;
        newnode.next = null;
        
        if(Front == null)
        {
            Front = newnode;
            Rear = newnode;
        }
        else
        {
            Node current = Rear;
            while(current.next != null)
            {
                current = current.next;
            }
            current.next = newnode;
        }
        System.out.println("...data inserted...");
    }
    
    void delete()
    {
        if(Front == null)
        {
            System.out.println("Queue empty");
        }
        else
        {
            System.out.println("deleted :"+Front.data);
            Front = Front.next;
        }
    }
    
    void traverse()
    {
        if(Front == null || Rear == null)
        {
            System.out.println("Queue empty");
        }
        else
        {
            System.out.println(".....Singly queue Linkedlist....");
            for(Node current = Front;current!= null;current = current.next)
            {
                System.out.print(" "+current.data);
            }
        }
    }
    
    public static void main(String args[])
    {
        SinglyQueueLinkedList obj  = new SinglyQueueLinkedList();
        while(true)
        {
            System.out.println("\npress 1 for insert");
            System.out.println("press 2 for delete");
            System.out.println("press 3 for traverse");
            System.out.println("press 4 for exit");
            //System.out.println("press 5 for ");
            
            System.out.println("Enter your choice");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            
            switch(ch)
            {
                case 1:
                    obj.insert();
                    break;
                case 2:
                    obj.delete();
                    break;
                case 3:
                    obj.traverse();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
                
    }
}
