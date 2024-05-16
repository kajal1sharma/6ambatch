import java.util.Scanner;
// import java.lang.*;
class Switch{
    public static void main(String[] args) {
        
        // calculator

        int a =90;
        int b=80;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter + ,-, /,* ");
        char op = sc.next().charAt(0);
        // string => collection of chars
        // char, byte 
        // int a = sc.nextInt();
        // float b = sc.nextFloat();

        System.out.println(op);
        int result =0;
        switch(op){
            case '+': result = a+b;
                     System.out.println(result);
                     break;
            case '-': result = a-b;
                        System.out.println(result);
                        break;
            case '*': result = a*b;
                        System.out.println(result);
                        break;
            case '/': result = a/b;
                        System.out.println(result);
                        break;
            default : System.out.println("invalid input");
        }


        // int a=10;
        // switch (a+2) {
        //     case 10:System.out.println("case 10");
        //             break;
        //     case 12:System.out.println("case 12");
        //             break;
        //     case 3:System.out.println("case 3");
        //             break;
        //     case 1:System.out.println("case 1");
        //             break;
        //     case 100:System.out.println("case 100");
        //             break;
        //     default : System.out.println("default");
        // }
      
    }
}