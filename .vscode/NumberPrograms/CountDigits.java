public class CountDigits {
    public static void main(String[] args) {
        int n=1234;
        int count =0;
        //first approach
        // int count = 0;
        // for(int i=1; i<=count; i++){
        //     count = i;
            
        // }
        // System.out.println(count);

        while(n>0){
            n=n/10;
            count++;

        }
        System.out.println(count);
    }
}
