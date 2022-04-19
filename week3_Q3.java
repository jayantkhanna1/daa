import java.util.*;
public class week3_Q3{
    void findDuplicate(int a[], int x)
    {
        for(int i=0;i<x;i++){
            for(int j=i+1;j<x;j++){
                if(a[i]==a[j]){
                    System.out.println("YES");
                }
                break;
            }
        }
        System.out.println("NO");
    }
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        int t=in.nextInt();
        for(int j=0;j<t;j++){
            int n=in.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=in.nextInt();
            }
            week3_Q3 obj=new week3_Q3();
            obj.findDuplicate(a,n);
        }
    }
}