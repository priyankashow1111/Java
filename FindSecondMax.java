import java.util.Scanner;

public class FindSecondMax {
    public int findSecondMax(int[] arr) {
        int max=Integer.MIN_VALUE; //value is -2147483648
        int secondMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>max) {
                secondMax=max;
                max=arr[i];
            } else if(arr[i]>secondMax && arr[i]!=max) {
                secondMax=arr[i];
            }
        }
        return secondMax;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Original array: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        FindSecondMax f=new FindSecondMax();
        System.out.println(f.findSecondMax(arr));
    }
}
