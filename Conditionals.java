public class Conditionals {
    public static void main(String[] args) {


        boolean rain =false;
        boolean umbrella = true;
        boolean raincoat = false;

        if(rain ==true && umbrella==true){
            System.out.println("Its raining and you can go out with an umbrella");
        }
        else if(rain ==true && raincoat == true){
            System.out.println("Its raining and you can go out with a raincoat");
        }
        else  if(rain ==true && raincoat==false && umbrella==false){
            System.out.println("Its raining and you can not go out");
        }
        else{
            System.out.println("Its not raining you can go out");
        }

        // odd or even

        // int a =75;
        // if(a%2!=0){
        //     System.out.println("number is odd");
        // }
        // else{
        //     System.out.println("number is even");
        // }

        // expression => evaluated futher
        // int result = 8+9*8-67;
        // boolean res= 5<9 &&8>90 &&56>=90;
        // if-else
        // int a =90;
        // int b=78;
        // if(a>b){
        //     int c=89;
        //     System.out.println(c);
        // }
        // else{
        //     int d = 98;
        //     System.out.println(d);
        // }

        // block  => defines a boundary
        // {
        //    int a=90; 
        //    System.out.println(a);
        // }
      
    }
}
