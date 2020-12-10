//4. Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.

import java.math.BigInteger;

public class FindSumAndProduct {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Specify numbers, please");
        } else {
            BigInteger sum = new BigInteger("0");
            for (String x : args)
                sum = sum.add(new BigInteger(x));

            BigInteger product = new BigInteger("1");
            for (String x : args)
                product = product.multiply(new BigInteger(x));

            System.out.println("Sum: " + sum);
            System.out.println("Product: " + product);
        }
    }
}

