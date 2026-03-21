import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        float salary = input.nextFloat();
        double taxTotal = 0;

        
        if (salary <= 2000) {
            taxTotal = 0;
        } else if (salary <= 3000) {
            taxTotal = 0.08 * (salary - 2000);
        } else if (salary <= 4500) {
            double v1 = salary - 3000;
            double v2 = salary - (2000 + v1);
            taxTotal = v1 * 0.18 + v2 * 0.08;
        } else {
            double v1 = salary  - 4500;
            double v2 = salary - (3000 + v1);
            double v3 = salary - (2000+v1+v2);
            taxTotal = v1 * 0.28 + v2 * 0.18 + v3 * 0.08;
        }
        


        if (taxTotal == 0) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f\n", taxTotal);
        }

    }
 
}
