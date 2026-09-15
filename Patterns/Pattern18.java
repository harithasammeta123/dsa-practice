public class Pattern18 {
    public static void main(String[] args) {
        pattern18(5);
    }
    static void pattern18(int n){
        for(int row=1; row<=n; row++){
            for(int space=1; space<=n-row; space++){
                System.out.print("-");
            }
            for(int star=1; star<=2*row-1; star++){
                if(star>=row)
                    System.out.print("*");
            }
            System.out.println();
                
        }
    }
}
