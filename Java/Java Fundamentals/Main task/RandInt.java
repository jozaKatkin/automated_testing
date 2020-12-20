//3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

import java.util.Random;

public class RandInt {
    public static void main(String[] args) {
        if (args.length != 1) {
            throw new IllegalArgumentException("Wrong input. Specify one number");
        }
        int number = Integer.parseInt(args[0]);
        if (number <= 0) {
            throw new IllegalArgumentException("Wrong input. Specify positive number");
        }
        Random random = new Random();
        for (int i = number - 1; i >= 0 && i <= 10000; i--)
            System.out.println(random.nextInt(100));

        System.out.println("___________________________");

        for (int i = number - 1; i >= 0 && i <= 10000; i--)
            if (i == 0) {
                System.out.print(random.nextInt(100) + ".");

            } else {
                System.out.print(random.nextInt(100) + ", ");
            }
    }
}
