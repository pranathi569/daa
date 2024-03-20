import java.util.*;
import java.lang.*;
class DataObject
{
    double profit;
    double weight;
    double pw;

}
public class KnapsackDemo{
    DataObject d[];
    double max,s=0;
    int n=0,k=0;
    Scanner sc;
    public KnapsackDemo(){
        sc=new Scanner(System.in);
        System.out.println("enter no.of objects");
        n=sc.nextInt();
        System.out.println("enter max val");
        max=sc.nextDouble();
        d=new DataObject[n];
        for (int i=0;i<n;i++){
            d[i]=new DataObject();
            System.out.println("enter profit");
            d[i].profit=sc.nextDouble();
            System.out.println("enter weight");
            d[i].weight=sc.nextDouble();
        }
    }
    public void calculate(){
        for(int i=0;i<n;i++){
            d[i].pw=d[i].profit/d[i].weight;
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(d[i].pw<d[j].pw){
                    DataObject temp=d[i];
                    d[i]=d[j];
                    d[j]=temp;
                }
               
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(d[i].profit);
        }
       
        while(max>0){
            if(max>=d[k].weight)
            {
                max=max-d[k].weight;
                s+=d[k].profit;
            }
            else{
                s+=(max*d[k].profit/d[k].weight);
                max=0;
            }
            k++;
        }
        System.out.println("final profit:"+s);
    }
    public static void main(String a[]){
        KnapsackDemo k=new KnapsackDemo();
        k.calculate();
    }
}