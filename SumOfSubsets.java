import java.util.*;

public class SumOfSubsets {
    
    // Function to find subsets with given sum using backtracking
    public static void findSubsets(int[] arr, int targetSum, int index, List<Integer> subset, int currentSum) {
        if (currentSum == targetSum) {
            // Print the subset with target sum
            System.out.println("Subset with sum " + targetSum + ": " + subset);
            return;
        }
        
        if (currentSum > targetSum || index == arr.length) {
            return;
        }
        
        // Include current element in subset
        subset.add(arr[index]);
        currentSum += arr[index];
        
        // Recur with next index
        findSubsets(arr, targetSum, index + 1, subset, currentSum);
        
        // Exclude current element from subset
        subset.remove(subset.size() - 1);
        currentSum -= arr[index];
        
        // Recur with next index
        findSubsets(arr, targetSum, index + 1, subset, currentSum);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n value:");
        int n=sc.nextInt();
        System.out.print("Enter weight values:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){

            arr[i]=sc.nextInt();
        }
        System.out.print("Enter target sum:");
        int targetSum=sc.nextInt();

        //int[] arr = {10, 7, 5, 18, 12, 20, 15};
        //int targetSum = 35;
        
        List<Integer> subset = new ArrayList<>();
        findSubsets(arr, targetSum, 0, subset, 0);
    }
}
