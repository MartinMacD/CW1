import java.util.Scanner;

class Dec2Hex
{
    public static int Arg1;
    public static void main(String args[])    {
	//Used to check if the input is null
        if(args.length == 0){
            System.out.println("Your input was empty, please enter a number");
            return;
        }
	//Checks if the user input is a String, returns an error message if it is a String.
	//Otherwise converts args to an int.
        try{
            Arg1 = Integer.parseInt(args[0]);
        }catch(NumberFormatException e){
            System.out.println(e);
            System.out.println("That is not a number, please enter a number");
            return;
        }
	//Set hexadecimal to the converted number from Arg1
        String hexadecimal = convert(Arg1);
	
	//Print What the Hexadecimal representation is to the user.
        System.out.print("Hexadecimal representation is: ");
        System.out.print(hexadecimal);

    }
    public static String convert(Object input) {
	//Check if the input to convert is null or empty and retun an error message if it is.
        if (input == null) {
            return "Your input was empty, please enter a number";
        }

	//Check if the input isn't an integer, if it isn't then return an error message.
        if (!(input instanceof Integer)) {
            return "That is not a number, please enter a number";
        }
	//Perform Decimal to hexadecimal calculation
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
	//Return that hexadecimal number
        return hexadecimal;
    }
}


