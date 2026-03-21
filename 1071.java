import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        
        if (x < y) {
            int temp = x;
            x = y;
            y = temp; 
        }
        
        double totalOdds = (int) Math.floor((x - y) /2)+1;
        
        int actValue = y;
        int total = 0;
        
        while (actValue < x) {
            if (actValue == y) actValue++;
            
            if (actValue % 2 != 0) {
                total += actValue;
                actValue += 2;
            } else {
                actValue += 1;
                total += actValue;
                actValue += 2;
            }
            
        }
        
        System.out.println(total);
    }
 
}
