//3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

import java.util.Random;

public class RandInt {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Specify one number, please");
        } else {
            int number = Integer.parseInt(args[0]);
            if (number <= 0) {
                System.out.println("Wrong input. Specify number greater than 0");
            } else {
                Random random = new Random();
                for (int i = number - 1; i >= 0 && i <= 100; i--)
                    System.out.println(random.nextInt(100));

                System.out.println("___________________________");

                for (int i = number - 1; i >= 0 && i <= 100; i--)
                    if (i == 0) {
                        System.out.print(random.nextInt(100) + ".");

                    } else {
                        System.out.print(random.nextInt(100) + ", ");
                    }
            }
        }
    }
}
