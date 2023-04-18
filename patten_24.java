public class patten_24 {
    public static void main(String[] args) {
        int i=1;
        int j=1;
        int n=5;
        for(i=1;i<=n;i++){
            //space
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }//inner
            for(j=i;j>=1;j--){
                System.out.print(j);
            }for(j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
