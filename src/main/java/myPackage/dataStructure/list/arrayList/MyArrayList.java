package myPackage.dataStructure.list.arrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {

    public static void someMethod(){
        //------------------
        System.out.println("-------ArrayLista---------");

        List<String> stringList = new ArrayList<>(3);
        for (int i=0; i < 4; i++) {
            stringList.add(String.valueOf(i));
        }

        //String someString = 5;

        System.out.println(stringList.get(0));
        System.out.println(stringList.get(1));
        System.out.println(stringList.get(2));
        System.out.println(stringList.get(3));

        List<String> linkedList = new LinkedList<>();
        for (int i=0; i < 3; i++) {
            linkedList.add(String.valueOf(i));
        }
        System.out.println(linkedList.get(2));
    }

}
