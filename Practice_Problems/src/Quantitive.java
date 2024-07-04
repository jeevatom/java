import java.util.Scanner;

public class Quantitive {
    public static void main(String[] args) {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String num = "0123456789";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String:");
        String input = in.next().toUpperCase();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar == '-') {
                ans.append('-');
            } else if (letters.indexOf(currentChar) != -1) {
                int newIndex = (letters.indexOf(currentChar) + 4) % 26;
                ans.append(letters.charAt(newIndex));
            } else{
                int n=(num.indexOf(currentChar)+4)%10;
                ans.append(num.charAt(n));
            }
        }
        System.out.println("Ans: " + ans);
    }
}
