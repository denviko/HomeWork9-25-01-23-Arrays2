public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();


    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void Task1() {
        System.out.println("Задача №1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int index = 0; index < arr.length; index++) {
            sum += arr[index];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
    }

    public static void Task2() {
        System.out.println("Задача №2");
        int[] arr = generateRandomArray();
        int MaximumSpendingPerDay = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > MaximumSpendingPerDay) {
                MaximumSpendingPerDay = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + MaximumSpendingPerDay + " рублей");
        int minimumExpenditurePerDay = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minimumExpenditurePerDay) {
                minimumExpenditurePerDay = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minimumExpenditurePerDay + " рублей.");

    }

    public static void Task3() {
        System.out.println("Задача №3");
        int[] arr = generateRandomArray();
        double sum = 0;
        double average = 0;
        for (int index = 0; index < arr.length; index++) {
            sum += arr[index];
            average = sum / 30;
        }
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");
    }

    public static void Task4() {
        System.out.println("Задача №4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}
