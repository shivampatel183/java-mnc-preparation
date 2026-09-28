public class Recursion{
    
    public static void main(String[] args){
        System.out.println(factorial(8));
        printFibonacci(10);
        System.out.println(fibbonacciTerm(8));
    }

    public static int factorial(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return n*factorial(n-1);
    }

    public static void printFibonacci(int n){
        int p1 = 1;
        int p2 = 1;
        System.out.println(0);
        for(int i=0; i<n; i++){
            if(i<2){
                System.out.println(1);
                continue;
            }
            System.out.println(p1 + p2);
            int temp = p1;
            p1=p2;        
            p2+=temp;
        }
    }

    public static int fibbonacciTerm(int n){
        if(n==0)return 0;
        if(n==1)return 1;

        return fibbonacciTerm(n-1)+fibbonacciTerm(n-2);
    }

    public static void arraySubset(int[] arr)
    {
        if()
    }
}