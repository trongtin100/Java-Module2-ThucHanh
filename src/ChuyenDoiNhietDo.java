import java.util.Scanner;
public class ChuyenDoiNhietDo {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        double fahrenheit;
        double celsius;
        int choise;

        do {
            System.out.println("Menu.");
            System.out.println("1.Fahrenheit to Celcius");
            System.out.println("2.Celsius to Fahrenheit:");
            System.out.println("0.Exit");
            choise = input.nextInt();

            switch (choise) {
                case 1: {
                    System.out.println("Enter the fahrenheit:");
                    fahrenheit = input.nextDouble();
                    System.out.println("Fahrenheit to Celsius:"+ fahrenheitToCelsius(fahrenheit));
                    break;
                }
                case 2: {
                    System.out.println("Enter the Celsius:");
                    celsius = input.nextDouble();
                    System.out.println(" Celsius to Fahrenheit:"+ celsiusToFahrenheit(celsius));
                    break;
                }
                case 0:
                    System.exit(0);

            }

        } while (choise != 0);
    }

    public static double celsiusToFahrenheit(double celcius){
        double fahrenheit = (9.0/5) * celcius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0/9) * (fahrenheit -32);
        return celsius;
    }

}
