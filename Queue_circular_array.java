public class Queue_circular_array {
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
            if(foont==-1 && rear==-1)
            {
                foont=rear=0;
                arr[rear]=data;
            }
            else if((rear+1)%size==foont)
            {
               System.out.println("The queue is full(overflow conditions)");
            }
            else
            {
                rear=(rear+1)%size;
                arr[rear]=data;
            }
        }
        public void display()
        {
            int i=foont;
            if(foont==-1 && rear==-1)
            {
                System.out.println("underflow conditions");
            }
            else
            {
                while(i!=rear)
                {
                    System.out.print(" "+arr[i]);
                    i=(i+1)%size;
                }
                System.out.print(" "+arr[rear]);
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
                foont=(foont+1)%size;
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
        q.enqueue(-1);
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        q.display();
        q.dequeue();
        q.dequeue();
        q.enqueue(0);
        q.enqueue(10);
        // q.enqueue(11);
        q.peek();
        q.display();  
    }
}
