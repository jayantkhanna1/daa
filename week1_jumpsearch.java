//make a proram to make jump search
import java.util.*;
public class week1_jumpsearch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to be searched : ");
        int key = sc.nextInt();
        int jump = (int)Math.floor(Math.sqrt(n));
        int i = 0;
        while(i<n && arr[i]<key){
            i = i+jump;
        }
        if(i<n && arr[i]==key){
            System.out.println("key found at index "+(i+1));
        }
        else{
            System.out.println("key not found");
        }
    }
}