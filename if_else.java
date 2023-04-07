import java.util.Scanner;
public class if_else {
    //wap to find given yrs is leap yrs or not
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter year:" );
        int yrs=sc.nextInt();
        if(yrs%4==0){
            System.out.println(yrs+" is a leapyear");
        }else{
            System.out.println(yrs+" is not a leapyear");
        }

    }
}
