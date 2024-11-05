import java.util.Scanner;

class Dec2Hex
{
    public static int Arg1;
    public static void main(String args[])    {
        if(args.length == 0){
            System.out.println("Your input was empty, please enter a number");
            return;
        }
        try{
            Arg1 = Integer.parseInt(args[0]);
        }catch(NumberFormatException e){
            System.out.println(e);
            System.out.println("That is not a number, please enter a number");
            return;
        }
        String hexadecimal = convert(Arg1);

        System.out.print("Hexadecimal representation is: ");
        System.out.print(hexadecimal);

    }
    public static String convert(Object input) {
        if (input == null) {
            return "Your input was empty, please enter a number";
        }

        if (!(input instanceof Integer)) {
            return "That is not a number, please enter a number";
        }
        int num = (Integer) input;
        char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem;
        String hexadecimal="";
        System.out.println("Converting the Decimal Value " + num + " to Hex...");

        while(num != 0)
        {
            rem=num%16;
            hexadecimal= ch[rem] + hexadecimal;
            num= num/16;
        }

        return hexadecimal;
    }
}


