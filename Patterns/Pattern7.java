public class Pattern7 {
    public static void main(String[] args) {
        pattern1(5);
    }
    static void pattern1(int n){
        for(int row=n; row >0; row--){
            for(int col =1; col <=row; col++){
                System.out.print(col +" ");
            }
            System.out.println();
        }
    }
}