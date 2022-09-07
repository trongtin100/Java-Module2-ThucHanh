import java.util.Scanner;
public class maxMin {
    public static void main (String[] args) {
        int a,b;
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter your number a");
        a = scanner.nextInt();
        System.out.print ("Enter your number b");
        b = scanner.nextInt();
        if ( a> b ) {
            System.out.println("số" + a + "lon nhat");
        } else {
            System.out.println("sô" + b + "la so lon nhat");
        }
    }
}
