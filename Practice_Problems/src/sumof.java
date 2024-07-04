import java.util.Scanner;

public class sumof {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sum=0;
        for(int i=1;i<=10;i++){
            sum+=i*n;
        }
        System.out.println(sum);
    }
}
