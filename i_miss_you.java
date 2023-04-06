import java.util.Scanner;
public class i_miss_you {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("enter age:");
        int age=sc.nextInt();
        int i=0;
        switch(age){
            case 1: if(age<=18){
                for(i=0;i<3;i++){
                    System.out.println("i miss you");
                }
            }
            break;
            case 2: if(age>18-21){
                for(i=0;i<8;i++){
                    System.out.println("i miss you");
                }
            }
            break;
            case 3: if(age>22-25){
                for(i=0;i<18;i++){
                    System.out.println("i miss you");
                }
            }
            break;
            case 4: if(age>26){
                for(i=0;i<109;i++){
                    System.out.println("i can't leave with out you");
                }
            }
            break;

        }
    }
}
