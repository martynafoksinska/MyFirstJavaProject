package MoreJava;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> ourList = new ArrayList<>();

        ourList.add("Martyna");
        System.out.println(ourList);

        ourList.add("Jakub");
        System.out.println(ourList);

        ourList.add("Kasia");
        System.out.println(ourList);

        System.out.println(ourList.get(0));

        ourList.set(0, "Paweł");
        System.out.println(ourList);

        String removed = ourList.remove(0);
        System.out.println(ourList);
        System.out.println(removed);

        ourList.add("Martyna");
        System.out.println(ourList);

        ourList.add("Basia");
        System.out.println(ourList);

        ourList.add("Ania");
        System.out.println(ourList);

        System.out.println("There are " + ourList.size() + " items in the list");

        System.out.println(ourList + " contains Martyna: " + ourList.contains("Martyna"));
        System.out.println(ourList + " contains Ania: " + ourList.contains("Martyna"));

        System.out.println("Index of Kasia is: " + ourList.indexOf("Kasia"));
        System.out.println("Is empty: " + ourList.isEmpty());

        for (String value : ourList) {
            System.out.println(value);
        }

        Iterator<String> iterator = ourList.iterator();
        String name = iterator.next();
        System.out.println("First name is: " + name);
        name = iterator.next();
        System.out.println("Second name is: " + name);

    }
}