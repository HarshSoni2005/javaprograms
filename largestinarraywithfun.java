import java.util.*;
public class largestinarraywithfun {
    public static int findLargestElement(int[] arr) {
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER N: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("ENTER " + (i + 1) + " ARRAY ELEMENT: ");
            arr[i] = sc.nextInt();
        }
        int largestElement = findLargestElement(arr);
        System.out.println("LARGEST ELEMENT IN ARRAY IS " + largestElement);
        sc.close();
    }
}