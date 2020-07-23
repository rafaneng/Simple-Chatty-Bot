import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        String stringUpperCase = string.toUpperCase();
        Boolean stringPrefix = stringUpperCase.startsWith("J");

        System.out.println(stringPrefix);

    }
}