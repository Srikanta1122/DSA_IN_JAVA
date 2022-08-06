import java.util.*;

public class QUEUE {
    public static void main(String[] args) {
       Queue <Integer>q=new LinkedList<>();
       q.add(2); 
       q.add(5);
       q.add(1);
       q.add(7);
       q.add(6);

       while(!q.isEmpty())
       {
            System.out.print(" "+q.peek());
            q.remove();
       }
    }
    
}
