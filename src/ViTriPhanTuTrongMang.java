import java.util.Scanner;
public class ViTriPhanTuTrongMang {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String [] fruit = { "tomato", "rice", " apple", "lemon","watermelon"};
        System.out.println ("fruit can nhap vao la:" );
        String input_name = scanner.nextLine();

        //Duyet mang fruit da khai bao o tren, tim phan tu trung voi ten da nhap vao:
        boolean isExist = false;
        for (int i = 0; i < fruit.length; i++){
            if (fruit[i].equals(input_name)) {
                System.out.println("Position of the Fruit:" + input_name + "is" + i);
                isExist = true;
                break;
            }
        }
        if ( !isExist) {
            System.out.println ("not found" + input_name + "in the list");
        }
    }
}
