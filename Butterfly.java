/*
*             *
* *         * *
*   *     *   *
*     * *     *
* * * * * * * *
*   *     *   *
* *         * *
*             *
 */
import java.util.*;
public class Butterfly
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((n&1)!=0)
                {
                    n-=1;
                }
                if(i+j==n-1 || i==j || j==0 || j==n-1 || i==(n/2))
                System.out.print("*"+" ");
                else
                System.out.print(" "+" ");
            }
            System.out.println();
        }
    }  
}