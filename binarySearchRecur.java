import java.util.*;

public class binarySearchRecur{
    public static int bsearch(int a[],int lb,int ub,int key){
       
        if(ub>=lb&&lb<=a.length-1){
            int mid=(lb+ub)/2;
            if(a[mid]==key)
               return mid;
            else if(a[mid]>key)
               return bsearch(a,lb,mid-1,key);
            else
              return bsearch(a,mid+1,ub,key);
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
        int s=bsearch(a,0,n-1,key);
        if(s==-1)
          System.out.println("Element not found");
        else
          System.out.println("Element found at "+s);
    }
}