import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập cân nặng (kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Nhập chiều cao (m): ");
        double height = scanner.nextDouble();

        double bmi = calculateBMI(weight, height);

        System.out.println("Chỉ số BMI của bạn là: " + bmi);

        String bmiCategory = getBMICategory(bmi);
        System.out.println("Phân loại BMI: " + bmiCategory);

        scanner.close();
    }

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

}
