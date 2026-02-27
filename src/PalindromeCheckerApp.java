

        /**
         * ==================================================================
         * MAIN CLASS - UseCase2PalindromeCheckerApp
         * ==================================================================
         *
         * Use Case 2: Hardcoded Palindrome Validation
         *
         * Description:
         * This class demonstrates basic palindrome validation
         * using a hardcoded string value.
         *
         * @author Developer
         * @version 2.0
         */
        public class PalindromeCheckerApp {

            public static void main(String[] args) {

                System.out.println("WELCOME TO PALINDROME CHECKER APP ");
                System.out.println("version 1.0 ");
                System.out.println("System initialized successfully! ");

                String input = "racecar";
                boolean isPalindrome = true;
                int length = input.length();


                for (int i = 0; i < length / 2; i++) {
                    if (input.charAt(i) != input.charAt(length - 1 - i)) {
                        isPalindrome = false;
                        break;
                    }
                }
                if (isPalindrome) {
                    System.out.println("The string \"" + input + "\" is a palindrome.");
                } else {
                    System.out.println("The string \"" + input + "\" is NOT a palindrome.");
                }
            }
}
