package listConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListConcept {

    public static void main(String[] args) {

        LinkedList<Integer> li = new LinkedList<Integer>();

        li.add(299);
        li.add(2000);
        li.add(3000);
        li.add(40000);

        System.out.println(li);

        li.addFirst(0);
        li.addLast(10);
        System.out.println(li);

        System.out.println(li.get(4));

        li.set(0, 70);
        System.out.println(li.get(0));
        System.out.println(li);

        System.out.println("After Deleting 0th element");

        li.remove(0);
        System.out.println(li);

        System.out.println("****printing using iterator");
        Iterator<Integer> it = li.iterator();
        while(it.hasNext()){

            System.out.println(it.next());
        }

        System.out.println("*******advance for loop");

        for (Integer ll: li) {
            System.out.println(ll);

        }

        System.gc();
        System.out.println("apple".compareTo("banana"));







    }

}
