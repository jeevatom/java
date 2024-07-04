import java.util.Scanner;
public class task_program1 {
    public static void main(String []args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the words: ");
        String words=scn.nextLine();
        int count=1;
        for(int i=0;i<words.length();i++) {
            if(words.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("Total number of words is : "+count);
    }

}
