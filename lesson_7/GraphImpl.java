package lesson_7;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class GraphImpl implements Graph {

    private boolean[][] adjMat;
    private List<Vertex> vertexes;


    public GraphImpl(int maxVertexes) {
        this.adjMat = new boolean[maxVertexes][maxVertexes];
        this.vertexes = new LinkedList<>();
    }

    @Override
    public void addVertex(String label) {
        Vertex vertex = new Vertex(label);
        vertexes.add(vertex);
    }

    @Override
    public boolean addEdge(String startLabel, String endLabel) {
        int startIndex = indexOf(startLabel);
        int endIndex   = indexOf(endLabel);

        if ( startIndex == -1 || endIndex == -1 ) {
            return false;
        }

        adjMat[startIndex][endIndex] = true;
        adjMat[endIndex][startIndex] = true;

        return true;
    }

    private int indexOf(String label) {
        for (int i = 0; i < vertexes.size(); i++) {
            if (vertexes.get(i).getLabel().equals(label)) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public void display() {
        System.out.println("-------------");
        for (int i = 0; i < vertexes.size(); i++) {
            Vertex vertex = vertexes.get(i);

            StringBuilder sb = new StringBuilder(vertex.getLabel());

            for (int j = 0; j < vertexes.size(); j++) {
                if (adjMat[i][j]) {
                    sb.append(" -> " + vertexes.get(j).getLabel());
                }
            }
            System.out.println(sb.toString());
        }
        System.out.println("-------------");
    }

    @Override
    public int getSize() {
        return vertexes.size();
    }

    @Override
    public void dfs(String startLabel) {
        int startIndex = indexOf(startLabel);
        if (startIndex == -1) {
            throw new IllegalArgumentException("Unknown vertex: " + startLabel);
        }

        System.out.println("DFS:");
        System.out.println("-------------");

        Stack<Vertex> stack = new Stack<>();

        Vertex vertex = vertexes.get(startIndex);

        visitVertex(vertex);
        stack.push(vertex);

        while ( !stack.isEmpty() ) {
            vertex = getAdjUnvisitedVertex(stack.peek());
            if (vertex != null) {
                visitVertex(vertex);
                stack.push(vertex);
            }
            else {
                stack.pop();
            }
        }

        System.out.println("-------------");

        resetVertexState();
    }

    @Override
    public void bfs(String startLabel) {
        int startIndex = indexOf(startLabel);
        if (startIndex == -1) {
            throw new IllegalArgumentException("Unknown vertex: " + startLabel);
        }

        System.out.println("BFS:");
        System.out.println("-------------");

        Queue<Vertex> queue = new LinkedList<>();

        Vertex vertex = vertexes.get(startIndex);

        visitVertex(vertex);
        queue.add(vertex);

        while ( !queue.isEmpty() ) {
            vertex = getAdjUnvisitedVertex(queue.peek());
            if (vertex != null) {
                visitVertex(vertex);
                queue.add(vertex);
            }
            else {
                queue.remove();
            }
        }

        System.out.println("-------------");

        resetVertexState();
    }

    private void resetVertexState() {
        for (Vertex vertex : vertexes) {
            vertex.setWasVisited(false);
        }
    }

    private Vertex getAdjUnvisitedVertex(Vertex vertex) {
        int index = vertexes.indexOf(vertex);
        for (int i = 0; i < vertexes.size(); i++) {
            if ( adjMat[index][i] && !vertexes.get(i).isWasVisited() ) {
                return vertexes.get(i);
            }
        }

        return null;
    }

    private void visitVertex(Vertex vertex) {
        System.out.println(vertex);
        vertex.setWasVisited(true);
    }

}
