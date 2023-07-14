import java.util.*;

class Solution
{
    public void minmax(int n,int[] array,int max,int min)
    {
        int latestminindex=-1;
        int latestmaxindex=-1;
        int result=n;
        for(int i=0;i<n;i++)
        {
            if(array[i]==min)
            {
                latestminindex=i;
                if(latestmaxindex>=0)
                {
                    result=Math.min(result,i-latestmaxindex+1);
                }
            }
            if(array[i]==max)
            {
                latestmaxindex=i;
                if(latestminindex>=0)
                {
                    result=Math.min(result,i-latestminindex+1);
                }
            }
        }
        System.out.println(result);

    }
}

class ClosestMinMax
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] array=new int[n];
        int[] sample=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=scanner.nextInt();
            sample[i]=array[i];
        }
        Arrays.sort(sample);
        int max=sample[n-1];
        int min=sample[0];
        Solution solution =new Solution();
        solution.minmax(n,array,max,min);
    }
}

