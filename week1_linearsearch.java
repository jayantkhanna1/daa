import java.util.*;
public class week1_linearsearch{
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
            int flag=0,flag2=0;
            for (int i =0;i<size;i++)
            {
                flag++;
                if (arr[i]==key){
                    flag2++;
                    System.out.println("Present "+flag);
                }
            }
            if (flag2==0)
                System.out.println("Not Present "+flag);
            t--;
        }
    }
}