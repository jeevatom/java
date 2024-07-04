import java.util.Scanner;

public class count_Words {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the words: ");
        String arr=scn.nextLine();
        int count = 1;
        char[] ch = arr.toCharArray();
        if (arr == " "||arr=="") {
            System.out.println(0);
        } else {
            for (int i = 0; i < arr.length(); i++) {
                if (ch[i] == ' ') {
                    count++;
                }
            }
            System.out.println(count);
        }
    }


}
