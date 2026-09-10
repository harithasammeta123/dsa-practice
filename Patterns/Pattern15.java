public class Pattern15{
    public static void main(String[] args) {
        pattern1(5);
    }
    static void pattern1(int n){
        for(int row=1; row <=n; row++){
            //space
            for(int space=1; space <=n-row; space++){
                System.out.print(" ");
            }
            for(int col=1; col<=2*row-1; col++){
                int value=n-col+1;
                if(value>0){
                    System.out.print(value);
                }
                else{
                    System.out.print(col-n+1);
                }
                // System.out.print(value);
            }
            //space
            for(int space=1; space <=n-row; space++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}