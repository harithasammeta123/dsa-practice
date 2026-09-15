public class ProductOfDigits {
    public static void main(String[] args) {
        int n=12345;
        int product=1;

        while(n>0){
            int digit = n%10;
            product = product * digit;
            n = n/10;
        }
        System.out.println(product);
    }
}
