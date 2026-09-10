public class Pattern10 {
    public static void main(String[] args) {
        pattern1(5);
    }
    static void pattern1(int n){
        for(int row=1; row <=n; row++){
            //space
            for(int space=1; space <=n-row-1; space++){
                System.out.print(" ");
            }
            for(int col=1; col<=2*row-1; col++){
                System.out.print("*");
            }
            //space
            for(int space=1; space <=n-row-1; space++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}