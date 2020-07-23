import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        String newString = string.replace("a", "b");

        System.out.println(newString);
    }
}