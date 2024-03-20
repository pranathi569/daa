import java.util.*;

public class quiSort {
      public static void quicksort(int a[],int lb,int ub) {
          int left=lb;
          int right=ub;
          int pivot=left;
          int temp;
          while(left<right) {
           while((a[right]>a[pivot])&&(pivot!=right)) {
                right--;
             }
             if(pivot!=right) {
                  temp=a[pivot];
                  a[pivot]=a[right];
                  a[right]=temp;
                  pivot=right;
            }
            while((a[pivot]>a[left]&&(left!=pivot))) {
                 left++;
              }
              if(left!=pivot) {
                   temp=a[left];
                   a[left]=a[pivot];
                   a[pivot]=temp;
                    pivot=left;
               }
           }
           if(lb<pivot) {
                 quicksort(a,lb,pivot-1);
           }
           if(pivot<ub) {
                 quicksort(a,pivot+1,ub);
           }
      }

      public static void main(String[] args) {
            // TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter no.of elements:");
      int n=sc.nextInt();
      System.out.println("Enter elements:");
      int a[]=new int[n];
      for(int i=0;i<n;i++) {
          a[i]=sc.nextInt();
      }
      System.out.println("\nBefore Sorting");
      for(int i=0;i<n;i++) {
         System.out.print(a[i]+" ");
      }
      quicksort(a,0,n-1);
      System.out.println("\nAfter Sorting");
      for(int i=0;i<n;i++) {
         System.out.print(a[i]+" ");
      }
            

      }

}