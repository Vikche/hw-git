public class HomeWork1 {

    public static void main(String[] args) {
        task2();
        System.out.println(task3(3,4,4,2));
        System.out.println(task4(10,5));
        task5(-1);
        System.out.println(task6(-6));
        task7("Виктор");
        System.out.println(task8(1997));
    }
        public static void task2() {
            byte a = 5;
            short b = 10;
            int c = 15;
            long d = 20;
            float e = 5.0f;
            double f = 15.25;
            char g = '\u0025';
            boolean h = true, i = false;
    }
        public static int task3(int a, int b, int c, int d){
            return a * (b + (c / d));
    }
        public static boolean task4(int a, int b) {
            int sum = a + b;
            return sum >= 10 && sum <= 20;
    }
        public static void task5(int x){
            if (x >= 0) {
                System.out.println(x + " положительное");
            } else {
                System.out.println(x + " отрицательное");
            }
    }
        public static boolean task6(int x) {

        return x < 0;
    }
        public static void task7(String name) {

        System.out.println("Привет, "+ name);
    }

        public static boolean task8(int year){

        return year % 100 != 0 && year % 4 == 0 || year % 400 == 0;
    }
}
