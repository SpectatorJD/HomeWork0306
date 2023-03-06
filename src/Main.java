import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);}

        float[] b = {1.57f, 7.654f, 9.986f};
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);}
        int[] c = {5, 7, 8, 11, 1};
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);}

        }


    public static void task2 () {
        System.out.println("Задача 2");
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        System.out.println(a[0] + "," + a[1] + "," + a[2]);


        float[] b = {1.57f, 7.654f, 9.986f};
        System.out.println(b[0] + ", " + b[1] + ", " + b[2]);


        int[] c = {5, 7, 8, 11, 1};
        System.out.println(c[0] + ", " + c[1] + ", " + c[2] + ", " + c[3] + ", " + c[4]);
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        System.out.println(a[2] + "," + a[1] + "," + a[0]);


        float[] b = {1.57f, 7.654f, 9.986f};
        System.out.println(b[2] + ", " + b[1] + ", " + b[0]);


        int[] c = {5, 7, 8, 11, 1};
        System.out.println(c[0] + ", " + c[4] + ", " + c[3] + ", " + c[2] + ", " + c[1]);



    }
    public static void task4 () {
        System.out.println("Задача 4");
        int [] arr = {1, 2, 3};
        int i;
        for (i = 0; i< arr.length; i++) {
            if (arr[i] % 2 !=0) {
                arr[i]++;
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    }
