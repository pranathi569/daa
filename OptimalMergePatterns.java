import java.util.PriorityQueue;
import java.util.*;

class OptimalMergePatterns {

    public static int mergeCost(int[] files) {
        int cost = 0;

        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        
        for (int file : files) {
            minHeap.add(file);
        }

        
        while (minHeap.size() > 1) {
           
            int file1 = minHeap.poll();
            int file2 = minHeap.poll();

            
            int mergeCost = file1 + file2;

            
            cost += mergeCost;

            
            minHeap.add(mergeCost);
        }

        return cost;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of files:");
        int n=sc.nextInt();
        System.out.println("Enter file values:");
        int[] files = new int[n];
        for(int i=0;i<n;i++){
            files[i]=sc.nextInt();
        }

        int cost = mergeCost(files);

        System.out.println("Optimal Merge Cost: " + cost);
    }
}