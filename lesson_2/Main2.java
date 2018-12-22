/**
 * Java. Algorytms. Lesson 2. Example of homework,
 * autor Rudenko Alexander
 * version date 22/12/2018
 *
 */
package lesson_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main2 {

    public static final String STR_2 = "str2";
    private static String str1;

    public static void main(String[] args) {
//        testArrayList();
//        testArray();
        testArrayImpl();

    }

    private static void testArrayImpl() {
//        Array array = new SortedArrayImpl(5);
        Array array = new ArrayImpl(5);
        System.out.println("size = " + array.getSize());
        System.out.println("isEmpty " + array.isEmpty());

        array.add(4);
        array.add(5);
        array.add(2);
        array.add(1);
        array.add(6);
        array.add(3);

//        array.sortBubble();
//        array.sortSelect();
        long start = System.nanoTime();
        array.sortInsert();
        long finish = System.nanoTime();
        System.out.println(TimeUnit.NANOSECONDS.toMillis(finish - start));

        array.display();

//        Random r = new Random();
//        r.nextInt();

        System.out.println("contains 3: " + array.contains(3));

        System.out.println("a[2] = " + array.get(2));
        System.out.println("get last =  " + array.get());

        System.out.println("size = " + array.getSize());
        System.out.println("isEmpty " + array.isEmpty());

        System.out.println("Remove 3: " + array.remove(3));
        System.out.println("Remove 30: " + array.remove(30));
        System.out.println("contains 3: " + array.contains(3));

        array.display();

        while ( !array.isEmpty() ) {
            array.remove();
        }
        array.display();
    }

    private static void testArray() {
//        int[] a = new int[5];
//        Integer[] a = new Integer[5];
//        Integer[] a = new Integer[] {1, 3, 5, 4};
        Integer[] a = {1, 3, 5, 4};

//        a[0] = 21;
//        a[1] = 22;
//        a[2] = 23;

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    private static void testArrayList() {
        List<String> collection = new ArrayList<>(1);
        str1 = "str1";
        collection.add(str1);
        collection.add(STR_2);
        collection.add("str3");

        collection.remove("str1");
        collection.remove(1);

        collection.indexOf("str1");//index element or -1

        collection.contains("str2");

        for (String s : collection) {
            System.out.println(s);

        }
    }
}
