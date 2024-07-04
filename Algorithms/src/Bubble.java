// Bubble Sort
public class Bubble {
    public static void main(String[] args) {
        int [] arr={8,4,6,8,1,99,34,87};
        BubbleSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    private static void BubbleSort(int[] arr) {
        int temp;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<(n-i)-1
                    ;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}

