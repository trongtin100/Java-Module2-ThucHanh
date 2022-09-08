import java.util.Scanner;
public class TimGiaTriLonNhatMang {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);

        int size;
        int [] array;

        // Buoc 3: dung Do - while de kiem tra kich thuoc phan tu mang
        do {
            System.out.println ("Size need scanner:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size has been exceed:");
        } while (size > 20);

        // Buoc 4: nhap gia tri cho phan tu mang:
        array = new int[size];
        int i = 0;
        while ( i < array.length) {
            System.out.print("Enter so can nhap thu" + (i+1) +":");
            array[i] = scanner.nextInt();
            i ++;
        }

        // buoc 5: in ra danh sach tai san da nhap:
        System.out.print("Property list");
        for (int j = 0; j < array.length; j ++) {
            System.out.println(array[j] + "\t");
        }

        //Buoc 6: duyet cac phan tu trong mang de tim gia tri lon nhat va vi tri:
        int max = array [0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max ) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("the best is:" + max + "and position" + index);
    }

}
