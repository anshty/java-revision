public class patten_bob_style {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        int n = 5;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (i = n; i >= 1; i--) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (j = i; j >= 1; j--) {
               if(j==i||j==1||i==n||i==1) {
                   System.out.print(j);
               }else{
                   System.out.print(" ");
               }
            }
            for (j = 2; j <= i; j++) {
              if(j==1||i==1||j==i||i==n)  {
                  System.out.print(j);
              }else{
                  System.out.print(" ");
              }
            }
            System.out.println();
        }
    }
}
