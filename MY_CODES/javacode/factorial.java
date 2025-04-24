import java.util.Scanner;
public class factorial {
    public static void main(String[]args){
        int num;
        System.out.println("entre the element");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        System.out.println(num+"!="+fact);
    }
}
