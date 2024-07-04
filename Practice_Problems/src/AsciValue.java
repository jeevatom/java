
import java.util.Scanner;

public class AsciValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String:");
        String input = in.next().toUpperCase();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char curr = input.charAt(i);
            if (curr == '-') {
                ans.append('-');
            } else if (curr >= 'A' && curr <= 'Z') {
                int newIndex = (curr - 'A' + 4) % 26;
                ans.append((char) ('A' + newIndex));
            } else if (curr >= '0' && curr <= '9') {
                int n = (curr - '0' + 4) % 10;
                ans.append((char) ('0' + n));
            }
        }
        System.out.println("Ans: " + ans);
    }
}
