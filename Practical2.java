//wap of doubly linked list which returns numbers of armstrong numbers.
package practical2;
import java.util.Scanner;
class Nodee7
{
    int data;
    Nodee7 previous;
    Nodee7 next;
}
public class Practical2
{
    Nodee7 START;
    Practical2() 
    {
        START = null;
    }
    void addnode() 
    {
        System.out.println("Enter data");
        Scanner sc2 = new Scanner(System.in);
        int item = sc2.nextInt();
        Nodee7 newnode = new Nodee7();
        newnode.data = item;
        newnode.previous = null;
        newnode.next = null;
        if (START == null) 
        {
            START = newnode;
        } 
        else 
        {
            Nodee7 current = START;
            while (current.next != null) 
            {
                current = current.next;
            }
            current.next = newnode;
            newnode.previous = current;
        }
    System.out.println("data inserted...");
    }   
    boolean is_armstrong(int n) 
    {
        boolean flag = true;
        int originalNumber, remainder, result = 0;
        originalNumber = n;
        while (originalNumber != 0) 
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
        if (result == n)
            flag = true;
        else
            flag = false;
            return flag;
    }
    void traversenode_armstorng_nums()
    {
        int count=0;
        if (START == null)
        {
            System.out.println("doubly List empty");
        }
        else
        {
            Nodee7 current;
            for (current = START; current.next != null; current = current.next) {
            if (is_armstrong(current.data)==true)
            {
                count++;
            }
            else
                continue;
            }
        }
        System.out.println("Number of armstrong numbers: "+count);
    }
    public static void main(String[] args)
    {
        Practical2 obj = new Practical2();
 
 
 
 
        while (true)
        {
            System.out.println("Enter ur choice");
            System.out.println("1 for add");
            System.out.println("2 for traverse");
            System.out.println("3 for exit");
            Scanner sc=new Scanner(System.in);
            int ch=sc.nextInt();
            if(ch==1)
            {
                obj.addnode();
            }
            else if(ch==2)
            {
                obj.traversenode_armstorng_nums();
            }
            else if(ch==3)
            {
                System.exit(0);
            }
            else
            {
                System.out.println("Wrong Choice");
            }
        }
    }
}