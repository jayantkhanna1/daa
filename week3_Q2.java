import java.util.*;
public class week3_Q2{
    void selectionsort(int a[]){
        int n=a.length;
        int ctr=0,flag=0,k;
        for (int i=0;i<n;i++){
            ctr++;
            for(int j=i+1;j<n;j++){
                flag++;
                if(a[i]>a[j]){
                
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
            for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Shifts = "+ctr);
         System.out.println("Comparison = "+flag);

    }
    public static void main(String args[]){
        Scanner in =new Scanner(System.in);
        int t=in.nextInt(); 
        for(int j=0;j<t;j++){
            int n=in.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=in.nextInt();
            }
            week3_Q2 obj=new week3_Q2();
            obj.selectionsort(a);
        }
    }
}