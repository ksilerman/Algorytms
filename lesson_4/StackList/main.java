package lesson_4.StackList;

public class main {

    public static void main(String[] args) {
        StackList sl = new StackList();
        sl.push("Artem", 30);
        sl.push("Viktor", 20);
        sl.push("Sergey", 10);
        sl.display();
        while (!sl.isEmpty()) {
            System.out.println("Элемент "+ sl.pop()+" удален из стека");
        }
    }
}

