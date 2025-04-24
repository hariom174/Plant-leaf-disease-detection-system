public class Arrayspecific {
    public static boolean contains(int[] arr1,int item)
    {
        for(int n:arr1)
        {
            if(item==n)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[]args)
    {
        int[] arr1={10,20,30,40,50};
        System.out.println(contains(arr1,10));
        System.out.println(contains(arr1,12));
    }
}
