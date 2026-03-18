import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        
        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();
        
        if(A == 0) {
                System.out.println("Impossivel calcular");
            } 
            else {
            
            double delta = (B*B) - (4*A*C);
            
            if(delta < 0) {
                System.out.println("Impossivel calcular");
            } 
            else {
                double R1 = ((-B) + Math.sqrt(delta))/(2*A);
                double R2 = ((-B) - Math.sqrt(delta))/(2*A);
                
                System.out.printf("R1 = %.5f\nR2 = %.5f\n", R1, R2);
                
            }
        }
    }
 
}
