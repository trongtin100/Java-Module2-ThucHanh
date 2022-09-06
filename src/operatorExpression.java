
import java.util.Scanner;
public class operatorExpression {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in); // Khai bao doi tuon scanner
        System.out.println("Enter width: ");
        width = scanner.nextFloat(); // nhap chieu rong.
        System.out.println("Enter height: ");
        height = scanner.nextFloat();//nhap vao chieu dai
        float area = width * height;
        System.out.println("Area is: " + area );
    }
}
