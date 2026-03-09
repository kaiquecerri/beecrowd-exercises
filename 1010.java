import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        
        int p1Code = input.nextInt();
        int p1Units = input.nextInt();
        float p1Price = input.nextFloat();
        
        int p2Code = input.nextInt();
        int p2Units = input.nextInt();
        float p2Price = input.nextFloat();
        
        float total = (p1Units * p1Price) + (p2Units * p2Price);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);  
    }
 
}
