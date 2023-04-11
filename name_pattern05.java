public class name_pattern05 {
    public static void main(String[] args) {
        int i=1;
        int j=1;
        int n=5;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                if(i==1||j==1||j==i||i==n){
                    System.out.print(" goju ");
                }else{
                    System.out.print("      ");
                }
            }
            System.out.println(" ");
        }
    }
}
