import java.util.Scanner;

// BINARY SEARCH
public class Binary implements Algorithm {
    public void ans() {
        int [] arr={1,2,3,4,5,6,7,8,9};
        Scanner in=new Scanner(System.in);
        System.out.println("Enter value to search between 1 to 9 : ");
        int n=in.nextInt();
       int ans = BinarySearch(arr,n);
        if(ans==-1){
            System.out.println("Value not found");
        }else{
            System.out.println("The value "+n+" Found at Index :"+ans);
        }
        long num=System.nanoTime();
        System.out.println(num);
    }

    private static int BinarySearch(int[] arr, int n) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==n){
                return mid;
            }else if(n>arr[mid]){
                start=mid+1;
            }else if(n<arr[mid]){
                end=mid-1;
            }
        }
        return -1;
    }


}
