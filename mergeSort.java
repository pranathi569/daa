import java.util.*;

public class mergeSort{
    public static void mergepass(int a[],int lb,int ub){
        if(lb!=ub){
            int mid=(lb+ub)/2;
            mergepass(a,lb,mid);
            mergepass(a,mid+1,ub);
            mergesort(a,lb,mid,ub);
        }
    }
    public static void mergesort(int a[],int l,int m,int u){
        int temp[]=new int[a.length];
        int i=l;
        int j=m+1;
        int k=l;
        while((i<=m)&&(j<=u)){
            if(a[i]<a[j])
              temp[k++]=a[i++];
            else
               temp[k++]=a[j++];
        }
        while(i<=m)
          temp[k++]=a[i++];
        while(j<=u)
          temp[k++]=a[j++];
        for(int p=l;p<=u;p++){
            a[p]=temp[p];
        }
    }
    public static void main(String args[]) {
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
    mergepass(a,0,n-1);
    System.out.println("\nAfter Sorting");
    for(int i=0;i<n;i++) {
     System.out.print(a[i]+" ");
    }
    }
}