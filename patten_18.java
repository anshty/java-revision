public class patten_18 {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        int n = 4;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            for (j = 1; j <= (n - i) * 2; j++) {
                System.out.print("   ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (i = n; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print(" * ");
            }for(j=1;j<=(n-i)*2;j++){
                System.out.print("   ");
            }for(j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

