public class name_pattern02 {
    public static void main(String[] args) {
        int i=1;
        int j=1;
        int n=4;
        int m=5;
        for(i=1;i<=n;i++){
            for(j=1;j<=m;j++){
                if(i==1||j==1||i==n||j==m){
                    System.out.print(" goju ");
                }else{
                    System.out.print("      ");
                }
            }
            System.out.println();
        }
    }
}
