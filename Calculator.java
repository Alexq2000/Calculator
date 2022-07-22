import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Калькулятор может выполнять операции сложения, вычитания, умножения и деления с ДВУМЯ или ТРЕМЯ числами от 1 до 10");
        Exceptions.isException();
    }

    public static void compute() {
        Scanner input = new Scanner(System.in);
        double result = 0;

        System.out.print("Введите выражение для вычисления: ");
        String userInput = input.nextLine();
        String[] tokens = userInput.split(" ");
        int x0 = Integer.parseInt(tokens[0]);
        int x2 = Integer.parseInt(tokens[2]);

        if (tokens.length == 3 && (x0 >= 1 && x0 <= 10) && (x2 >= 1 && x2 <= 10)) {
            switch (tokens[1].charAt(0)) {
                case '+':
                    result = x0 + x2;
                    break;
                case '-':
                    result = x0 - x2;
                    break;
                case '*':
                    result = x0 * x2;
                    break;
                case '/':
                    result = (double)x0 / x2;
            }

            System.out.println(result);

        } else {
            char y1 = tokens[1].charAt(0);
            char y2 = tokens[3].charAt(0);
            int x4 = Integer.parseInt(tokens[4]);

            if (tokens.length == 5 && (x0 >= 1 && x0 <= 10) && (x2 >= 1 && x4 <= 10) && (x4 >= 1 && x4 <= 10)) {
                if (y1 == '*' && y2 == '*') {
                    result = x0 * x2 * x4;
                }
                if (y1 == '*' && y2 == '+') {
                    result = x0 * x2 + x4;
                }
                if (y1 == '*' && y2 == '-') {
                    result = x0 * x2 - x4;
                }
                if (y1 == '*' && y2 == '/') {
                    result = x0 * (double)x2 / x4;
                }

                if (y1 == '/' && y2 == '/') {
                    result = (double)x0 / x2 / x4;
                }
                if (y1 == '/' && y2 == '*') {
                    result = (double)x0 / x2 * x4;
                }
                if (y1 == '/' && y2 == '+') {
                    result = (double)x0 / x2 + x4;
                }
                if (y1 == '/' && y2 == '-') {
                    result = (double)x0 / x2 - x4;
                }

                if (y1 == '+' && y2 == '+') {
                    result = x0 + x2 + x4;
                }
                if (y1 == '+' && y2 == '-') {
                    result = x0 + x2 - x4;
                }
                if (y1 == '+' && y2 == '*') {
                    result = x2 * x4 + x0;
                }
                if (y1 == '+' && y2 == '/') {
                    result = (double)x2 / x4 + x0;
                }

                if (y1 == '-' && y2 == '-') {
                    result = x0 - x2 - x4;
                }
                if (y1 == '-' && y2 == '+') {
                    result = x0 - x2 + x4;
                }
                if (y1 == '-' && y2 == '*') {
                    result = -1 * (x2 * x4 - x0);
                }
                if (y1 == '-' && y2 == '/') {
                    result = -1 * ((double)x2 / x4 - x0);
                }

                System.out.println(result);
            } else {
                System.out.println("НЕПРАВИЛЬНЫЕ ДАННЫЕ ВВОДА");
            }
        }
    }
}