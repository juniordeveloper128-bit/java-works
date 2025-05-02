import java.awt.*;
import java.util.Scanner;
public class CFCALCULATOR {
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);

//Define the objects as follows
        FAHRENHEIT f =new FAHRENHEIT();
        CELSIUS c=new CELSIUS();

System.out.println("------------------CELSIUS AND FARHENHEIT CONVERSION---------------------- ");

System.out.println("choose the type of conversion");
System.out.println("1-Celsius degree to fahrenheit\n2-Fahrenheit to celsius degree\n");
int Choice=Sc.nextInt();

switch (Choice){
    case 1:System.out.println("-------------------CONVERSION FROM FAHRENHEIT TO CELSIUS DEGREE----------------------");
    System.out.print("Enter the fahrenheit value: ");
c.getC();
System.out.println();
//        System.out.println();
break;
}
    }
}