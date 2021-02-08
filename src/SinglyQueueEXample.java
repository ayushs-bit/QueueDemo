import java.util.Scanner;

public class SinglyQueueEXample 
{
    SinglyQueueEXample()
    {
        
    }
    
    void insert()
    {
        
    }
    
    void delete()
    {
        
    }
    
    void traverse()
    {
        
    }
    
    public static void main(String args[])
    {
        SinglyQueueEXample obj = new SinglyQueueEXample();
        while(true)
        {
            System.out.println("press 1 for insert");
            System.out.println("press 2 for insert");
            System.out.println("press 3 for insert");
            System.out.println("press 4 for insert");
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
