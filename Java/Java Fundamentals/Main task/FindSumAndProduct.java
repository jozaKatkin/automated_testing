//4. Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.

import java.math.BigInteger;

public class FindSumAndProduct {
    public static void main(String[] args) {
        if (args.length == 0) {
            throw new IllegalArgumentException("Specify numbers, please");
        }
        BigInteger sum = new BigInteger("0");
        for (String number : args)
            sum = sum.add(new BigInteger(number));

        BigInteger product = new BigInteger("1");
        for (String number : args)
            product = product.multiply(new BigInteger(number));

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}

