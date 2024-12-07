import java.util.*;
public class MissingElement 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int s=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            s+=arr[i]; 
        }
        int res=((n+1)*(n+2))/2;
        System.out.println(res-s);
    }
    
}