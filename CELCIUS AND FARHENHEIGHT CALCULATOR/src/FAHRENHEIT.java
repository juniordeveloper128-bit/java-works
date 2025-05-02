import java.util.Scanner;
public class FAHRENHEIT{
    double C;
    double F;
Scanner Sc =new Scanner(System.in);
    public double getF() {
        C=Sc.nextDouble();
        F=(((5*C)-32)/9);
        return F;
    }
}







