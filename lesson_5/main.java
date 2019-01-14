package lesson_5;

public class main {
    public static void main(String[] args) {

        int chislo = 0;
        int step = 2;
        System.out.println( power2(chislo,step) );


    }

    public static int power2(int x, int n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return x;
        else
            return x * (power2(x, n-1));

    }


}
