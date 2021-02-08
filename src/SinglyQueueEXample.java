import java.util.Scanner;

public class SinglyQueueEXample 
{
    int ar[];
    int Front,Rear;
    SinglyQueueEXample()
    {
        ar = new int[5];
        Front = -1;
        Rear = -1;
    }
    
    void insert()
    {
        if(Rear == 4)
        {
            System.out.println("Queue full");
        }
        else
        {
            System.out.println("Enter data");
            Scanner sc2 = new Scanner(System.in);
            int data = sc2.nextInt();
            
            if(Front == -1)
            {
                Front  = 0;
            }
            Rear = Rear + 1;
            ar[Rear] = data;
            System.out.println("data inserted...");
        }
    }
    
    void delete()
    {
        if(Front == -1 || Rear == -1)
        {
            System.out.println("Queue empty");
        }
        else
        {
            if(Front == Rear)
            {
                System.out.println("deleted:" +ar[Front]);
                Front = -1;
                Rear = -1;
            }
            else
            {
                System.out.println("deleted:" +ar[Front]);
                Front = Front + 1;
            }
        }
    }
    
    void traverse()
    {
        if(Front == -1 || Rear == -1)
        {
            System.out.println("Queue empty");
        }
        else
        {
            System.out.println("...Singly queue...");
            for (int i = Front;i<=Rear;i++)
            {
                System.out.println(" "+ar[i]);
            }
            
        }
    }
    
    public static void main(String args[])
    {
        SinglyQueueEXample obj = new SinglyQueueEXample();
        while(true)
        {
            System.out.println("press 1 for insert");
            System.out.println("press 2 for delete");
            System.out.println("press 3 for traverse");
            System.out.println("press 4 for exit");
            //System.out.println("press 5 for insert");
            
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
