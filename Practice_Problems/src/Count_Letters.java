import java.util.Scanner;

public class Count_Letters {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the words: ");
        String str=scn.nextLine();
        char[] ch=str.toCharArray();
        int count=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]==' '){
            }else{
            count++;}
        }
        System.out.println("Total letters:"+count);
    }
}