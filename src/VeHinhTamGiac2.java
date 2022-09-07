import java.util.Scanner;
public class VeHinhTamGiac2 {
    public static void main ( String[] args){
        int choice = -1;
        Scanner scanner = new Scanner (System.in);

        while (choice != 0){
            System.out.print("1.Print the rectangle");
            System.out.print("2.Print the square triangle");
            System.out.print("3. Print isosceles triangle");
            System.out.print("Exit");
            int choise = scanner.nextInt();
            switch(choise) {
                case 1:
                    for ( int i = 1; i <= 5; i++){
                        for ( int j = 1; j < i; j++){
                            System.out.print("*");
                        } System.out.println("");
                    }
                case 2:
                    for ( int i = 7; i >= 1 ; i--){
                        for ( int j = 1; j <= i; j++){
                            System.out.print("*");
                        } System.out.println("");
                    }
                case 3:
                    for ( int i = 1; i <= 3; i++){
                        for ( int j =1; j <=7; j++) {
                            System.out.print("*");
                        }System.out.println("");
                }
            }
        }
    }
}
