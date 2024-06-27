import java.util.Scanner;

public class Main {
    public static final int LOWEST_VALUE = 0;
    public static final int HIGHEST_VALUE = 10;

    public static void main(String[] args) {
        System.out.println("Я загадала число в диапазоне от "
                + LOWEST_VALUE + " до " + HIGHEST_VALUE +
                "\nПопробуйте угадать.\n");
        int a = new Scanner(System.in).nextInt();

    }
}
