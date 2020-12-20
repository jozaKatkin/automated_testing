//5. Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.

import java.util.HashMap;

public class FindMonthName {
    public static void main(String[] args) {
        HashMap<String, String> dict = new HashMap<String, String>() {{
            put("1", "January");
            put("2", "February");
            put("3", "March");
            put("4", "April");
            put("5", "May");
            put("6", "June");
            put("7", "July");
            put("8", "August");
            put("9", "September");
            put("10", "October");
            put("11", "November");
            put("12", "December");
        }};
        if (args.length == 1 && dict.containsKey(args[0])) {
            System.out.println("Month name: " + dict.get(args[0]));
        } else {
            System.out.println("Wrong input. Specify one number from 1 to 12, please");
        }
    }
}

