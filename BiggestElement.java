import java.util.Scanner;

public class BiggestElement {
    public static void main(String[] args) {
        int big = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size the Array : ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element of the Array  " + i + " pos : ");
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < size; i++) {
            if (arr[i] > big) {
                big = arr[i];
            }
        }
        System.out.println("Biggest element is : " + big);

    }
}