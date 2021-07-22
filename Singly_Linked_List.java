/*
    Using this program you can perform the following operations
        1. Add node at beginning
        2. Add node at end
        3. Add node at middle
        4. Delete node at beginning
        5. Delete node at middle
        6. Delete node at end
        7. Check start node
*/
import java.util.Scanner;

class Node 
{
    int data;
    Node next;
}

class Create_LinkedList
{
    Node start; // by defaul the value of start is null
    public void Check_Start_Node()
    {
        if(start == null)
        {
            System.out.println("Node is Empty");
        }
        else
        {
            System.out.println("Node is not Empty");
        }
    }

    public void Add_Node_At_End(int value)
    {
        Node add_node = new Node();
        add_node.data = value;
        add_node.next = null;

        if(start == null)
        {
            start = add_node;
        }
        else
        {
            Node travel = start;
            while(travel.next != null)
            {
                travel = travel.next;
            }
            travel.next = add_node;
        }
    }

    public void Add_Node_At_Beginning(int value)
    {
        Node add_node = new Node();
        add_node.data = value;
        add_node.next = null;

        if(start == null)
        {
            start = add_node;
        }
        else
        {
            add_node.next = start;
            start = add_node;
        }
    }

    public void Add_Node_At_Middle(int value, int position)
    {
        if(start == null)
        {
            System.out.println("Please add one element in list");
        }
        else
        {
            Node add_node = new Node();
            add_node.data = value;
            add_node.next = null;
            int count = 1;
            Node travel = start;
            Node previous = null;
            while(count < position)
            {   
                previous = travel;
                travel = travel.next;
                count++;
            }
            add_node.next = previous.next;
            previous.next = add_node;
        }
    }

    public void Delete_At_Beginning()
    {
        if(start == null)
        {
            System.out.println("The link is empty can't delete");
        }
        else
        {
            Node temp = start;
            start = temp.next;
        }
    }

    public void Delete_At_End()
    {
        if(start == null)
        {
            System.out.println("The link is empty can't delete");
        }
        else
        {
            Node travel = start;
            Node previous = null;
            while(travel.next != null)
            {
                previous = travel;
                travel = travel.next;
            }
            previous.next = null;
        }
        
    }

    public void Delete_At_Middle(int position)
    {
        if(start == null)
        {
            System.out.println("List is empty");
        }
        else
        {
            Node travel = start;
            int count = 1;
            Node previous = null;
            while(count < position)
            {
                previous = travel;
                travel = travel.next;
                count++;
            }
            previous.next = previous.next.next;
        }
    }

    public void Display()
    {
        if(start == null)
        {
            System.out.println("List is empty can't display");
        }
        else
        {
            Node travel = start;
            while(travel.next != null)
            {
                System.out.print(travel.data + " ");
                travel = travel.next;
            }
            System.out.print(travel.data);
            System.out.println();
        }
    }

}

public class Singly_Linked_List 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Create_LinkedList  Reference_Variable = new Create_LinkedList();
        int value;
        int position;
        while(true)
        {
            System.out.println("***** Menu ******");
            System.out.println("1. Is head node empty \n2. Display List \n3. Add node at end \n4. Add node at beginning \n5. Add node at middle \n6. Delete node at beginning \n7. Delete at end \n8. Delete node at middle \n9. Exit");
            System.out.print("Enter your choice = ");
            int choice = scanner.nextInt();
            switch(choice)
            {
                case 1: Reference_Variable.Check_Start_Node();
                        break;

                case 2: Reference_Variable.Display();
                        break;

                case 3: System.out.print("Enter Data = ");
                        value = scanner.nextInt();
                        Reference_Variable.Add_Node_At_End(value);
                        break;

                case 4: System.out.print("Enter Data = ");
                        value = scanner.nextInt();
                        Reference_Variable.Add_Node_At_Beginning(value);
                        break;

                case 5: System.out.print("Enter Data = ");
                        value = scanner.nextInt();
                        System.out.print("Enter position = ");
                        position = scanner.nextInt();
                        Reference_Variable.Add_Node_At_Middle(value, position);
                        break;

                case 6: Reference_Variable.Delete_At_Beginning();
                        break;

                case 7: Reference_Variable.Delete_At_End();
                        break;

                case 8: System.out.print("Enter position = ");
                        position = scanner.nextInt();
                        Reference_Variable.Delete_At_Middle(position);
                        break;

                case 9: System.exit(0);

            }
        }
        
    }
}
