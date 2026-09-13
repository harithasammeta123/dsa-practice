//Diamond pattern

public class Pattern16 {

    public static void main(String[] args) {
        pattern16(5);
        
    }
    static void pattern16(int n){

        //upper row
        for(int row=1; row<=n; row++){
            for(int space=1; space <= n-row; space++){
                System.out.print(" ");
            }
            for(int col=1; col<=2*row-1; col++){
                System.out.print("*");

            }
            System.out.println();

        }
        //Lower row
        for(int row=n-1; row>0; row--){
            for(int space=1; space<=n-row; space++){
                System.out.print(" ");
            }
            for(int col=1; col<=2*row-1; col++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
