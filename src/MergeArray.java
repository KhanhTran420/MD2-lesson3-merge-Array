import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int size1;
        int[] arr1;
        int size2;
        int[] arr2;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập độ dài của mảng thứ nhất: ");
            size1 = scanner.nextInt();
            if (size1>20)
                System.out.println("Độ dài mảng không được quá 20");
        }
        while (size1 >20);

        arr1 = new int[size1];
        int i = 0;
        while (i < arr1.length){
            System.out.print("Enter Element " + (i + 1) + " : ");
            arr1[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Danh sách các phần tử trong mảng thứ nhất: ");
        for (int j = 0; j < arr1.length ; j++) {
            System.out.print(arr1[j] + "\t");
        }
        System.out.println("");

        do {
            System.out.println("Nhập phần tử trong mảng thứ 2: ");
            size2 = scanner.nextInt();
            if(size2>20){
                System.out.println("Độ dài mảng không được quá 20 ");
            }
        }while (size2>20);
        System.out.println("Danh sách phần tử trong mảng thứ 2");
        arr2 = new int[size2];
        for (int j = 0; j < arr2.length ; j++) {
            System.out.println("Enter Element " + (j + 1) + " : ");
            arr2[j] = scanner.nextInt();
        }
        System.out.print("Danh sách các phần tử trong mảng thứ 2: ");
        for (int j = 0; j < arr2.length ; j++) {
            System.out.print(arr2[j] + "\t");
        }
        System.out.println("");


        int[] newArr = new int[arr1.length + arr2.length];
        for (int k = 0; k < arr1.length ; k++) {
            newArr[k] = arr1[k];
        }
        for (int h = 0; h < arr2.length  ; h++) {
            newArr[arr1.length + h] = arr2[h];
        }
        System.out.print("Danh sách các phần tử trong mảng gộp: ");
        for (int l = 0; l < newArr.length ; l++) {
            System.out.println(newArr[l] + "\t");
        }
    }
}
