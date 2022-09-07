import java.util.Scanner;
public class VeHinhTamGiac {
    public static void main (String[] args ){
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while( choice != 0 ) {
            System.out.println("1.Menu can nhap vao:");
            System.out.print("2.DrawTheSquare");
            System.out.print("3.DrawtheRectangle");
            System.out.print("0.Exit");
            System.out.print("Enteryourchoise:");
            int choise = scanner.nextInt();
            switch(choise) {
                case 1:
                    System.out.println("Draw the triangle");
                    System.out.println("&&&&&&");
                    System.out.println("&&&&&");
                    System.out.println("&&&&");
                    System.out.println("&&&");
                    System.out.println("&&");
                    System.out.println("&");
                    break;
                case 2:
                    System.out.println("Draw the square");
                    System.out.println(" $ $ $ $ $ $");
                    System.out.println(" $ $ $ $ $ $");
                    System.out.println(" $ $ $ $ $ $");
                    System.out.println(" $ $ $ $ $ $");
                    System.out.println(" $ $ $ $ $ $");
                    System.out.println(" $ $ $ $ $ $");
                    break;
                case 3:
                    System.out.println("Draw the rectangle");
                    System.out.println("% % % % % % ");
                    System.out.println("% % % % % % ");
                    System.out.println("% % % % % % ");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choise!");

            }
        }
    }
}
