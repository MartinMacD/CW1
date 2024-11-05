import java.util.Scanner;

class Dec2Hex
{
    public static int Arg1;
    public static void main(String args[])    {
        Arg1 = Integer.parseInt(args[0]);
        String hexadecimal = convert(Arg1);
	
	System.out.println("Hexadecimal representation is: ");
        System.out.println(hexadecimal);

    }
    public static String convert(Object input) {
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


