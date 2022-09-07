import java.util.Scanner;
public class KiemTraSoNguyenTo {
    public static void main (String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Enter your number");
        int number = scanner.nextInt();

        if ( number < 2) {
            System.out.println("đây là không số prime" + number);
        } else {
            int i = 2;
            boolean check = true;
            for ( i =2; i < number - 1; i ++) {
                if ( number % i == 0) {
                    check = false;
                    break;
                }
            } if ( check == true) {
                System.out.println(" đây là số prime");
            } else {
                System.out.println("đây không phải là số Prime");
            }
        }

    }
}
