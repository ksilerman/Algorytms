package lesson_4.LinkedList;

public class main {

    public static void main(String[] args) {
        lesson_4.LinkedList.LinkedList list = new lesson_4.LinkedList.LinkedList();
        list.insert("Artem");
        list.insert("Roman");

        System.out.println(list.find("Artem"));

        LinkedList<People> peopleList = new LinkedList<>();
        peopleList.insert(new People("Artem", 22));
        peopleList.insert(new People("Roman", 18));

        System.out.println(peopleList.find(new People("Artem", 22)).toString());
    }
}

