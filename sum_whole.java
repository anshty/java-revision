import java.util.*;
public class sum_whole {
    public static void main(String[] args) {
     Scanner sc=new Scanner (System.in);
        System.out.println("enter natural number:");
     int n=sc.nextInt();
     int i=1;
     int sum=0;
     for(i=1;i<=n;i++){
         sum=sum+i;
     }
        System.out.println(sum);
    }
}
