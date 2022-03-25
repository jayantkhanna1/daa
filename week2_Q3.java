import java.util.*;
public class week2_Q3{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int ans[]=new int[t];
        for (int r=0;r<t;r++){
            int size=in.nextInt();
            int arr[]=new int [size];
            for(int i=0;i<size;i++){
                arr[i]=in.nextInt();
            }
            int key=in.nextInt();
            int flag=0;
            for(int i=0;i<size;i++){
                for(int j=i+1;j<size;j++){
                        if(Math.abs(arr[i]-arr[j])==key){
                            flag++;
                        }
                }
            }
            ans[r]=flag;
        }
        for (int j=0;j<t;j++){
            System.out.println(ans[j]);
        }
    }
}