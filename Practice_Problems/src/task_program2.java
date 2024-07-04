import java.util.Scanner;
public class task_program2 {
    public static void main(String []args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the words: ");
        String words=scn.nextLine();
        String splitWords[]=words.split("\\s");
        int count=0;
        for(int i=0;i<splitWords.length;i++) {
            count+=splitWords[i].length();
        }
        System.out.println("Total number of letter is : "+count);
    }

}