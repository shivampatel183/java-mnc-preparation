public class Operator{

    int instanceVar; // Defaults to 0

    public void display() {
        int localVar; // Explicitly initialized
        System.out.println(instanceVar); // Prints 0
        // System.out.println(localVar);    // error 
    }

    int x = 10;

    public void printX() {
        int x = 20;
        System.out.println(x);
    }

    public static void main(String[] args){
        int a = 5;
        a=a++;
        System.out.println(a);


        int i = 5;
        long j = 10;
        // i=i+j; //compile time error
        i+=j; //i=15
        System.out.println(i);

        Operator op = new Operator();
        op.display();

        op.printX();
    }
}