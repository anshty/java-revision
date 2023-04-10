public class patten_11 {
    public static void main(String[] args) {
        int i=1;
        int j=1;
        int n=5;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                if(i==1||j==1||j==i||i==n){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }for(i=n;i>=1;i--){
            for(j=1;j<=i;j++){
                if(i==n||j==1||j==i){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
