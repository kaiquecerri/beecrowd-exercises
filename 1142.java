import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int lines = input.nextInt();
        
        for(int i = 1; i <= lines*4; i++) {
            if (i%4 == 0) {
                System.out.println("PUM");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
