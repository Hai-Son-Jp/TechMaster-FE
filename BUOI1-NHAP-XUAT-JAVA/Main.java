import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Tạo một đối tượng userInputScanner để đọc dữ liệu từ người dùng
        Scanner userInputScanner = new Scanner(System.in);
        // In ra thông báo yêu cầu người dùng nhập số nguyên
        System.out.print("Enter an integern: ");
        // Đọc giá trị số nguyên từ người dùng và lưu vào biến userNumber
        int userNumber = userInputScanner.nextInt();
        // In ra giá trị số nguyên đã được nhập
        System.out.println("Integer entered: " + userNumber);

        System.out.print("Enter a real number: ");
        double doubleValue = userInputScanner.nextDouble();
        System.out.println("Entered real number: " + doubleValue);

        System.out.print("Enter a character: ");
        char charValue = userInputScanner.next().charAt(0);
        System.out.println("Typed characters: " + charValue);

        System.out.print("Enter a boolean value (true/false): ");
        boolean booleanValue = userInputScanner.nextBoolean();
        System.out.println("Input boolean value: " + booleanValue);

        System.out.print("Enter a string: ");
        String stringValue = userInputScanner.nextLine();
        System.out.println("String entered: " + stringValue);

        userInputScanner.close(); // Đóng userInputScanner để giải phóng tài nguyên

    }
}
