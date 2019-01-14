package lesson_5;

public class main {
    public static void main(String[] args) {
// 1 задание
        int chislo = 3;
        int step = 2;
        System.out.println( power2(chislo,step) );
//---------------
// 2 задание
        int[] values = new int[] {894, 260, 392, 281, 27};
        int[] weights = new int[] {8, 6, 4, 0, 21};
        int W = 30;
        int[] tab = new int[W+1];
        System.out.println(knapsack(values, weights, W, tab, 0));
//-------------------

    }
//---------------------
    public static int power2(int x, int n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return x;
        else
            return x * (power2(x, n-1));

    }
//------------------------------------------------
static int knapsack(int[] values, int[] weights, int W, int[] tab, int i) {
    if(i>=values.length) return 0;
    if(tab[W] != 0)
        return tab[W];

    int value1 = knapsack(values, weights, W, tab, i+1);
    int value2 = 0;
    if(W >= weights[i]) value2 = knapsack(values, weights, W-weights[i], tab, i+1) + values[i];

    return tab[W] = (value1>value2) ? value1 : value2;
}
//---------------------------
}
