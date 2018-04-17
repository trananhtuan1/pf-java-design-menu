import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        System.out.println("Menu design:");
        System.out.println("1: Square");
        System.out.println("1: Rectangle");
        System.out.println("1: Triangular");
        int number = 1;

        Scanner scanner = new Scanner(System.in);

        while (number != 0) {
            System.out.println("Enter The Picture You Want ");
            number = scanner.nextInt();
            switch (number) {
                case 1:
                    System.out.println("************");
                    System.out.println("************");
                    System.out.println("************");
                    System.out.println("************");
                    System.out.println("************");
                    System.out.println("************");
                    break;
                case 2:
                    System.out.println("************");
                    System.out.println("************");
                    System.out.println("************");
                    break;
                case 3:
                    System.out.println("*");
                    System.out.println("**");
                    System.out.println("***");
                    System.out.println("****");
                    System.out.println("*****");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Please Enter Again");
            }
        }
    }
}
