public class Stack_using_array
{
    static class Stack 
    {
         int size;
         static int stackArray[];
         static int top;
        Stack(int size)
        {
          this.size = size;
          stackArray = new int[size];
          top = -1;
        }
        void push(int data)
        {
            if(top==size-1)
            {
                System.out.println("Overflow conditions");
            }
            else
            {
                top++;
                stackArray[top]=data;
                System.out.println("The push elements is :"+stackArray[top]);
            }
        }

        void pop()
        {
            int item;
            if(top==-1)
            {
                System.out.println("Underflow conditions");
            }
            else
            {
                item=stackArray[top];
                top--;
                System.out.println("The pop elements is :"+item);
            }
        }

        void peek()
        {
            if(top==-1)
            {
                System.out.println("Underflow conditions");
            }
            else
            {
                System.out.println("The top most elements is :"+stackArray[top]);
            }
        }

        void display()
        {
            int i;
            for(i=top;i>=0;i--)
            {
                System.out.print(" "+stackArray[i]);
            }
        }
    }
   
    public static void main(String[] args) 
    {
        Stack s=new Stack(5);
        s.push(5);
        s.push(2);
        s.push(7);
        s.push(8);
        s.push(1);
        s.pop();
        s.peek();
        s.display();
    }
}