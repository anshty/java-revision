public class name_pattern06 {
    public static void main(String[] args) {
        int i=1;
        int j=1;
        int n=5;
        for(i=n;i>=1;i--){
            for(j=1;j<=i;j++){
                if(i==n||j==1||j==i){
                    System.out.print(" goju ");
                }else{
                    System.out.print("      ");
                }
            }
            System.out.println();
        }
    }
}
