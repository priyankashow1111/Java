public class FindMissingNum {
    public int findMissingNumber(int[] arr) {
        int n=arr.length+1;
        int sum=n*(n+1)/2;
        for(int num : arr) {
            sum=sum-num;
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5};
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        FindMissingNum f=new FindMissingNum();
        System.out.println("Missing number is: "+f.findMissingNumber(arr));
    }
}
