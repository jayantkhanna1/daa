import java.util.*;
public class week1_binarysearch{
    public static void main(String args[]){
        int t;
        Scanner in =new Scanner(System.in);
        t=in.nextInt();
        while (t>0){
            int size=in.nextInt();
            int arr[]=new int[size];
            for (int i =0;i<size;i++)
            {
                arr[i]=in.nextInt();
            }
            int key=in.nextInt();
            int first=0;int last=size;
            int mid = (first + last)/2;  
            while( first <= last ){  
                    if ( arr[mid] < key){  
                        first = mid + 1;   
                    }else if ( arr[mid] == key ){  
                        System.out.println("Present " + mid);  
                        break;  
                    }else{  
                        last = mid - 1;  
                    }  
                    mid = (first + last)/2;  
            }  
            if ( first > last ){  
                System.out.println("Not Present "+size);  
            }
            t--;
        }          
    }
}
