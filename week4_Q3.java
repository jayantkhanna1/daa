import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
class week4_Q3 {
    public static int kthSmallest(Integer[] arr,int k)
    {
        Arrays.sort(arr);
        return arr[k - 1];
    }
    public static void main(String[] args)
    {
        Scanner in =new Scanner(System.in);
        int t=in.nextInt();
        for(int j=0;j<t;j++){
            int n=in.nextInt();
            Integer[] arr = new Integer[n];
            for(int i = 0; i < n; i++){
                arr[i] = in.nextInt();
            }
            int key=in.nextInt();   
            System.out.println(kthSmallest(arr,key));
        }
    }
}