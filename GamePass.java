public class GamePass {
    public static void main(String args[])
    {
        int a[]={9,8,8,0,1,2,7,4,3,1};
        int sum=0;
        int i=0,pass=1;
        for(;i<=9;i++)
        {
            sum=sum+a[i];
            if(sum%2==0)
            {
                System.out.println(sum+"pass"+pass++);
                sum=0;
            }}

    }
}