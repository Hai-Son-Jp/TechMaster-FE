import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your hometown: ");
        String hometown = scanner.nextLine();

        System.out.println("Xin chào sơn " + name + "!");
        System.out.println("Bạn " + age + " tuổi.");
        System.out.println("Quê bạn ở đồng nai " + hometown + ".");

        scanner.close();
    }
}