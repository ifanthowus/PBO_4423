package lat;
import java.util.*;
import java.lang.*;

class Myexp extends Exception{

}
class Stack
{
    private char arr[];
    private int top;
    private int capacity;

    // Constructor to initialize stack
    Stack(int size)
    {
        arr = new char[size];
        capacity = size;
        top = -1;
    }

    // Utility function to add an element x in the stack
    public void push(char x)
    {
        if (isFull())
        {
            System.out.println("OverFlow\nProgram Terminated\n");
            System.exit(1);
        }


        arr[++top] = x;
    }

    // Utility function to pop top element from the stack
    public int pop()
    {
        // decrease stack size by 1 and (optionally) return the popped element
        return arr[top--];
    }


    public Boolean isFull()
    {
        return top == capacity - 1;   // or return size() == capacity;
    }

    public static void main (String[] args)
    {
        Stack stack = new Stack(20);
        Scanner var=new Scanner(System.in);
        Myexp obj=new Myexp();
        System.out.println("Enter the unary expression:");
        String unry=var.nextLine();
        int i=0;
        int count=0;
        int flag=0;
        int j=0;

        try{
            while(unry.charAt(i)!= '=')
            {
                char ch=unry.charAt(i);
                if(ch=='-'||ch=='*'||ch=='/')throw obj;

                if(ch=='1')
                {
                    stack.push(ch);
                    count++;
                }


                i++;


                j=i;
            }



            for(i=j+1;i<unry.length();i++)
            {
                if(unry.charAt(j+1)=='1')
                {
                    flag++;
                }
                j++;
            }


            if(count==flag)
            {


                System.out.println("The unary expresssion is valid");
            }
            else
            {
                {


                    System.out.println("The unary expresssion  is not valid");
                }

            }


        }
        catch(ArrayIndexOutOfBoundsException e)//if any array index out of error occur that will be handled here
        {

        }


        catch(Myexp k)
        {
            System.out.println("The unary expresssion  is not valid");
        }


    }
}