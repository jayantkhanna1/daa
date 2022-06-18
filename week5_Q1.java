import java.util.*;
class week5_Q1 
{ 
    void sort(char arr[]) 
    { 
        int n = arr.length; 
        char output[] = new char[n]; 
        int count[] = new int[256]; 
        for (int i=0; i<256; ++i) 
            count[i] = 0; 
        for (int i=0; i<n; ++i) 
            ++count[arr[i]]; 
        for (int i=1; i<=255; ++i) 
            count[i] += count[i-1]; 
        for (int i = n-1; i>=0; i--) 
        { 
            output[count[arr[i]]-1] = arr[i]; 
            --count[arr[i]]; 
        } 
        for (int i = 0; i<n; ++i) 
            arr[i] = output[i]; 
    } 
    public static void main(String args[]) 
    { 
        Scanner in =new Scanner(System.in);
        week5_Q1 ob = new week5_Q1(); 
        int t=in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt();
            char arr[]=new char[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=in.next().charAt(0);
            }
            ob.sort(arr);
            char current=arr[0],highest=arr[0];
            int flag1=1,flag2=0;
            for(int i=1;i<n;i++)
            {
                if(arr[i]==current)
                {
                    flag1+=1;
                }
                else
                {
                    if(flag2<flag1)
                    {
                        highest=current;
                        flag2=flag1;
                    }
                    current=arr[i];
                    flag1=1;
                }
            }
            if(flag2!=1)
            System.out.println(highest+" "+flag2);
            else
            System.out.println("No repeating elements");
        }
    } 
} 