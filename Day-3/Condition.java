public class Condition{

    public static void main(String[] args){
        int a=5;
        if(a<2);
        {
            System.out.println(a);
        }

        boolean bol=false;
        if(bol=true){
            System.out.println(bol);
        }

        switch(a){
            default:
                System.out.println("default");
            case 5:
                System.out.println("5");
            case 6:
                System.out.println("6");
                break;
            case 7:
                System.out.println("7");

        }


        // outerLoop:
        // for (int i = 1; i <= 3; i++) {
        //     for (int j = 1; j <= 3; j++) {
        //         if (i == 2 && j == 2) {
        //             break outerLoop; // Exits the outer loop completely
        //         }
        //         System.out.print(i + "->" + j + " ");
        //     }
        // }

        // while(false){
        //     System.out.println("while exe");
        // }
        if(false){
            System.out.println("while exe");
        }
        
        for (;;) {
            System.out.println("Running");
            break;
        }
        for (byte b = 0; b < 130; b++) {
            System.out.print(b + " ");
        }
    }
}