import java.util.*;
public class week2_Q2{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        String ans[]=new String[t];
        for (int j=0;j<t;j++){
            ans[j]="No sequence found";
        }
        for (int r=0;r<t;r++){
            int size=in.nextInt();
            int arr[]=new int [size];
            for(int i=0;i<size;i++){
                arr[i]=in.nextInt();
            }
            for(int i=0;i<size;i++){
                for(int j=i+1;j<size;j++){
                    for(int k=j+1;k<size;k++){
                        if(arr[i]+arr[j]==arr[k]){
                            ans[r]=(i+1)+","+(j+1)+","+(k+1);
                            break;
                        }
                    }
                }
            }
        }
        for (int j=0;j<t;j++){
            System.out.println(ans[j]);
        }
    }
}