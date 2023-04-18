
import java.util.Scanner;

public class SwapElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size  : ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        int brr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element in array1 : ");
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < brr.length; i++) {
            System.out.println("Enter the element in array2 : ");
            brr[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            arr[i] = arr[i] + brr[i];
            brr[i] = arr[i] - brr[i];
            arr[i] = arr[i] - brr[i];
        }
        for (int i : arr) {
            System.out.println("1st Array : " + i);
        }
        for (int i : brr) {
            System.out.println("2nd Array element : " + i);
        }
    }
}
