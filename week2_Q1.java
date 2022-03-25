import java.util.*;
public class week2_Q1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        String ans[]=new String[t];
        for (int j=0;j<t;j++){
            int size=in.nextInt();
            int arr[]=new int [size];
            for(int i=0;i<size;i++){
                arr[i]=in.nextInt();
            }
            int key=in.nextInt();
            int flag=0;
            for(int i=0;i<size;i++){
                if(arr[i]==key)
                    flag++;
            }
            ans[j]= key + " - "+ flag;
        }
        for (int j=0;j<t;j++){
            System.out.println(ans[j]);
        }
    }
}