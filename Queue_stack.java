public class Queue_stack {
   static class Queue
    {
        int size;
        int s1[],s2[];
        static int top1,top2;
        int count=0;

        Queue(int size)
        {
            this.size=size;
            top1=top2=-1;
        }

        void push1(int data)
        {
            if(top1==size-1)
            {
                System.out.println("Overflow conditions");
            }
            else
            {
                top1++;
                s1[top1]=data;
            }
        }

        void push2(int data)
        {
            if(top2==size-1)
            {
                System.out.println("Overflow conditions");
            }
            else
            {
                top2++;
                s2[top2]=data;
            }
        }

        int pop1()
        {
            return s1[top1--];
        }

        int pop2()
        {
            return s2[top2--];
        }

        void enqueue(int x)
        {
            push1(x);
            count++;
        }

        void dequeue()
        {
            int i,a,b;
            if(top1==-1 && top2==-1)
            {
                System.out.println("Underflow conditions");
            }
            else
            {
                for(i=0;i<count;i++)
                {
                    a=pop1();
                    push2(a);
                }
                b=pop2();
                System.out.println(b);
                count--;
                for(i=0;i<count;i++)
                {
                    a=pop2();
                    push1(a);
                }
            }
        }
    }
    public static void main(String[] args) 
    {
        Queue q=new Queue(5);    
        q.enqueue(5);
        q.enqueue(2);
        q.enqueue(-1);
        q.dequeue();
        q.enqueue(7);

    }
    
}
