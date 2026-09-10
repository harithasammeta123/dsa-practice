public class Pattern12 {
    public static void main(String[] args) {
        pattern1(5);
    }
    static void pattern1(int n){
        for(int row=n; row >=1; row--){
            //space
            for(int space=1; space <=n-row; space++){
                System.out.print(" ");
            }
            for(int col=1; col<=2*row-1; col++){
                System.out.print(col);
            }
            //space
            for(int space=1; space <=n-row-1; space++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}