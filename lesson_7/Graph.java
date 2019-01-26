package lesson_7;

public interface Graph {

    void addVertex(String label);

    boolean addEdge(String startLabel, String endLabel);

    void display();

    int getSize();

    /**
     * Depth-first search, DFS //в глубину
     */
    void dfs(String startLabel);

    /**
     * breadth-first search, BFS //в ширину
     */
    void bfs(String startLabel);
}
