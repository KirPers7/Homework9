public class Main {
    public static void main(String[] args) {

        //Задание 1
        System.out.println("Задание 1");

        int[] expenses = {115_000, 92_050, 184_300, 64_440, 201_780};
        int sumExpenses = 0;

        for (int element : expenses) {
            sumExpenses = sumExpenses + element;
        }
        System.out.println(sumExpenses);
        System.out.println();

        //Задание 2
        System.out.println("Задание 2");

        int[] expenses2 = {115_000, 92_050, 184_300, 64_440, 201_780};

        int minExpense = 1000_000;
        int maxExpense = -1;

        for (int currentValue : expenses2) {
            if (currentValue > maxExpense) {
                maxExpense = currentValue;
            }
            if (currentValue < minExpense) {
                minExpense = currentValue;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minExpense +
                " рублей. Максимальная сумма трат за неделю составила " + maxExpense + " рублей");
        System.out.println();

        //Задание 3
        System.out.println("Задание 3");

        int[] expenses3 = {115_000, 92_050, 184_300, 64_441, 201_780};
        int sumExpenses3 = 0;
        double averageAmount;

        for (int currentValue : expenses3) {
            sumExpenses3 += currentValue;
        }
        averageAmount = (double) sumExpenses3 / (expenses3.length);

        System.out.println("Средняя сумма трат за месяц составила " + averageAmount + " рублей");
        System.out.println();

        //Задание 4
        System.out.println("Задание 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }
}