//insertion sort
import java.util.*;
public class week3_Q1 {

    void insertionSort(int[] a) {
        int ctr=0,flag=0;
        int n=a.length;
        for(int i=1;i<n;i++){
            ctr++;
            int j;
            j=i-1;
            int x=a[i];
            while (j>-1 && a[j]>x){
                ctr++;
                a[j+1]=a[j];
                flag++;
                j--;
            }
            a[j+1]=x;
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("Shifts = "+ctr);
         System.out.println("Comparison = "+flag);
    }

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int t=in.nextInt();
        for(int j=0;j<t;j++){
            int n=in.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=in.nextInt();
            }
            week3_Q1 obj=new week3_Q1();
            obj.insertionSort(a);
        }
    }
}