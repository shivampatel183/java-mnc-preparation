public class DecimalToBinary{
    public static void main(String args[]){
        DecimalToBinary d2b = new DecimalToBinary();
        System.out.println(d2b.decimalToBinary(150));
        System.out.println(d2b.binaryToDecimal(10010111));
        System.out.println(15/3*5);

    }

    public long decimalToBinary(int n){
        int i=1;
        long res = 0;
        while(n>0){
            int rem = n%2;
            n/=2;
            res+=(rem*i);
            i*=10;
        }
        return res;
    }

    public int binaryToDecimal(long n){
        int res = 0;
        int i=1;
        while(n>0){
            long rem = n%10;
            res+=((int)rem*i);
            n/=10;
            i*=2;
        }
        return res;
    }
}