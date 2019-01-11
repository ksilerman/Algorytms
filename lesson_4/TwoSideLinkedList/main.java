package lesson_4.TwoSideLinkedList;


public class main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert("Artem", 30);
        list.insert("Misha", 10);
        list.insert("Vova", 5);
        list.insertLast("Petya", 25);

        list.display();
        System.out.println("Удаление элементов списка");


        list.delete("Vova");
        list.display();

    }
}

