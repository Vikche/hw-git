import java.util.Arrays;

public class HomeWork2 {

    public static void main(String[] args) {

        int[] array = new int[] {5, 7, 4, 6, 3, 5, 2, 4, 8, 10};
        task1();
        task2();
        task3();
        task4(5);
        System.out.println(Arrays.toString(task5(array)));
    }


        public static void task1() {
            int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    System.out.print(arr[i] + 1 + " ");
                } else {
                    System.out.print(arr[i] - 1 + " ");
                }
            }
            System.out.println();
            System.out.println();
        }

        public static void task2() {
            int[] arr = new int[8];
            int v = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = v;
                v += 3;
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            System.out.println();
        }

        public static void task3() {
            int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 6) {
                    System.out.print(arr[i] * 2 + " ");
                } else {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
            System.out.println();
        }

    public static void task4(int n) {

        int[][] arr = new int[n][];
        for (int i = 0; i < arr.length; i++) {

            arr[i] = new int [n];
            arr[i][i] = 1;
            arr[i][n-i-1] = 1;
            System.out.println(Arrays.toString(arr[i]));
            }
            System.out.println();

    }

    public static int[] task5(int[] array) {
        int[] arr = new int[2];
        int min, max;
        min = max = array[0];
        for (int i = 0; i < array.length; i++) {
            max = array[i] > max ? array[i] : max;
            if (min > array[i]) min = array[i];
        }
        arr[0] = min;
        arr[1] = max;
        return arr;
    }
}