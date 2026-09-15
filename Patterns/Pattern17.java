public class Pattern17 {
    public static void main(String[] args) {
        pattern17(5);
        
    }
    static void pattern17(int n){
        for(int row=1; row<=n; row++){
            for(int space=1; space<=n-row; space++){
                System.out.print(" ");
            }
            for(int star=1; star<= 2*row-1; star++){
                if(star<=row)
                 System.out.print("*");
            }
            System.out.println();
        }
        for(int row=n-1; row>0;row--){
            for(int space=1; space<=n-row; space++){
                System.out.print(" ");
            }
            for(int star=1; star<=2*row-1; star++){
                if(star<=row)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
