import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        
        boolean _continue = true;
        
        while(_continue) {
            int A = input.nextInt();
            if(A == 0) {
                _continue = false;
                break;
            }
            int B = input.nextInt();
            int C = input.nextInt();
            
            int lado = (int) Math.sqrt( (A * B * 100) / C );
            
            System.out.println(lado);
        }
    }
 
}
