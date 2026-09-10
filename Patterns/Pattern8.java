public class Pattern8{
    public static void main(String[] args) {
        pattern1(5);
    }
    static void pattern1(int n){
        for(int row=n; row >=1; row--){
            for(int col =1; col <=row; col++){
                System.out.print(row +" ");
            }
            System.out.println();
        }
    }
}