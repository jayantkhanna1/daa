//make a program to search for 2 numbers in array whose sum is equal to a given number.
import java.util.*;
public class week5_Q2{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=in.nextInt();
            }
            int sum=in.nextInt();
            Arrays.sort(arr);
            int i=0,j=arr.length-1;
            while(true){
                if(arr[i]+arr[j]==sum){
                    System.out.print(arr[i]+" "+arr[j]+", ");
                    i++;
                }
                else if(arr[i]+arr[j]<sum){
                    i++;
                }
                else if(i==j-1){
                    break;
                }
                else{
                    j--;
                }

            }
        }
    }
}