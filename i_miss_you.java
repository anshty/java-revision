import java.util.Scanner;
public class i_miss_you {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age:");
        int age = sc.nextInt();
        int i = 1;
        if(age<=18){
            for(i=1;i<=5;i++){
                System.out.println("i miss you");
            }
        }if(age>=18||age>=22){
            for(i=1;i<=10;i++){
                System.out.println("i miss you");
            }
        }if(age<=23||age>=25){
            for(i=1;i<=15;i++){
                System.out.println("i miss you");
            }
        }if(age<=26||age>=28){
            for(i=1;i<=20;i++){
                System.out.println("i can't leave with out you");
            }
        }if(age<=29){
            for(i=1;i<=50;i++) {
                System.out.println("i will die with out you");
            }
        }
    }
}