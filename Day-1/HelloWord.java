public class HelloWord{

    public static void main(String[] args){
        System.out.println("Hello Word!!!");

        Calculator calculator = new Calculator();
        System.out.println();

        System.out.println(calculator.sum(9,5));
        System.out.println(calculator.sub(9,5));
        System.out.println(calculator.multi(9,5));
        System.out.println(calculator.div(9,5));

        TempConverter tempConverter = new TempConverter();

        System.out.println();
        System.out.println("C2F : " + tempConverter.convertC2F(120));
        System.out.println("C2K : " + tempConverter.convertC2K(120));
        System.out.println("F2C : " + tempConverter.convertF2C(120));
        System.out.println("F2K : " + tempConverter.convertF2K(120));
        System.out.println("K2F : " + tempConverter.convertK2F(120));
        System.out.println("K2C : " + tempConverter.convertK2C(120));


    }
}