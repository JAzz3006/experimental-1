import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static final int LOWEST_VALUE = 0;
    public static final int HIGHEST_VALUE = 10;
    public static final String QUIT_COMM = "quit";


    public static void main(String[] args) {
        String quit = "";
        int guess = HIGHEST_VALUE + 1;
        //Scanner scan = new Scanner(System.in);
        while (!quit.equals(QUIT_COMM)) {

            System.out.println("Я загадала число от "
                    + LOWEST_VALUE + " до " + (HIGHEST_VALUE - 1) +
                    "\nПопробуйте угадать.\nВаша догадка:");
            int sought = LOWEST_VALUE + (int) (Math.random() * (HIGHEST_VALUE - LOWEST_VALUE));

                while (guess != sought) {
                    try {
                        guess = new Scanner(System.in).nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Что-то? Не поняла вас. Введите, пожалуйста, целое число в диапазоне от "
                                + LOWEST_VALUE + " до " + (HIGHEST_VALUE - 1));

                    }
                    System.out.println("Неправильно! Следующая попытка:");
                }

            System.out.println("Вы угадали! Сыграем еще? '" + QUIT_COMM + "' для выхода");

            quit = new Scanner(System.in).nextLine();
        }
    }
}

