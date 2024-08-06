public class MoveZeroes {
    public void moveZeroes(int[] arr) {
        int j=0; //focus 0th element
        for(int i=0;i<arr.length;i++) { //i will focus non-zeroth element
            if(arr[i]!=0 && arr[j]==0) {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[j]!=0) {
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={8,1,0,2,1,0,3};
        System.out.println("Original array: ");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        MoveZeroes m=new MoveZeroes();
        m.moveZeroes(arr);
        System.out.println("After moving zeroes to the end of an array: ");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
