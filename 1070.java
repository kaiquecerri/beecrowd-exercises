import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int limit = num + 12;
        
        if (num%2 == 0) {
            num += 1;
        }
        
        do {
            if (num%2 != 0)
            System.out.println(num);
            num++;
        } while (num < limit);
    }
}
