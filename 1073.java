import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int counter = 2;
        while (counter <= num) {
            if (counter%2 == 0) {
                System.out.printf("%d^2 = %d\n",counter, counter*counter);
            }
            counter++;
        }
 
    }
 
}
