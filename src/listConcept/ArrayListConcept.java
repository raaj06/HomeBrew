package listConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListConcept {

    public static <E> void main(String[] args) {

        ArrayList ar = new ArrayList();

        ar.add("String");
        ar.add(99);
        ar.add("True");

        System.out.println(ar.size());
        System.out.println(ar.get(1));


        System.out.println("*************");

        ArrayList<String> ar1 = new ArrayList<String>();
        ar1.add("String");
        ar1.add("Double");
        ar1.add("tripple");

        ArrayList<String> ar2 = new ArrayList<String>();
        ar2.add("nclkcn");
        ar2.add("Double");
        ar2.add("23874");

        ArrayList<String> ar3 = new ArrayList<String>();
        ar3.add("nclkcn");
        ar3.add("Double");


        ar1.retainAll(ar3);
        for (int i =0; i<ar1.size(); i++){
            System.out.println(ar1.get(i));
        }









    }
}
