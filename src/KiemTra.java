import java.util.Scanner;
public class KiemTra {
    public static void main (String[] args){
        int sum1_10 = sum(1,10);
        System.out.println("Tong sum 1-10 la:" + sum(1,10));

        int sum20_40 = sum(20, 40);
        System.out.println( "Tong sum 20-40 la:" + sum(20, 40));

        int sum70_90 = sum(70, 90);
        System.out.println("Tong sum 70-90 la:" + sum(70, 90));

    }
    public static int sum( int start, int end) {
        int result = 0;
        for ( int i = start; i <= end; i ++){
            result += i;
        }
        return result;
    }
}
