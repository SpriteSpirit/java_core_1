package arrays_;

public class ArraysPart2 {

    static int[] arrSalary = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
       /*
        ## Задание 1
        Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
        Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        в формате: «Сумма трат за месяц составила … рублей».
        */

        int totalSum = 0;

        for (int salary : arrSalary) {
            totalSum += salary;
        }
        System.out.println("Сумма трат за месяц составила " + totalSum + " рублей");
    }

    public static void task2() {
        /*
        ## Задание 2
        Следующая задача — найти минимальную и максимальную трату за день.
        Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        в формате: «Минимальная сумма трат за день составила … рублей.
        Максимальная сумма трат за день составила … рублей».
        */

        int maxSalary = 0;

        for (int salary : arrSalary) {
            if (salary > maxSalary) {
                maxSalary = salary;
            }
        }

        int minSalary = maxSalary;

        for (int salary : arrSalary) {
            if (salary < minSalary) {
                minSalary = salary;
            }
        }

        System.out.println("Минимальная сумма трат за день составила " + minSalary + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxSalary + " рублей");
    }

    public static void task3() {
        /*
        ## Задание 3
        А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
        Нужно написать программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат за месяц
        поделить на количество дней), и вывести в консоль результат в формате:
        «Средняя сумма трат за месяц составила … рублей».
        **Важно помнить:** подсчет среднего значения может иметь остаток (то есть быть не целым, а дробным числом).
         */

        double monthAverage = 0;

        for (int salary : arrSalary) {
            monthAverage += salary;
        }

        monthAverage /= arrSalary.length;

        System.out.println("Средняя сумма трат за месяц составила " + monthAverage + " рублей");
    }

    public static void task4() {
       /*
       ## Задание 4
        Отойдем от подсчетов.
        В нашей бухгалтерской книге появился баг. Что-то пошло нет так, и Ф.И.О. сотрудников начали отображаться в
        обратную сторону. Т. е. вместо «Иванов Иван Иванович» мы имеем «чивонавИ навИ вонавИ».
        Данные с именами сотрудников хранятся в виде массива символов (char[]).
        Напишите код, который в случае такого бага будет выводить Ф. И. О. сотрудников в корректном виде.
        В качестве данных для массива используйте:
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        В результате в консоль должно быть выведено "Ivanov Ivan".
        **Важно**: не используйте дополнительные массивы для решения этой задачи. Необходимо корректно пройти по
        массиву циклом и распечатать его элементы в правильном порядке.
        */

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
