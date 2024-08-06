public class FindMinimum {
    public int findMin(int[] arr) {
        if(arr==null || arr.length==0) {
            throw new IllegalArgumentException("Invalid input");
        }
        int min=arr[0]; //assume arr[0] as minimum
        for(int i=1;i<arr.length;i++) {
            if(arr[i]<min) {
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[]={5,9,3,15,1,2};
            FindMinimum f=new FindMinimum();
            System.out.println(f.findMin(arr));
    }
}
