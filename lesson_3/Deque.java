package lesson_3;

import lesson_3.queue.Queue;

public interface Deque extends Queue {

    void insertLeft(int value);
    void insertRight(int value);

    int removeLeft();
    int removeRight();
}