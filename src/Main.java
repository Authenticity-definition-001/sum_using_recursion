class sum
{
    public static void summ(int i,int n,int sum)
    {
        if(i==n)
        {
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        summ(i+1,n,sum);
    }
    public static void main(String[] args)

    {
        summ(1,5,0);
    }
}