public class Main1 {

    private static char staticA;
    private static String staticStr;

    public static void main(String[] args) {
        int a = 5;
        int b = 5;
//        int b = 7;
        System.out.println(a);
        System.out.println(staticA);

        String str = "text";//001

        System.out.println(str);
        System.out.println(staticStr);

        System.out.println("a == b: " + (a == b));

        String str1 = new String("text");//002
        String str2 = "text";//002

        System.out.println("str = str1: " + (str == str1));
        System.out.println("str = str2: " + (str == str2));
        System.out.println("str equals str1: " + (str.equals(str1)));

        Person p1 = new Person("Petr", 33);
        Person p2 = new Person("Petr", 33);
        System.out.println("p1 == p2: " + (p1 == p2));
        System.out.println("p1.equals(p2): " + (p1.equals(p2)));


        int c = 10;//001
        System.out.println(c);
        testInt(c);
//        testInt(10);
        System.out.println(c);


        String str3 = "str3";//003 = //004
        System.out.println(str3);
        testStr(str3);//004
        System.out.println(str3);

        System.out.println("-----");

        Person p3 = new Person("Andrey", 38);//001 = {002, 003}
        System.out.println(p3);
        testPerson(p3);//001
        System.out.println(p3);

        int[] arr = new int[] {1, 2, 3};
        System.out.println(arr[1]);
    }

    private static void testPerson(Person p3) {//004 = //001
        System.out.println(p3);
        p3.setName("Sergey");//004 = //001 ({005, 003})
        System.out.println(p3);
    }

    private static void testStr(String str3) {//005 = //004
        System.out.println(str3);
        str3 = "newText";//005 = 007
        System.out.println(str3);
    }

    private static void testInt(int c) {//002
        System.out.println(c);
        c = 5;//002 = 5
        System.out.println(c);
    }
}
