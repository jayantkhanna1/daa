import java.util.*;
class week5_Q3 {
    /* Function prints Intersection of arr1[] and arr2[]
       m is the number of elements in arr1[]
       n is the number of elements in arr2[] */
    static void printIntersection(int arr1[], int arr2[], int m, int n)
    {
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j])
                i++;
            else if (arr2[j] < arr1[i])
                j++;
            else {
                System.out.print(arr2[j++] + " ");
                i++;
            }
        }
    }
 
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt();
            int m=in.nextInt();
            int arr1[]=new int[n];
            int arr2[]=new int[m];
            for(int i=0;i<n;i++)
            {
                arr1[i]=in.nextInt();
            }
            for(int i=0;i<m;i++)
            {
                arr2[i]=in.nextInt();
            }
            printIntersection(arr1, arr2, n, m);
        }
    }
}