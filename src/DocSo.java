import java.util.Scanner;
public class DocSo {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number ");
        int number = scanner.nextInt();
        String yournumber;
        switch (number) {
            case 1:
                yournumber = "one";
                break;
            case 2:
                yournumber = "two";
                break;
            case 3:
            yournumber = "three";
                break;
            case 4:
                yournumber = "four";
                break;
            case 5:
                yournumber = "five";
                break;
            case 6:
                yournumber = "six";
                break;
            case 7:
                yournumber = "seven";
                break;
            case 8:
                yournumber = "eight";
                break;
            case 9:
                yournumber = "nine";
                break;
            case 10:
                yournumber = "ten";
                break;
            default:
                yournumber = " ";
                break;
        }
        if (!yournumber.equals("")) System.out.printf("The number '%d' has %s ", number, yournumber);
        else System.out.print("Invalid input!");
    }
}
