import java.util.Scanner;


public class EditDistance {

   public static int editDistance(String word1, String word2) {

       int m = word1.length();

       int n = word2.length();

       

       // Create a table to store results of subproblems

       int[][] dp = new int[m + 1][n + 1];

       

       // Fill dp[][] in bottom-up manner

       for (int i = 0; i <= m; i++) {

           for (int j = 0; j <= n; j++) {

               // If first string is empty, only option is to insert all characters of second string

               if (i == 0) {

                   dp[i][j] = j;

               }

               // If second string is empty, only option is to remove all characters of first string

               else if (j == 0) {

                   dp[i][j] = i;

               }

               // If last characters are same, ignore last characters and recur for remaining string

               else if (word1.charAt(i - 1) == word2.charAt(j - 1)) {

                   dp[i][j] = dp[i - 1][j - 1];

               }

               // If last characters are different, consider all possibilities and find minimum

               else {

                   dp[i][j] = 1 + Math.min(Math.min(dp[i][j - 1], // Insert

                                                    dp[i - 1][j]), // Remove

                                          dp[i - 1][j - 1]); // Replace

               }

           }

       }

       

       return dp[m][n];

   }

   

   public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       

       System.out.print("Enter the first word: ");

       String word1 = scanner.nextLine();

       

       System.out.print("Enter the second word: ");

       String word2 = scanner.nextLine();

       

       System.out.println("Edit distance between '" + word1 + "' and '" + word2 + "' is: " + editDistance(word1, word2));

       

       scanner.close();

   }

}


