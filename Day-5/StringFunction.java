import java.util.*;

public class StringFunction {
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // String in = sc.nextLine();
        // System.out.println(in);


        String first = "Shivam";
        String last = "Patel";

        //Concatenantion
        String full = first+" "+last;
        System.out.println(full);


        //charAt & length()

        System.out.println(full.charAt(1));
        System.out.println(full.length());

        //compare
        String num1 = "Shivam";
        String num2 = "Shivam";

        System.out.println(num1.equals(num2));


        //substring(startIndex, endIndex)
        String sub = full.substring(0,5);
        System.out.println(sub);

        StringBuilder sb = new StringBuilder("Shivam");
        sb.append(" Patel");
        System.out.println(sb);

        sb.insert(6, " Kumar");
        System.out.println(sb);

        sb.delete(6, 12);
        System.out.println(sb);

        sb.insert(6, " Kumar");
        System.out.println(sb);
    }
}