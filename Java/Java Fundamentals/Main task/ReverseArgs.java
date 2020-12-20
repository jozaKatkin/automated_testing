//2. Отобразить в окне консоли аргументы командной строки в обратном порядке.

public class ReverseArgs {
    public static void main(String[] args) {
        if (args.length == 0) {
            throw new IllegalArgumentException("No arguments specified");
        }
        for (int i = args.length - 1; i >= 0; i--)
            System.out.println(args[i]);
    }
}
