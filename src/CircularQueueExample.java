import java.util.Scanner;

public class CircularQueueExample 
{
    int ar[];
    int Front,Rear;
    CircularQueueExample()
    {
        ar = new int[5];
        Front = -1;
        Rear = -1;
    }
    
    void insert()
    {
            
    }
        
    void delete()
    {
            
    }
    
    void traverse()
    {
        
        System.out.println();
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
  
