package lesson_7;

public class main {
    public static void main(String[] args) {
        bfs();
    }

    private static void bfs(){
        Graph graph = new GraphImpl(15);
        graph.addVertex("Москва");
        graph.addVertex("Тула");
        graph.addVertex("Рязань");
        graph.addVertex("Калуга");
        graph.addVertex("Липецк");
        graph.addVertex("Тамбов");
        graph.addVertex("Орел");
        graph.addVertex("Воронеж");
        graph.addVertex("Саратов");
        graph.addVertex("Курск");

        graph.addEdge("Москва", "Тула");
        graph.addEdge("Москва", "Рязань");
        graph.addEdge("Москва", "Калуга");

        graph.addEdge("Тула", "Липецк");
        graph.addEdge("Рязань", "Тамбов");
        graph.addEdge("Калуга", "Орел");

        graph.addEdge("Липецк", "Воронеж");
        graph.addEdge("Тамбов", "Саратов");
        graph.addEdge("Орел", "Курск");

        graph.addEdge("Саратов", "Воронеж");
        graph.addEdge("Курск", "Воронеж");

        System.out.println("Graph size = " + graph.getSize());
        graph.display();
        graph.bfs("Москва");

    }
}
