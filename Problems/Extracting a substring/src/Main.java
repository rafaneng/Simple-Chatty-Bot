import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        String subString = string.substring(number1,number2 + 1);

        System.out.println(subString);

    }
}