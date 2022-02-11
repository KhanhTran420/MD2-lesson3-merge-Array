import java.util.Scanner;

public class MergeArray2 {
    public static int[] mergeArr(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length ; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length ; i++) {
            arr3[arr1.length + i] = arr2[i];
        }
        return arr3;
    }

    public static void main(String[] args) {
        int[] Arr1 = new int[5];
        int[] Arr2 = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < Arr1.length ; i++) {
            System.out.println("Enter element for arr1: ");
            Arr1[i] = scanner.nextInt();
        }
        for (int i = 0; i < Arr2.length; i++) {
            System.out.println("Enter element for arr2: ");
            Arr2[i] = scanner.nextInt();
        }
        System.out.println("Marge 3: ");
        int[]Arr3 = mergeArr(Arr1,Arr2);
        for (int i = 0; i < Arr3.length ; i++) {
            System.out.print(Arr3[i] + "\t");
        }


    }
}
