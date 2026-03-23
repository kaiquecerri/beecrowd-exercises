import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        
        int tea = input.nextInt();
        
        int[] suppositions = {input.nextInt(), input.nextInt(), 
        input.nextInt(), input.nextInt(), input.nextInt()};
        
        int correctAnswers = 0;
        
        for(int i = 0; i < 5; i++) {
            if (suppositions[i] == tea) correctAnswers++;
        }
        
        System.out.println(correctAnswers);
    }
}
