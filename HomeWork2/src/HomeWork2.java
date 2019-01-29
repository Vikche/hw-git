public class HomeWork2 {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
        public static void task1() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for(int i = 0; i < arr.length; i++) {
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
        for(int i = 0; i < arr.length; i++) {
            arr[i] = v;
            v += 3;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
            System.out.println();
    }
        public static void task3() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                System.out.print(arr[i] * 2 + " ");
            } else {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
            System.out.println();
    }
        public static void task4() {
        int counter = 0;
        int[][] arr = new int[4][4];
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++) {
                arr[i][j] = counter;
                counter += 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}