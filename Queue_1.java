public class Queue_1 {
    static class Queue 
    {
        static int arr[];
        int size;
        static int foont,rear;

        Queue(int size)
        {
            this.size=size;
            arr=new int[size];
            foont=-1;
            rear=-1;
        }
        public void enqueue(int data)
        {
            if(rear==size-1)
            {
                System.out.println("overflow conditions");
            }
            else if(foont==-1 && rear==-1)
            {
                foont=rear=0;
                arr[rear]=data;
            }
            else
            {
                rear++;
                arr[rear]=data;
            }
        }
        public void display()
        {
            if(foont==-1 && rear==-1)
            {
                System.out.println("underflow conditions");
            }
            else
            {
                for(int i=foont;i<rear+1;i++)
                {
                    System.out.print(" "+arr[i]);
                }
            }
        }
        public void dequeue()
        {
            if(foont==-1 && rear==-1)
            {
                System.out.println("The queue is empty");
            }
            else if(foont==rear)
            {
                foont=rear=-1;
            }
            else
            {
                System.out.println(" The dequeue elements is :"+arr[foont]);
                foont++;
            }
        }
        public void peek()
        {
            if(foont==-1 && rear==-1)
            {
                System.out.println("The queue is empty (underflow conditions) )");
            }
            else
            {
                System.out.println(" The foont elements is "+arr[foont]);
            }
        }
    }
    public static void main(String[] args) {

        Queue q=new Queue(5);

        q.enqueue(2);
        q.enqueue(5);
        q.enqueue(7);
        q.display();
        q.dequeue();
        q.peek();
        q.display();
    }
}
