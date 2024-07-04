public class pattern_pyramid {
    public static void main(String[] args) {
        int n = 4; // Adjust this value to change the size of the diamond

        // Upper part of the diamond
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("   ");
            }

            // Print asterisks
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(" * ");
            }

            System.out.println(); // Move to the next line
        }

        // Lower part of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("   ");
            }

            // Print asterisks
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(" * ");
            }

            System.out.println(); // Move to the next line
        }
    }
}
