public class Stack_LinkList 
{
    static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            next=null;
        }
    }

    static class Stack
    {
        public static Node head;

        public void push(int data){
            Node newNode=new Node(data);
            newNode.data=data;
            newNode.next=head;
            head=newNode;
        }

        public void display(){
            Node temp;
            temp=head;
            if(head==null)
            {
                System.out.println("Underflow conditions");
            }
            else
            {
                while(temp!=null)
                {
                    System.out.println("The display elements is: "+temp.data);
                    temp=temp.next;
                }
            }
        }

        public void peek(){
            if(head==null)
            {
                System.out.println("Underflow condition_1");
            }
            else
            {
                System.out.println("The top most elements is :"+head.data);
            }
        }

        public void pop(){
            if(head==null)
            {
                System.out.println("Underflow conditions");
            }
            else
            {
                System.out.println("The pop elements is :"+head.data);
                head=head.next;
            }
        }
    }

    public static void main(String[] args) 
    {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.display();
        s.pop();
        s.peek();
        s.display();
        
    }
    
}
