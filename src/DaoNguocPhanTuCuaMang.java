import java.util.Scanner;
public class DaoNguocPhanTuCuaMang {
    public static void main (String[]args){

        // khai báo biến, nhập và kiểm tra kích thước mảng:
        int size;
        int[]array;
        Scanner scanner = new Scanner (System.in);
        do {
            System.out.print("Enter a SIZE:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);

        // Nhập giá trị cho các phần tử mảng: thực thi chương trinh
        array = new int[size];
        int i = 0;
        while (i<array.length) {
            System.out.print("Enter element" + (i+1) + ":");
            array[i] = scanner.nextInt();
            i++;
        }

        // in ra mảng đã nhập, thực thi chương trình.
        System.out.printf("%-20s%s","Element in array:" , "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] +  "\t");
        }

        // Đảo ngược các phần tử trong mảng,  sử dụng biến trung gian de hoan đôi giá tri giua 2 phan tu.
        for (int j=0; j < array.length/2 ; j++) {
            int temp=array[j];
            array[j] = array[size - 1 - j] ;
            array[size -1 -j] = temp;
        }

        // in ra mang sau khi da dao nguoc thu tu cac phan tu:
        System.out.printf( "\n%-20s%s" , "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] +"\t");
        }
    }
}
