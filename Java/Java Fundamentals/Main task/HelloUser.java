//1. Приветствовать любого пользователя при вводе его имени через командную строку.

public class HelloUser {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Specify your username, please");
        } else {
            String username = args[0];
            System.out.println("Hello, " + username);
        }
    }
}
