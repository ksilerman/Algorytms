package lesson_6;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Arrays;

public class main {

    public static void main(String[] args) {

        int[] dia = new int[41];
        dia[0] = -20;
        for(int i = 1; i < dia.length; i++){
            dia[i] = dia[i-1]+1;
        }

        System.out.print(Arrays.toString(dia)); // выводим массив для наглядности от -20 до 20
// пошло заполнение деревьев, если попадается уже выпашее значение ловим ошибку и продолжаем
        Tree tree1 = new TreeImpl();
        for (int i = 0; i < dia.length; i++)  {
            try {
                tree1.add(getRandom(dia));
            } catch (NullPointerException e) {
                tree1.add(getRandom(dia));
            }
        }
        Tree tree2 = new TreeImpl();
        for (int i = 0; i < dia.length; i++) {
            try {
                tree2.add(getRandom(dia));
            } catch (NullPointerException e) {
                tree2.add(getRandom(dia));
            }
        }
        Tree tree3 = new TreeImpl();
        for (int i = 0; i < dia.length; i++) {
            try {
                tree3.add(getRandom(dia));
            } catch (NullPointerException e) {
                tree3.add(getRandom(dia));
            }
        }
        Tree tree4 = new TreeImpl();
        for (int i = 0; i < dia.length; i++) {
            try {
                tree4.add(getRandom(dia));
            } catch (NullPointerException e) {
                tree4.add(getRandom(dia));
            }
        }
        Tree tree5 = new TreeImpl();
        for (int i = 0; i < dia.length; i++) {
            try {
                tree5.add(getRandom(dia));
            } catch (NullPointerException e) {
                tree5.add(getRandom(dia));
            }
        }
        Tree tree6 = new TreeImpl();

            for (int i = 0; i < dia.length; i++) {
                try {
                    tree6.add(getRandom(dia));
                } catch (NullPointerException e) {
                    tree6.add(getRandom(dia));
                }
        }
        System.out.println("");
        System.out.println("Дерево 1");
        tree1.displayTree();
        System.out.println("Дерево 2");
        tree2.displayTree();
        System.out.println("Дерево 3");
        tree3.displayTree();
        System.out.println("Дерево 4");
        tree4.displayTree();
        System.out.println("Дерево 5");
        tree5.displayTree();
        System.out.println("Дерево 6");
        tree6.displayTree();

//        tree.add(5);
//        tree.add(2);
//        tree.add(7);
//
//        System.out.println("Size = " + tree.getSize());
//        System.out.println("Find 5: " + tree.find(5));
//        System.out.println("Find 2: " + tree.find(2));
//        System.out.println("Find 7: " + tree.find(7));
//        System.out.println("Find 777: " + tree.find(777));
//
//        tree.traverse(TraverseMode.IN_ORDER);

    }

    public static int getRandom(int[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }
}
