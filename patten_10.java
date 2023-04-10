public class patten_10 {
    public static void main(String[] args) {
        int i=1;
        int j=1;
        int n=5;
        for(i=n;i>=1;i--){
            for(j=1;j<=i;j++){
                if(j==1||i==n||j==i){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                if(i==1||j==1||j==i||i==n){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
