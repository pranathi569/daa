import java.util.*;

public class binarySearch{
    public static int bsearch(int a[],int n,int key){
        int lb=0;
        int ub=n-1;
       
        while(lb<=ub){
            int mid=(lb+ub)/2;
            if(a[mid]==key)
               return mid;
            else if(a[mid]<key)
               lb=mid+1;
            else
              ub=mid-1;
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of elements:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter key value:");
        int key=sc.nextInt();
        int s=bsearch(a,n,key);
        if(s==-1)
          System.out.println("Element not found");
        else
          System.out.println("Element found at "+s);
    }
}