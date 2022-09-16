import com.containers.LinkedList;
import com.containers.Node;

public class LinkedListDriver {

    public static void main(String args[])
    {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.printList();

       list.remove(4);
        list.remove(5);
       list.printList();
       System.out.println("\ncurrent Size="+list.getSize());






    }

}
