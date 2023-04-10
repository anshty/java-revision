public class patten_05 {
    public static void main(String[] args) {
        int n=4;
        int j=1;
        int i=1;
        for(i=n;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}
