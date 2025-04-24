public class Equality {
    public static void main(String[]args)
    {

        int[] arr1={10,20,30,40,50};
        int[] arr2={10,20,30,40,50};
        boolean isEqual=true;

        //Equality in array its means two array are equal or not equal
        if(arr1.length==arr2.length)
        {
            for(int i=0;i<arr1.length;i++)
            {
                if(arr1[i]!=arr2[i])
                { 
                    isEqual=false;
                }
            }
        } 
        else
        {
            isEqual=false;
        }   
        if(isEqual==true)
        {
            System.out.println("Array are equal:");
        }
        else
        {
            System.out.println("Array are not equal:");
        }


    }
}
