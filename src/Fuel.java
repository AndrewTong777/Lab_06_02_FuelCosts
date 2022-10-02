import java.util.Scanner;

public class Fuel
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println(" gallons number of gas in tank ");
        float gallons = scan.nextFloat();
        System.out.print("fuel efficiency in miles per gallon");
        int eff = scan.nextInt();
        System.out.print("price of gas per gallon");
        float price = scan.nextFloat();
        if(gallons<=0&&eff<=0&&price<=0)
        {
            System.out.println("enter valid input");
        }
        else
        {
            System.out.println(" cost per 100 miles for the given gas price "+price+ " is " + (price * 100) );
            System.out.println("miles distance of the car can go with the gas in the tank is" + (int)(eff * gallons));
        }

    }
}