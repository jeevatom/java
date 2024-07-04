import java.util.Scanner;

// LINEAR SEARCH
public class Linear implements Algorithm {
    public void ans() {
        int [] arr={1,2,3,4,5,6,7,8,9};
        Scanner in=new Scanner(System.in);
        System.out.println("Enter value to search between 1 to 9 : ");
        int n=in.nextInt();
        int ans = Linearsearch(arr,n);
        if(ans==-1){
            System.out.println("Value not found");
        }else{
            System.out.println("The value "+n+" Found at Index :"+ans);
        }
        long num=System.nanoTime();
        System.out.println(num);
    }

    private static int Linearsearch(int[] arr, int n) {
          for(int i=0; i< arr.length;i++){
              if(arr[i]==n){
                  return i;
              }
          }
        return -1;
    }
}
